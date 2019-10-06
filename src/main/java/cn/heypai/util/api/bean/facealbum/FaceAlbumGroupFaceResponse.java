package cn.heypai.util.api.bean.facealbum;

import cn.heypai.util.api.bean.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author three
 * @since 2019-10-06 15:03
 * <p>
 * 类聚人脸
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FaceAlbumGroupFaceResponse extends BaseResponse {
	private String facealbum_token;
	private String task_id;
}
