package cn.heypai.util.api.bean;

import lombok.Data;

/**
 * @author three
 * @since 2019-09-16 11:30
 * <p>
 * 人脸相册查询结果
 *
 * </p>
 */
@Data
public class FaceAlbumSearchResult {
	private String     image_id_set;//逗号分隔
	private CommonRect face_rectangle;
}
