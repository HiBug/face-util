package cn.heypai.util.api.bean.facealbum;

import cn.heypai.util.api.bean.BaseResponse;
import cn.heypai.util.api.bean.Face;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author three
 * @since 2019-09-15 21:23
 * <p>
 *
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FaceAlbumAddImgResponse extends BaseResponse {
	private String     image_id;
	private String     facealbum_token;
	private List<Face> faces;


}
