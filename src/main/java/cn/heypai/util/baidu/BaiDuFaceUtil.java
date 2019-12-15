package cn.heypai.util.baidu;

import cn.heypai.util.baidu.model.BaiDuBaseResponse;
import cn.heypai.util.baidu.model.response.BaiDuAddFaceResponse;
import cn.heypai.util.baidu.model.response.BaiDuSearchFaceResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.baidu.aip.face.AipFace;
import com.google.common.collect.Maps;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * @author three
 * @since 2019-12-08 17:47
 * <p>
 *
 * </p>
 */
public class BaiDuFaceUtil {
	// 初始化一个AipFace
	private final AipFace client;

	public BaiDuFaceUtil(String APP_ID, String API_KEY, String SECRET_KEY) {
		this.client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
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
	 */
	public BaiDuBaseResponse<Void> createFaceGroup(String groupId) {
		// 传入可选参数调用接口
		HashMap<String, String> options = Maps.newHashMap();

		// 创建用户组
		JSONObject res = client.groupAdd(groupId, options);
		return convert(res);
	}

	/**
	 * 添加人脸到人脸组
	 *
	 * @param groupId
	 * @return
	 */
	public BaiDuBaseResponse<BaiDuAddFaceResponse> addFaceToGroup(String imageUrl, String groupId, String userId) {
		HashMap<String, String> options = Maps.newHashMap();
		options.put("user_info", "user's info");
		options.put("action_type", "APPEND");

		String imageType = "URL";

		// 人脸注册
		JSONObject res = client.addUser(imageUrl, imageType, groupId, userId, options);
		return convert(res);
	}


	/**
	 * 人脸搜索
	 *
	 * @param imageUrl
	 * @return
	 */
	public BaiDuBaseResponse<BaiDuSearchFaceResponse> search(String imageUrl, String groupIdList) {
		// 传入可选参数调用接口
		HashMap<String, String> options = Maps.newHashMap();
		options.put("max_user_num", "50");

		String imageType = "URL";

		// 人脸搜索
		JSONObject res = client.search(imageUrl, imageType, groupIdList, options);
		return convert(res);
	}

	private static <T> BaiDuBaseResponse<T> convert(JSONObject result) {
		return JSON.parseObject(result.toString(), new TypeReference<BaiDuBaseResponse<T>>() {});
	}
}
