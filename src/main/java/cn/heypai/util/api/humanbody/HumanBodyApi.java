package cn.heypai.util.api.humanbody;

import cn.heypai.util.api.HttpUtils;
import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.TransCallBack;
import cn.heypai.util.api.bean.GestureResponse;
import cn.heypai.util.api.bean.HumanBodyDetectResponse;
import cn.heypai.util.api.bean.HumanSegmentResponse;
import cn.heypai.util.api.bean.SkeletonResponse;

import java.util.Map;

/**
 * @author by licheng on 2018/7/3.
 */

public class HumanBodyApi implements IHumanBodyApi {


    public void detectHumanBody(Map<String, String> params, IFacePPCallBack<HumanBodyDetectResponse> callBack) {
        detectHumanBody(params, null, callBack);
    }


    public void detectHumanBody(Map<String, String> params, byte[] filePath, IFacePPCallBack<HumanBodyDetectResponse> callBack) {
        HttpUtils.post(API_HUMANBODY_DETECT, params, filePath, new TransCallBack<>(callBack, HumanBodyDetectResponse.class));
    }


    public void segment(Map<String, String> params, IFacePPCallBack<HumanSegmentResponse> callBack) {
        segment(params, null, callBack);
    }


    public void segment(Map<String, String> params, byte[] filePath, IFacePPCallBack<HumanSegmentResponse> callBack) {
        HttpUtils.post(API_HUMANBODY_SEGMENT, params, filePath, new TransCallBack<>(callBack, HumanSegmentResponse.class));
    }


    public void gesture(Map<String, String> params, IFacePPCallBack<GestureResponse> callBack) {
        gesture(params, null, callBack);
    }


    public void gesture(Map<String, String> params, byte[] filePath, IFacePPCallBack<GestureResponse> callBack) {
        HttpUtils.post(API_HUMANBODY_GUSTURE, params, filePath, new TransCallBack<>(callBack, GestureResponse.class));
    }


    public void skeleton(Map<String, String> params, IFacePPCallBack<SkeletonResponse> callBack) {
        skeleton(params, null, callBack);
    }


    public void skeleton(Map<String, String> params, byte[] filePath, IFacePPCallBack<SkeletonResponse> callBack) {
        HttpUtils.post(API_HUMANBODY_SKELETON, params, filePath, new TransCallBack<>(callBack, SkeletonResponse.class));
    }
}
