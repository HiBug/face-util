package cn.heypai.util.api.bean.facealbum;

import cn.heypai.util.api.bean.BaseResponse;
import cn.heypai.util.api.bean.FaceAlbumSearchResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author three
 * @since 2019-09-16 11:26
 * <p>
 *
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FaceAlbumSearchResultQueryResponse extends BaseResponse {
	private String                      facealbum_token;
	private String                      task_id;
	private Integer                     status;//0任务还在进行中，1任务已经完成
	private List<FaceAlbumSearchResult> search_result;
}
