package cn.heypai.util.api.face;

import cn.heypai.util.api.TaskQueryResponse;
import cn.heypai.util.api.bean.BeautyResponse;
import cn.heypai.util.api.bean.FaceSetListResponse;
import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.TransCallBack;
import cn.heypai.util.api.HttpUtils;
import cn.heypai.util.api.bean.CompareResponse;
import cn.heypai.util.api.bean.DetectResponse;
import cn.heypai.util.api.bean.FaceAnalyzeResponse;
import cn.heypai.util.api.bean.FaceDetailResponse;
import cn.heypai.util.api.bean.FaceSetAddResponse;
import cn.heypai.util.api.bean.FaceSetCreatResponse;
import cn.heypai.util.api.bean.FaceSetDeleteResponse;
import cn.heypai.util.api.bean.FaceSetDetailResponse;
import cn.heypai.util.api.bean.FaceSetRemoveResponse;
import cn.heypai.util.api.bean.FaceSetUpdateResponse;
import cn.heypai.util.api.bean.FaceToken;
import cn.heypai.util.api.bean.SearchResponse;

import java.util.HashMap;
import java.util.Map;


/**
 * @author by licheng on 2018/7/3.
 */

public class FaceApi implements IFaceApi {


    public void detect(Map<String, String> params, IFacePPCallBack<DetectResponse> callBack) {
        detect(params, null, callBack);
    }


    public void detect(Map<String, String> params, byte[] filePath, IFacePPCallBack<DetectResponse> callBack) {
        HttpUtils.post(API_DETECT, params, filePath, new TransCallBack<>(callBack, DetectResponse.class));
    }


    public void compare(Map<String, String> params, IFacePPCallBack<CompareResponse> callBack) {
        HttpUtils.post(API_COMPARE, params, new TransCallBack<>(callBack, CompareResponse.class));
    }


    public void compare(Map<String, String> params, Map<String, byte[]> file, IFacePPCallBack<CompareResponse> callBack) {
        HttpUtils.post(API_COMPARE, params, file, new TransCallBack<>(callBack, CompareResponse.class));
    }


    public void compare(Map<String, String> params, byte[] file_1, byte[] file_2, IFacePPCallBack<CompareResponse> callBack) {
        Map<String, byte[]> file1 = new HashMap<>();
        file1.put(HttpUtils.KEY_IMAGE_FILE_1, file_1);

        Map<String, byte[]> file2 = new HashMap<>();
        file2.put(HttpUtils.KEY_IMAGE_FILE_2, file_2);

        HttpUtils.post(API_COMPARE, params, file1, file2, new TransCallBack<>(callBack, CompareResponse.class));
    }


    public void search(Map<String, String> params, IFacePPCallBack<SearchResponse> callBack) {
        search(params, null, callBack);
    }


    public void search(Map<String, String> params, byte[] filePath, IFacePPCallBack<SearchResponse> callBack) {
        HttpUtils.post(API_SEARCH, params, filePath, new TransCallBack<>(callBack, SearchResponse.class));
    }


    public void facesetCreate(Map<String, String> params, IFacePPCallBack<FaceSetCreatResponse> callBack) {
        HttpUtils.post(API_FACE_SET_CREATE, params, new TransCallBack<>(callBack, FaceSetCreatResponse.class));
    }


    public void facesetAddFace(Map<String, String> params, IFacePPCallBack<FaceSetAddResponse> callBack) {
        HttpUtils.post(API_FACE_SET_ADD_FACE, params, new TransCallBack<>(callBack, FaceSetAddResponse.class));
    }


    public void facesetRemoveFace(Map<String, String> params, IFacePPCallBack<FaceSetRemoveResponse> callBack) {
        HttpUtils.post(API_FACE_SET_REMOVE_FACE, params, new TransCallBack<>(callBack, FaceSetRemoveResponse.class));
    }


    public void facesetUpdate(Map<String, String> params, IFacePPCallBack<FaceSetUpdateResponse> callBack) {
        HttpUtils.post(API_FACE_SET_UPDATE, params, new TransCallBack<>(callBack, FaceSetUpdateResponse.class));
    }


    public void facesetDetail(Map<String, String> params, IFacePPCallBack<FaceSetDetailResponse> callBack) {
        HttpUtils.post(API_FACE_SET_GET_DETAIL, params, new TransCallBack<>(callBack, FaceSetDetailResponse.class));
    }


    public void facesetDelete(Map<String, String> params, IFacePPCallBack<FaceSetDeleteResponse> callBack) {
        HttpUtils.post(API_FACE_SET_DELETE, params, new TransCallBack<>(callBack, FaceSetDeleteResponse.class));
    }


    public void facesetList(Map<String, String> params, IFacePPCallBack<FaceSetListResponse> callBack) {
        HttpUtils.post(API_FACE_SET_GET_FACESETS, params, new TransCallBack<>(callBack, FaceSetListResponse.class));
    }


    public void faceAnalyze(Map<String, String> params, IFacePPCallBack<FaceAnalyzeResponse> callBack) {
        HttpUtils.post(API_FACE_ANALYZE, params, new TransCallBack<>(callBack, FaceAnalyzeResponse.class));
    }


    public void faceDetail(Map<String, String> params, IFacePPCallBack<FaceDetailResponse> callBack) {
        HttpUtils.post(API_FACE_GET_DETAIL, params, new TransCallBack<>(callBack, FaceDetailResponse.class));
    }


    public void setFaceUserId(Map<String, String> params, IFacePPCallBack<FaceToken> callBack) {
        HttpUtils.post(API_FACE_SET_USER_ID, params, new TransCallBack<>(callBack, FaceToken.class));
    }


    public void beautify(Map<String, String> params, IFacePPCallBack<BeautyResponse> callBack) {
        beautify(params, null, callBack);
    }


    public void beautify(Map<String, String> params, byte[] filePath, IFacePPCallBack<BeautyResponse> callBack) {
        HttpUtils.post(API_BEAUTY, params, filePath, new TransCallBack<>(callBack, BeautyResponse.class));
    }


    public void facesetAddFaceAsync(Map<String, String> params, IFacePPCallBack<FaceSetAddResponse> callBack) {
        HttpUtils.post(API_FACE_SET_ADD_FACE_ASYNC, params, new TransCallBack<>(callBack, FaceSetAddResponse.class));
    }


    public void facesetRemoveFaceAsync(Map<String, String> params, IFacePPCallBack<FaceSetRemoveResponse> callBack) {
        HttpUtils.post(API_FACE_SET_REMOVE_FACE_ASYNC, params, new TransCallBack<>(callBack, FaceSetRemoveResponse.class));
    }


    public void facesetTaskQuery(Map<String, String> params, IFacePPCallBack<TaskQueryResponse> callBack) {
        HttpUtils.post(API_FACE_SET_TASK_QUERY, params, new TransCallBack<>(callBack, TaskQueryResponse.class));
    }
}
