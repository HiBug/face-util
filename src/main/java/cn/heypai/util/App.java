package cn.heypai.util;

import cn.heypai.util.api.FacePPApi;
import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.bean.facealbum.*;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.function.Consumer;

public class App {
	private static FacePPApi facePPApi = new FacePPApi("MYh9VgzCkD2lskmfE4YJax31z-Ab_fKk", "XlXqZRhlTJvc9Y1jgHABddwHBzuyRcNl");

	public static void main(String[] args) throws Exception {
		String imgUrl     = "http://cdn.zhaopian.live/FjhUbr-UbKSam5ne5aLYcuppUh0d";
		String albumToken = "1568551847-cd382ac2-16ce-4ef3-aa58-0c6b387f14d6";
		String noFaceUrl  = "http://cdn.zhaopian.live/FotQiTAIlGudrl20gi46afiUSTzS";

		getAlbumDetail(albumToken);
		// addImage2FaceAlbum(albumToken, "http://cdn.zhaopian.live/FotQiTAIlGudrl20gi46afiUSTzS");
		// asyncSearchImg(albumToken, imgUrl, App::searchTaskQuery);
	}

	private static void getAlbumDetail(String albumToken) {
		facePPApi.faceAlbumDetail(ImmutableMap.of("facealbum_token", albumToken), new IFacePPCallBack<FaceAlbumDetailResponse>() {
			@Override
			public void onSuccess(FaceAlbumDetailResponse response) {
				System.out.println("getAlbumDetail:" + JSON.toJSONString(response));
			}

			@Override
			public void onFailed(String error) {
				System.out.println(error);
			}
		});
	}


	//创建相册
	private static String createFaceAlbum() {
		final String[] albumToken = {StringUtils.EMPTY};
		facePPApi.createFaceAlbum(ImmutableMap.of(), new IFacePPCallBack<FaceAlbumCreateResponse>() {
			@Override
			public void onSuccess(FaceAlbumCreateResponse response) {
				System.out.println(JSON.toJSONString(response));
				albumToken[0] = response.getFacealbum_token();
			}

			@Override
			public void onFailed(String error) {
				System.out.println(error);
			}
		});
		return albumToken[0];
	}

	//添加照片到相册
	private static Map<String, String> addImage2FaceAlbum(String facealbum_token, String image_url) {
		Map<String, String> result = Maps.newHashMap();
		facePPApi.addImage2FaceAlbum(ImmutableMap.of("facealbum_token", facealbum_token,
				"image_url", image_url), new IFacePPCallBack<FaceAlbumAddImgResponse>() {
			@Override
			public void onSuccess(FaceAlbumAddImgResponse response) {
				result.put("imageId", response.getImage_id());
				System.out.println("addImage2FaceAlbum:" + JSON.toJSONString(response));
			}

			@Override
			public void onFailed(String error) {
				System.out.println("addImage2FaceAlbum:" + error);
			}
		});
		return result;

	}

	//异步搜索
	private static void asyncSearchImg(String albumToken, String searchImg, Consumer<String> consumer) {
		facePPApi.asyncSearchImg(ImmutableMap.of("facealbum_token", albumToken
				, "image_url", searchImg),
				new IFacePPCallBack<FaceAlbumAsyncSearchResponse>() {
					@Override
					public void onSuccess(FaceAlbumAsyncSearchResponse response) {
						System.out.println("asyncSearchImg:" + JSON.toJSONString(response));
						consumer.accept(response.getTask_id());
					}

					@Override
					public void onFailed(String error) {
						System.out.println(error);
					}
				});

	}

	//获取搜索结果
	private static void searchTaskQuery(String taskId) {
		facePPApi.searchTaskQuery(ImmutableMap.of("task_id", taskId),
				new IFacePPCallBack<FaceAlbumSearchResultQueryResponse>() {
					@Override
					public void onSuccess(FaceAlbumSearchResultQueryResponse response) {
						System.out.println("searchTaskQuery:" + JSON.toJSONString(response));
					}

					@Override
					public void onFailed(String error) {
						System.out.println(error);
					}
				});
	}
}