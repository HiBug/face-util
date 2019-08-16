package cn.heypai.util.api.ocr;

import cn.heypai.util.api.HttpUtils;
import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.TransCallBack;
import cn.heypai.util.api.bean.BankCardResponse;
import cn.heypai.util.api.bean.DriverLicenseResponse;
import cn.heypai.util.api.bean.OcrIdCardResponse;
import cn.heypai.util.api.bean.VehicleResponse;

import java.util.Map;

/**
 * @author by licheng on 2018/7/3.
 */

public class OcrApi implements IOcrApi {


	public void ocrIDCard(Map<String, String> params, IFacePPCallBack<OcrIdCardResponse> callBack) {
		ocrIDCard(params, null, callBack);
	}


	public void ocrIDCard(Map<String, String> params, byte[] filePath, IFacePPCallBack<OcrIdCardResponse> callBack) {
		HttpUtils.post(API_OCR_IDCARD, params, filePath, new TransCallBack<>(callBack, OcrIdCardResponse.class));
	}


	public void ocrDriver(Map<String, String> params, IFacePPCallBack<DriverLicenseResponse> callBack) {
		ocrDriver(params, null, callBack);
	}


	public void ocrDriver(Map<String, String> params, byte[] filePath, IFacePPCallBack<DriverLicenseResponse> callBack) {
		HttpUtils.post(API_OCR_DRIVER_LICENSE, params, filePath, new TransCallBack<>(callBack, DriverLicenseResponse.class));
	}


	public void ocrVehicle(Map<String, String> params, IFacePPCallBack<VehicleResponse> callBack) {
		ocrVehicle(params, null, callBack);
	}


	public void ocrVehicle(Map<String, String> params, byte[] filePath, IFacePPCallBack<VehicleResponse> callBack) {
		HttpUtils.post(API_OCR_VEHICLE_LICENSE, params, filePath, new TransCallBack<>(callBack, VehicleResponse.class));
	}


	public void ocrBankCard(Map<String, String> params, IFacePPCallBack<BankCardResponse> callBack) {
		ocrBankCard(params, null, callBack);
	}


	public void ocrBankCard(Map<String, String> params, byte[] filePath, IFacePPCallBack<BankCardResponse> callBack) {
		HttpUtils.post(API_OCR_BANK_CARD, params, filePath, new TransCallBack<>(callBack, BankCardResponse.class));
	}
}
