package cn.heypai.util.api.image;

import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.bean.LicensePlatResponse;
import cn.heypai.util.api.bean.MergeFaceResponse;
import cn.heypai.util.api.bean.RecognizeTextRespons;
import cn.heypai.util.api.bean.SceneDetectResponse;
import cn.heypai.util.api.bean.facealbum.*;

import java.util.Map;

/**
 * @author by licheng on 2018/7/3.
 */

public interface IImageApi {

	String BASE_URL = "https://api-cn.faceplusplus.com/imagepp";

	String API_IMAGE_SCENE_DETECT            = BASE_URL + "/beta/detectsceneandobject";
	String API_IMAGE_RECOGNIZE_TEXT          = BASE_URL + "/v1/recognizetext";
	String API_IMAGE_MERGE_FACE              = BASE_URL + "/v1/mergeface";
	String API_IMAGE_LICENSE_PLATE           = BASE_URL + "/v1/licenseplate";
	String API_FACE_ALBUM_CREATE             = BASE_URL + "/v1/facealbum/createalbum";
	String API_FACE_ALBUM_ASYNC_ADD_IMG      = BASE_URL + "/v1/facealbum/addimageasync";
	String API_FACE_ALBUM_ADD_IMG            = BASE_URL + "/v1/facealbum/addimage";
	String API_FACE_ALBUM_ASYNC_SEARCH       = BASE_URL + "/v1/facealbum/searchimage";
	String API_FACE_ALBUM_SEARCH_TASK_RESULT = BASE_URL + "/v1/facealbum/searchimagetaskquery";
	String API_FACE_ALBUM_DETAIL             = BASE_URL + "/v1/facealbum/getalbumdetail";
	String API_FACE_GROUP_FACE               = BASE_URL + "/v1/facealbum/groupface";

	/**
	 * 场景识别
	 *
	 * @see <a href="https://console.faceplusplus.com.cn/documents/5671708">场景识别 Api文档</>
	 */
	void detectScene(Map<String, String> params, IFacePPCallBack<SceneDetectResponse> callBack);

	void detectScene(Map<String, String> params, byte[] filePath, IFacePPCallBack<SceneDetectResponse> callBack);

	/**
	 * 文字识别
	 *
	 * @see <a href="https://console.faceplusplus.com.cn/documents/7776484">文字识别 Api文档</>
	 */
	void recognizeText(Map<String, String> params, IFacePPCallBack<RecognizeTextRespons> callBack);

	void recognizeText(Map<String, String> params, byte[] filePath, IFacePPCallBack<RecognizeTextRespons> callBack);

	/**
	 * 人脸融合
	 *
	 * @see <a href="https://console.faceplusplus.com.cn/documents/20813963">人脸融合 Api文档</>
	 */
	void mergeFace(Map<String, String> params, IFacePPCallBack<MergeFaceResponse> callBack);

	void mergeFace(Map<String, String> params, Map<String, byte[]> filePath, IFacePPCallBack<MergeFaceResponse> callBack);

	void mergeFace(Map<String, String> params, byte[] template_file, byte[] merge_file, IFacePPCallBack<MergeFaceResponse> callBack);

	void mergeFace(Map<String, String> params, Map<String, byte[]> file1, Map<String, byte[]> file2, IFacePPCallBack<MergeFaceResponse> callBack);

	/**
	 * 车牌识别
	 *
	 * @see <a href="https://console.faceplusplus.com.cn/documents/33915254">车牌识别 Api文档</>
	 */
	void recognizePlat(Map<String, String> params, IFacePPCallBack<LicensePlatResponse> callBack);

	void recognizePlat(Map<String, String> params, byte[] filePath, IFacePPCallBack<LicensePlatResponse> callBack);

	/**
	 * 创建人脸相册
	 *
	 * @param params
	 * @param callBack
	 */
	void createFaceAlbum(Map<String, String> params, IFacePPCallBack<FaceAlbumCreateResponse> callBack);

	/**
	 * 异步往人脸相册添加照片
	 *
	 * @param params
	 * @param callBack
	 */
	void asyncAddImage2FaceAlbum(Map<String, String> params, IFacePPCallBack<FaceAlbumAsyncAddImageResponse> callBack);

	/**
	 * 同步往人脸相册添加照片
	 *
	 * @param params
	 * @param callBack
	 */
	void addImage2FaceAlbum(Map<String, String> params, IFacePPCallBack<FaceAlbumAddImgResponse> callBack);

	/**
	 * 异步搜索图片
	 *
	 * @param params
	 * @param callBack
	 */
	void asyncSearchImg(Map<String, String> params, IFacePPCallBack<FaceAlbumAsyncSearchResponse> callBack);

	/**
	 * 搜索结果查询
	 *
	 * @param params
	 * @param callBack
	 */
	void searchTaskQuery(Map<String, String> params, IFacePPCallBack<FaceAlbumSearchResultQueryResponse> callBack);

	/**
	 * 查看相册详情
	 *
	 * @param params
	 * @param callBack
	 */
	void faceAlbumDetail(Map<String, String> params, IFacePPCallBack<FaceAlbumDetailResponse> callBack);

	/**
	 * 类聚人脸
	 *
	 * @param params
	 * @param callBack
	 */
	void groupFace(Map<String, String> params, IFacePPCallBack<FaceAlbumGroupFaceResponse> callBack);
}
