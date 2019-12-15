package cn.heypai.util.baidu.errorcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author three
 * @since 2019-12-08 17:55
 * <p>
 *
 * </p>
 */
public final class BaiDuErrorCodeMsg {

	private final Map<String, String> errorCodeMessage
			= new HashMap<String, String>() {{
		put("1", "Unknown error,服务器内部错误，请再次请求， 如果持续出现此类错误，请通过QQ群（860337848）或提交工单联系技术支持团队。");
		put("2", "Service temporarily unavailable,服务暂不可用，请再次请求， 如果持续出现此类错误，请通过QQ群（860337848）或提交工单联系技术支持团队。");
		put("3", "Unsupported openapi method,调用的API不存在，请检查请求URL后重新尝试，一般为URL中有非英文字符，如“-”，可手动输入重试");
		put("4", "Open api request limit reached,集群超限额，请再次请求， 如果持续出现此类错误，请通过QQ群（860337848）或提交工单联系技术支持团队。");
		put("6", "No permission to access data,无权限访问该用户数据，创建应用时未勾选相关接口");
		put("13", "Get service token failed,获取token失败");
		put("14", "IAM Certification failed,IAM 鉴权失败");
		put("15", "app not exsits or create failed,应用不存在或者创建失败");
		put("17", "Open api daily request limit reached,每天请求量超限额，可通过QQ群（860337848）联系群管、提交工单提升限额");
		put("18", "Open api qps request limit reached,QPS超限额，可通过QQ群（860337848）联系群管、提交工单提升限额");
		put("19", "Open api total request limit reached,请求总量超限额，可通过QQ群（860337848）联系群管、提交工单提升限额");
		put("100", "Invalid parameter,无效的access_token参数，请检查后重新尝试");
		put("110", "Access token invalid or no longer valid,access_token无效");
		put("111", "Access token expired,access token过期");
		put("222001", "param[] is null,必要参数未传入");
		put("222002", "param[start] format error,参数格式错误");
		put("222003", "param[length] format error,参数格式错误");
		put("222004", "param[op_app_id_list] format error,参数格式错误");
		put("222005", "param[group_id_list] format error,参数格式错误");
		put("222006", "group_id format error,参数格式错误");
		put("222007", "uid format error,参数格式错误");
		put("222008", "face_id format error,参数格式错误");
		put("222009", "quality_conf format error,参数格式错误");
		put("222010", "user_info format error,参数格式错误");
		put("222011", "param[uid_list] format error,参数格式错误");
		put("222012", "param[op_app_id]format error,参数格式错误");
		put("222013", "param[image] formaterror,参数格式错误");
		put("222014", "param[app_id] formaterror,参数格式错误");
		put("222015", "param[image_type]format error,参数格式错误");
		put("222016", "param[max_face_num]format error,参数格式错误");
		put("222017", "param[face_field]format error,参数格式错误");
		put("222018", "param[user_id]format error,参数格式错误");
		put("222019", "param[quality_control]format error,参数格式错误");
		put("222020", "param[liveness_control]format error,参数格式错误");
		put("222021", "param[max_user_num]format error,参数格式错误");
		put("222022", "param[id_card_number]format error,参数格式错误");
		put("222023", "param[name] format error,参数格式错误");
		put("222024", "param[face_type]format error,参数格式错误");
		put("222025", "param[face_token]format error,参数格式错误");
		put("222026", "param[max_star_num] format error,参数格式错误");
		put("222201", "network not available,服务端请求失败");
		put("222202", "pic not has face,图片中没有人脸");
		put("222203", "image check fail,无法解析人脸");
		put("222204", "image_url_download_fail,从图片的url下载图片失败");
		put("222205", "network not availablel,服务端请求失败");
		put("222206", "rtse service return fail,服务端请求失败");
		put("222207", "match user is not found,未找到匹配的用户");
		put("222208", "the number of image is incorrect,图片的数量错误");
		put("222209", "face token not exist,face token不存在");
		put("222300", "add face fail,人脸图片添加失败");
		put("222301", "get face fail,获取人脸图片失败");
		put("222302", "system error,服务端请求失败");
		put("222303", "get face fail,获取人脸图片失败");
		put("223100", "group is not exist,操作的用户组不存在");
		put("223101", "group is already exist,该用户组已存在");
		put("223102", "user is already exist,该用户已存在");
		put("223103", "user is not exist,找不到该用户");
		put("223104", "group_list is too large,group_list包含组数量过多");
		put("223105", "face is already exist,该人脸已存在");
		put("223106", "face is not exist,该人脸不存在");
		put("223110", "uid_list is too large,uid_list包含数量过多");
		put("223111", "dst group is not exist,目标用户组不存在");
		put("223112", "quality_conf format error,quality_conf格式不正确");
		put("223113", "face is covered,人脸有被遮挡");
		put("223114", "face is fuzzy,人脸模糊");
		put("223115", "face light is not good,人脸光照不好");
		put("223116", "incomplete face,人脸不完整");
		put("223117", "app_list is too large,app_list包含app数量过多");
		put("223118", "quality control error,质量控制项错误");
		put("223119", "liveness control item error,活体控制项错误");
		put("223120", "liveness check fail,活体检测未通过");
		put("223121", "left eye is occlusion,质量检测未通过 左眼遮挡程度过高");
		put("223122", "right eye is occlusion,质量检测未通过 右眼遮挡程度过高");
		put("223123", "left cheek is occlusion,质量检测未通过 左脸遮挡程度过高");
		put("223124", "right cheek is occlusion,质量检测未通过 右脸遮挡程度过高");
		put("223125", "chin contour is occlusion,质量检测未通过 下巴遮挡程度过高");
		put("223126", "nose is occlusion,质量检测未通过 鼻子遮挡程度过高");
		put("223127", "mouth is occlusion,质量检测未通过 嘴巴遮挡程度过高");
		put("222350", "police picture is none or low quality,公安网图片不存在或质量过低");
		put("222351", "id number and name not match or id number not exist,身份证号与姓名不匹配或该身份证号不存在");
		put("222352", "name format error,身份证名字格式错误");
		put("222353", "id number format error,身份证号码格式错误");
		put("222354", "id number not exist,公安库里不存在此身份证号");
		put("222355", "police picture not exist,身份证号码正确，公安库里没有对应的照片");
		put("222360", "invalid name or id number,身份证号码或名字非法（公安网校验不通过）");
		put("222901", "system busy,系统繁忙");
		put("222902", "system busy,系统繁忙");
		put("222903", "system busy,系统繁忙");
		put("222904", "system busy,系统繁忙");
		put("222905", "system busy,系统繁忙");
		put("222906", "system busy,系统繁忙");
		put("222907", "system busy,系统繁忙");
		put("222908", "system busy,系统繁忙");
		put("222909", "system busy,系统繁忙");
		put("222910", "system busy,系统繁忙");
		put("222911", "system busy,系统繁忙");
		put("222912", "system busy,系统繁忙");
		put("222913", "system busy,系统繁忙");
		put("222914", "system busy,系统繁忙");
		put("222915", "system busy,系统繁忙");
		put("222916", "system busy,系统繁忙");
		put("222361", "system busy,系统繁忙");
	}};

	public String getMessageByCode(String code) {
		return errorCodeMessage.get(code);
	}

}
