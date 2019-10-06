package cn.heypai.util.api;

import cn.heypai.util.api.bean.*;
import cn.heypai.util.api.bean.facealbum.*;
import cn.heypai.util.api.face.FaceApi;
import cn.heypai.util.api.face.IFaceApi;
import cn.heypai.util.api.humanbody.HumanBodyApi;
import cn.heypai.util.api.humanbody.IHumanBodyApi;
import cn.heypai.util.api.image.IImageApi;
import cn.heypai.util.api.image.ImageApi;
import cn.heypai.util.api.ocr.IOcrApi;
import cn.heypai.util.api.ocr.OcrApi;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.MapUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 这个类是为了外部调用方便。外部只需要知道有个FacePPApi 就可以了
 *
 * @author by licheng on 2018/6/13.
 */
public class FacePPApi implements IFaceApi, IHumanBodyApi, IOcrApi, IImageApi {

	private static final String API_KEY    = "api_key";
	private static final String API_SECRET = "api_secret";

	private Map<String, String> AUTH_INFO = new HashMap<>();

	// 人脸识别Api
	private IFaceApi      faceApi      = new FaceApi();
	// 证件识别Api
	private IOcrApi       ocrApi       = new OcrApi();
	// 图像识别Api
	private IImageApi     imageApi     = new ImageApi();
	// 人体识别Api
	private IHumanBodyApi humanBodyApi = new HumanBodyApi();

	public FacePPApi(String apiKey, String apiSecret) {
		AUTH_INFO.put(API_KEY, apiKey);
		AUTH_INFO.put(API_SECRET, apiSecret);
	}


	public void detect(Map<String, String> params, IFacePPCallBack<DetectResponse> callBack) {
		faceApi.detect(buildParams(params), callBack);
	}


	public void detect(Map<String, String> params, byte[] filePath, IFacePPCallBack<DetectResponse> callBack) {
		faceApi.detect(buildParams(params), filePath, callBack);
	}


	public void compare(Map<String, String> params, IFacePPCallBack<CompareResponse> callBack) {
		faceApi.compare(buildParams(params), callBack);
	}


	public void compare(Map<String, String> params, Map<String, byte[]> file_1, IFacePPCallBack<CompareResponse> callBack) {
		faceApi.compare(buildParams(params), file_1, callBack);
	}


	public void compare(Map<String, String> params, byte[] file_1, byte[] file_2, IFacePPCallBack<CompareResponse> callBack) {
		faceApi.compare(buildParams(params), file_1, file_2, callBack);
	}


	public void search(Map<String, String> params, IFacePPCallBack<SearchResponse> callBack) {
		faceApi.search(buildParams(params), callBack);
	}


	public void search(Map<String, String> params, byte[] filePath, IFacePPCallBack<SearchResponse> callBack) {
		faceApi.search(buildParams(params), filePath, callBack);
	}


	public void facesetCreate(Map<String, String> params, IFacePPCallBack<FaceSetCreatResponse> callBack) {
		faceApi.facesetCreate(buildParams(params), callBack);
	}


	public void facesetAddFace(Map<String, String> params, IFacePPCallBack<FaceSetAddResponse> callBack) {
		faceApi.facesetAddFace(buildParams(params), callBack);
	}


	public void facesetRemoveFace(Map<String, String> params, IFacePPCallBack<FaceSetRemoveResponse> callBack) {
		faceApi.facesetRemoveFace(buildParams(params), callBack);
	}


	public void facesetUpdate(Map<String, String> params, IFacePPCallBack<FaceSetUpdateResponse> callBack) {
		faceApi.facesetUpdate(buildParams(params), callBack);
	}


	public void facesetDetail(Map<String, String> params, IFacePPCallBack<FaceSetDetailResponse> callBack) {
		faceApi.facesetDetail(buildParams(params), callBack);
	}


	public void facesetDelete(Map<String, String> params, IFacePPCallBack<FaceSetDeleteResponse> callBack) {
		faceApi.facesetDelete(buildParams(params), callBack);
	}


	public void facesetList(Map<String, String> params, IFacePPCallBack<FaceSetListResponse> callBack) {
		faceApi.facesetList(buildParams(params), callBack);
	}


	public void faceAnalyze(Map<String, String> params, IFacePPCallBack<FaceAnalyzeResponse> callBack) {
		faceApi.faceAnalyze(buildParams(params), callBack);
	}


	public void faceDetail(Map<String, String> params, IFacePPCallBack<FaceDetailResponse> callBack) {
		faceApi.faceDetail(buildParams(params), callBack);
	}


	public void setFaceUserId(Map<String, String> params, IFacePPCallBack<FaceToken> callBack) {
		faceApi.setFaceUserId(buildParams(params), callBack);
	}


	public void beautify(Map<String, String> params, IFacePPCallBack<BeautyResponse> callBack) {
		faceApi.beautify(buildParams(params), callBack);
	}


	public void beautify(Map<String, String> params, byte[] filePath, IFacePPCallBack<BeautyResponse> callBack) {
		faceApi.beautify(buildParams(params), filePath, callBack);
	}


	public void facesetAddFaceAsync(Map<String, String> params, IFacePPCallBack<FaceSetAddResponse> callBack) {
		faceApi.facesetAddFaceAsync(buildParams(params), callBack);
	}


	public void facesetRemoveFaceAsync(Map<String, String> params, IFacePPCallBack<FaceSetRemoveResponse> callBack) {
		faceApi.facesetRemoveFaceAsync(buildParams(params), callBack);
	}


	public void facesetTaskQuery(Map<String, String> params, IFacePPCallBack<TaskQueryResponse> callBack) {
		faceApi.facesetTaskQuery(buildParams(params), callBack);
	}

	/***********************************************************************************************/


	public void detectHumanBody(Map<String, String> params, IFacePPCallBack<HumanBodyDetectResponse> callBack) {
		humanBodyApi.detectHumanBody(buildParams(params), callBack);
	}


	public void detectHumanBody(Map<String, String> params, byte[] filePath, IFacePPCallBack<HumanBodyDetectResponse> callBack) {
		humanBodyApi.detectHumanBody(buildParams(params), filePath, callBack);
	}


	public void segment(Map<String, String> params, IFacePPCallBack<HumanSegmentResponse> callBack) {
		humanBodyApi.segment(buildParams(params), callBack);
	}


	public void segment(Map<String, String> params, byte[] filePath, IFacePPCallBack<HumanSegmentResponse> callBack) {
		humanBodyApi.segment(buildParams(params), filePath, callBack);
	}


	public void gesture(Map<String, String> params, IFacePPCallBack<GestureResponse> callBack) {
		humanBodyApi.gesture(buildParams(params), callBack);
	}


	public void gesture(Map<String, String> params, byte[] filePath, IFacePPCallBack<GestureResponse> callBack) {
		humanBodyApi.gesture(buildParams(params), filePath, callBack);
	}


	public void skeleton(Map<String, String> params, IFacePPCallBack<SkeletonResponse> callBack) {
		humanBodyApi.skeleton(buildParams(params), callBack);
	}


	public void skeleton(Map<String, String> params, byte[] filePath, IFacePPCallBack<SkeletonResponse> callBack) {
		humanBodyApi.skeleton(buildParams(params), filePath, callBack);
	}

	/***********************************************************************************************/


	public void ocrIDCard(Map<String, String> params, IFacePPCallBack<OcrIdCardResponse> callBack) {
		ocrApi.ocrIDCard(buildParams(params), callBack);
	}


	public void ocrIDCard(Map<String, String> params, byte[] filePath, IFacePPCallBack<OcrIdCardResponse> callBack) {
		ocrApi.ocrIDCard(buildParams(params), filePath, callBack);
	}


	public void ocrDriver(Map<String, String> params, IFacePPCallBack<DriverLicenseResponse> callBack) {
		ocrApi.ocrDriver(buildParams(params), callBack);
	}


	public void ocrDriver(Map<String, String> params, byte[] filePath, IFacePPCallBack<DriverLicenseResponse> callBack) {
		ocrApi.ocrDriver(buildParams(params), filePath, callBack);
	}


	public void ocrVehicle(Map<String, String> params, IFacePPCallBack<VehicleResponse> callBack) {
		ocrApi.ocrVehicle(buildParams(params), callBack);
	}


	public void ocrVehicle(Map<String, String> params, byte[] filePath, IFacePPCallBack<VehicleResponse> callBack) {
		ocrApi.ocrVehicle(buildParams(params), filePath, callBack);
	}


	public void ocrBankCard(Map<String, String> params, IFacePPCallBack<BankCardResponse> callBack) {
		ocrApi.ocrBankCard(buildParams(params), callBack);
	}


	public void ocrBankCard(Map<String, String> params, byte[] filePath, IFacePPCallBack<BankCardResponse> callBack) {
		ocrApi.ocrBankCard(buildParams(params), filePath, callBack);
	}

	/***********************************************************************************************/


	public void detectScene(Map<String, String> params, IFacePPCallBack<SceneDetectResponse> callBack) {
		imageApi.detectScene(buildParams(params), callBack);
	}


	public void detectScene(Map<String, String> params, byte[] filePath, IFacePPCallBack<SceneDetectResponse> callBack) {
		imageApi.detectScene(buildParams(params), filePath, callBack);
	}


	public void recognizeText(Map<String, String> params, IFacePPCallBack<RecognizeTextRespons> callBack) {
		imageApi.recognizeText(buildParams(params), callBack);
	}


	public void recognizeText(Map<String, String> params, byte[] filePath, IFacePPCallBack<RecognizeTextRespons> callBack) {
		imageApi.recognizeText(buildParams(params), filePath, callBack);
	}


	public void mergeFace(Map<String, String> params, IFacePPCallBack<MergeFaceResponse> callBack) {
		imageApi.mergeFace(buildParams(params), callBack);
	}


	public void mergeFace(Map<String, String> params, Map<String, byte[]> filePath, IFacePPCallBack<MergeFaceResponse> callBack) {
		imageApi.mergeFace(buildParams(params), filePath, callBack);
	}


	public void mergeFace(Map<String, String> params, Map<String, byte[]> file1, Map<String, byte[]> file2, IFacePPCallBack<MergeFaceResponse> callBack) {
		imageApi.mergeFace(buildParams(params), file1, file2, callBack);
	}


	public void mergeFace(Map<String, String> params, byte[] template_file, byte[] merge_file, IFacePPCallBack<MergeFaceResponse> callBack) {
		imageApi.mergeFace(buildParams(params), template_file, merge_file, callBack);
	}


	public void recognizePlat(Map<String, String> params, IFacePPCallBack<LicensePlatResponse> callBack) {
		imageApi.recognizePlat(buildParams(params), callBack);
	}


	public void recognizePlat(Map<String, String> params, byte[] filePath, IFacePPCallBack<LicensePlatResponse> callBack) {
		imageApi.recognizePlat(buildParams(params), filePath, callBack);
	}

	@Override
	public void createFaceAlbum(Map<String, String> params, IFacePPCallBack<FaceAlbumCreateResponse> callBack) {
		imageApi.createFaceAlbum(buildParams(params), callBack);
	}

	@Override
	public void asyncAddImage2FaceAlbum(Map<String, String> params, IFacePPCallBack<FaceAlbumAsyncAddImageResponse> callBack) {
		imageApi.asyncAddImage2FaceAlbum(buildParams(params), callBack);
	}

	@Override
	public void addImage2FaceAlbum(Map<String, String> params, IFacePPCallBack<FaceAlbumAddImgResponse> callBack) {
		imageApi.addImage2FaceAlbum(buildParams(params), callBack);
	}

	@Override
	public void asyncSearchImg(Map<String, String> params, IFacePPCallBack<FaceAlbumAsyncSearchResponse> callBack) {
		imageApi.asyncSearchImg(buildParams(params), callBack);
	}

	@Override
	public void searchTaskQuery(Map<String, String> params, IFacePPCallBack<FaceAlbumSearchResultQueryResponse> callBack) {
		imageApi.searchTaskQuery(buildParams(params), callBack);
	}

	@Override
	public void faceAlbumDetail(Map<String, String> params, IFacePPCallBack<FaceAlbumDetailResponse> callBack) {
		imageApi.faceAlbumDetail(buildParams(params), callBack);
	}

	@Override
	public void groupFace(Map<String, String> params, IFacePPCallBack<FaceAlbumGroupFaceResponse> callBack) {
		imageApi.groupFace(buildParams(params), callBack);
	}

	private Map<String, String> buildParams(Map<String, String> params) {
		Map<String, String> result = Maps.newHashMap(AUTH_INFO);
		if (MapUtils.isNotEmpty(params)) {
			result.putAll(params);
		}
		return result;
	}
}
