package cn.heypai.util;

import cn.heypai.util.api.FacePPApi;
import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.bean.FaceSetCreatResponse;
import cn.heypai.util.api.bean.FaceSetListResponse;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;

public class App {
	public static void main(String[] args) {
		FacePPApi facePPApi = new FacePPApi("MYh9VgzCkD2lskmfE4YJax31z-Ab_fKk", "XlXqZRhlTJvc9Y1jgHABddwHBzuyRcNl");
		// facePPApi.facesetCreate(ImmutableMap.of("display_name", "set2"
		// 		, "outer_id", "2",
		// 		"user_data", "test1")
		// 		, new IFacePPCallBack<FaceSetCreatResponse>() {
		// 			@Override
		// 			public void onSuccess(FaceSetCreatResponse response) {
		// 				System.out.println(JSON.toJSONString(response));
		// 			}
		//
		// 			@Override
		// 			public void onFailed(String error) {
		// 				System.out.println(JSON.toJSONString(error));
		// 			}
		// 		});
		facePPApi.facesetList(ImmutableMap.of("", ""),
				new IFacePPCallBack<FaceSetListResponse>() {
					@Override
					public void onSuccess(FaceSetListResponse response) {
						System.out.println(JSON.toJSONString(response));
					}

					@Override
					public void onFailed(String error) {
						System.out.println(error);
					}
				});
	}
}