package cn.heypai.util;

import com.baidu.aip.face.AipFace;
import com.google.common.collect.Maps;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * @author three
 * @since 2019-12-08 16:24
 * <p>
 * 百度人脸搜索
 * </p>
 */
public class BaiDuUtil {
	private static final String  APP_ID     = "17968210";
	private static final String  API_KEY    = "0Pi3GFqh0zS6g4eqzWIjHuvi";
	private static final String  SECRET_KEY = "D9ikMHTatYz1v9tt3Sfs3bvDwETAqocT";
	// 初始化一个AipFace
	private static final AipFace client     = new AipFace(APP_ID, API_KEY, SECRET_KEY);

	public static void main(String[] args) {
		String groupId = "secondGroup";
		// String faceUrl = "http://cdn.zhaopian.live/lgPl1NbjzeoJS1Q-D22azny9RShT?imageMogr2/thumbnail/750";
		// System.out.println(addFaceToGroup(faceUrl, groupId, "1"));//febd2f792d86d87e4433d5f56150f05c

		// System.out.println(search(faceUrl, groupId));

		System.out.println(createFaceGroup(groupId));

	}

	/**
	 * 人脸检测
	 *
	 * @param image
	 * @return
	 */
	private static String detect(String image) {
		// 调用接口
		// String image = "http://cdn.zhaopian.live/lgPl1NbjzeoJS1Q-D22azny9RShT?imageslim";
		// String image     = "http://cdn.zhaopian.live/lpQugTLQN5S6yeWbxWrwjVnBF5zY?imageMogr2/thumbnail/750";
		String imageType = "URL";

		// 人脸检测
		JSONObject res = client.detect(image, imageType, null);
		return res.toString();
	}


	/**
	 * 创建人脸组
	 * 关于人脸库的设置限制
	 * <p>
	 * 每个开发者账号可以创建100个appid；
	 * 每个appid对应一个人脸库，且不同appid之间，人脸库互不相通；
	 * 每个人脸库下，可以创建多个用户组，用户组（group）数量没有限制；
	 * 每个用户组（group）下，可添加无限个user_id，无限张人脸（注：为了保证查询速度，单个group中的人脸容量上限建议为80万）；
	 * 每个用户（user_id）所能注册的最大人脸数量20；
	 * 提醒：每个人脸库对应一个appid，一定确保不要轻易删除后台应用列表中的appid，删除后则此人脸库将失效，无法进行任何查找！
	 *
	 * @param groupName
	 * @return
	 */
	private static String createFaceGroup(String groupId) {
		// 传入可选参数调用接口
		HashMap<String, String> options = Maps.newHashMap();

		// 创建用户组
		JSONObject res = client.groupAdd(groupId, options);
		return res.toString(2);
	}

	/**
	 * 添加人脸到人脸组
	 *
	 * @param url
	 * @param groupId
	 * @return
	 */
	private static String addFaceToGroup(String image, String groupId, String userId) {
// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("user_info", "user's info");
		options.put("action_type", "APPEND");

		String imageType = "URL";

		// 人脸注册
		JSONObject res = client.addUser(image, imageType, groupId, userId, options);
		return res.toString(2);
	}

	/**
	 * 人脸搜索
	 *
	 * @param image
	 * @param groupId
	 * @return
	 */
	private static String search(String image, String groupIdList) {
		// 传入可选参数调用接口
		HashMap<String, String> options = new HashMap<String, String>();
		options.put("max_user_num", "50");

		String imageType = "URL";

		// 人脸搜索
		JSONObject res = client.search(image, imageType, groupIdList, options);
		return res.toString(2);
	}

}
