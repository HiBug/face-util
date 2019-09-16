package cn.heypai.util.api.bean.facealbum;

import cn.heypai.util.api.bean.BaseResponse;
import cn.heypai.util.api.bean.Face;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author three
 * @since 2019-09-16 13:29
 * <p>
 *
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FaceAlbumDetailResponse extends BaseResponse {
	private String     facealbum_token;
	private List<Face> faces;
	private String     next_token;
}
