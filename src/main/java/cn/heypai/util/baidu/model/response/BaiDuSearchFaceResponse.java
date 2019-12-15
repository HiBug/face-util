package cn.heypai.util.baidu.model.response;

import cn.heypai.util.baidu.model.bean.BaiDuUser;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @author three
 * @since 2019-12-15 16:04
 * <p>
 *
 * </p>
 */
@Data
public class BaiDuSearchFaceResponse {
	@JSONField(name = "face_token")
	private String faceToken;

	@JSONField(name = "user_list")
	private List<BaiDuUser> userList;
}
