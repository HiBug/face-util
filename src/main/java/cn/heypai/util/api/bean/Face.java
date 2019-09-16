package cn.heypai.util.api.bean;

import lombok.Data;

/**
 * @author by licheng on 2018/6/29.
 */
@Data
public class Face {

	private String face_token;

	private CommonRect face_rectangle;

	private FaceLandmark landmark;

	private String group_id;

	private String image_id;

	private FaceAttributes attributes;
}
