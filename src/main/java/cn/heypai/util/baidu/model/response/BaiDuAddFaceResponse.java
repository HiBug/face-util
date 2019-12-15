package cn.heypai.util.baidu.model.response;

import cn.heypai.util.baidu.model.bean.BaiDuFaceLocation;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author three
 * @since 2019-12-15 15:40
 * <p>
 *
 * </p>
 */
@Data
public class BaiDuAddFaceResponse {

	@JSONField(name = "face_token")
	private String faceToken;

	private BaiDuFaceLocation location;
}
