package cn.heypai.util;

import cn.heypai.util.api.FacePPApi;
import cn.heypai.util.api.IFacePPCallBack;
import cn.heypai.util.api.bean.RecognizeTextRespons;
import cn.heypai.util.api.bean.facealbum.*;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class App {
	private static FacePPApi facePPApi = new FacePPApi("MYh9VgzCkD2lskmfE4YJax31z-Ab_fKk", "XlXqZRhlTJvc9Y1jgHABddwHBzuyRcNl");

	public static void main(String[] args) throws Exception {
		String imgUrl     = "http://cdn.zhaopian.live/FjhUbr-UbKSam5ne5aLYcuppUh0d";
		String albumToken = "1568551847-cd382ac2-16ce-4ef3-aa58-0c6b387f14d6";
		String noFaceUrl  = "http://cdn.zhaopian.live/FotQiTAIlGudrl20gi46afiUSTzS";
		String textUrl    = "https://cdn.zhaopian.live/Fg0XxnQjN6gZC2OYAW9HqhYaBOhw?imageView2/2/w/800";

		// getAlbumDetail(albumToken);
		// addImage2FaceAlbum(albumToken, "http://cdn.zhaopian.live/WX20191006-151810@2x.png");
		// groupFace(albumToken, "");
		// String taskId = asyncSearchImg(albumToken, imgUrl);
		// searchTaskQuery("ba2c9c43-f331-4415-a54e-278676506d55");

		recognizeText(textUrl);
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
	private static String asyncSearchImg(String albumToken, String searchImg) {
		FaceAlbumAsyncSearchResponse result = new FaceAlbumAsyncSearchResponse();
		facePPApi.asyncSearchImg(ImmutableMap.of("facealbum_token", albumToken
				, "image_url", searchImg),
				new IFacePPCallBack<FaceAlbumAsyncSearchResponse>() {
					@Override
					public void onSuccess(FaceAlbumAsyncSearchResponse response) {
						System.out.println("asyncSearchImg:" + JSON.toJSONString(response));
						result.setTask_id(response.getTask_id());
					}

					@Override
					public void onFailed(String error) {
						System.out.println(error);
					}
				});
		return result.getTask_id();

	}

	/**
	 * 人脸聚合
	 *
	 * @param faceAlbumToken
	 * @param operation_type 人脸分组操作类型，有效值为：
	 *                       <p>
	 *                       incremental：增量操作
	 *                       entirefacealbum：全量操作
	 *                       注：增量操作不会改变 group_id!=0 和 group_id!=-1 的人脸分组，且只返回
	 *                       <p>
	 *                       增量结果
	 *                       <p>
	 *                       默认值：incremental
	 */
	private static void groupFace(String faceAlbumToken, String operation_type) {
		facePPApi.groupFace(ImmutableMap.of("facealbum_token", faceAlbumToken),
				new IFacePPCallBack<FaceAlbumGroupFaceResponse>() {
					@Override
					public void onSuccess(FaceAlbumGroupFaceResponse response) {
						System.out.println(JSON.toJSONString(response));
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

	private static void recognizeText(String url) {
		facePPApi.recognizeText(ImmutableMap.of("image_url", url),
				new IFacePPCallBack<RecognizeTextRespons>() {
					@Override
					public void onSuccess(RecognizeTextRespons response) {
						System.out.println(JSON.toJSONString(response));
					}

					@Override
					public void onFailed(String error) {
						System.out.println(error);
					}
				});
	}
}