package cn.heypai.util.api.ocr;

import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.bean.BankCardResponse;
import cn.heypai.util.api.bean.DriverLicenseResponse;
import cn.heypai.util.api.bean.OcrIdCardResponse;
import cn.heypai.util.api.bean.VehicleResponse;

import java.util.Map;

/**
 * @author by licheng on 2018/7/3.
 */

public interface IOcrApi {

    String BASE_URL = "https://api-cn.faceplusplus.com/cardpp";

    String API_OCR_IDCARD = BASE_URL + "/v1/ocridcard";
    String API_OCR_DRIVER_LICENSE = BASE_URL + "/v2/ocrdriverlicense";
    String API_OCR_VEHICLE_LICENSE = BASE_URL + "/v1/ocrvehiclelicense";
    String API_OCR_BANK_CARD = BASE_URL + "/v1/ocrbankcard";

    /**
     * 身份证识别
     *
     * @see <a href="https://console.faceplusplus.com.cn/documents/5671702">身份证识别 Api文档</>
     */
    void ocrIDCard(Map<String, String> params, IFacePPCallBack<OcrIdCardResponse> callBack);

    void ocrIDCard(Map<String, String> params, byte[] filePath, IFacePPCallBack<OcrIdCardResponse> callBack);

    /**
     * 驾驶证识别
     *
     * @see <a href="https://console.faceplusplus.com.cn/documents/26872594">驾驶证识别 Api文档</>
     */
    void ocrDriver(Map<String, String> params, IFacePPCallBack<DriverLicenseResponse> callBack);

    void ocrDriver(Map<String, String> params, byte[] filePath, IFacePPCallBack<DriverLicenseResponse> callBack);

    /**
     * 行驶证识别
     *
     * @see <a href="https://console.faceplusplus.com.cn/documents/5671706">行驶证识别 Api文档</>
     */
    void ocrVehicle(Map<String, String> params, IFacePPCallBack<VehicleResponse> callBack);

    void ocrVehicle(Map<String, String> params, byte[] filePath, IFacePPCallBack<VehicleResponse> callBack);

    /**
     * 银行卡识别
     *
     * @see <a href="https://console.faceplusplus.com.cn/documents/28070070">银行卡识别 Api文档</>
     */
    void ocrBankCard(Map<String, String> params, IFacePPCallBack<BankCardResponse> callBack);

    void ocrBankCard(Map<String, String> params, byte[] filePath, IFacePPCallBack<BankCardResponse> callBack);

}
