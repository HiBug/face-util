package cn.heypai.util.api.bean.facealbum;

import cn.heypai.util.api.bean.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author three
 * @since 2019-09-15 20:53
 * <p>
 *
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FaceAlbumAsyncSearchResponse extends BaseResponse {
	private String facealbum_token;
	private String task_id;
}
