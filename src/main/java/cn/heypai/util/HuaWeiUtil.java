// package cn.heypai.util;
//
// import com.huaweicloud.frs.client.param.*;
// import com.huaweicloud.frs.client.result.*;
// import com.huaweicloud.frs.client.service.FrsClient;
// import org.apache.commons.codec.binary.Base64;
// import org.apache.commons.io.FileUtils;
//
// import java.io.File;
//
// /**
//  * @author three
//  * @since 2019-12-08 15:20
//  * <p>
//  *  华为人脸搜索
//  * </p>
//  */
// public class HuaWeiUtil {
//
// 	public static void main(String[] args) {
// 		//设置认证参数
// 		String ak        = "71Z65VSRGT4H9TNWBLA8";
// 		String sk        = "EOAprj8OSzISbbIHPBr08Q0zO77qyuxJLrrrboC2";
// 		String projectId = "06ff65a53f000ffe2f81c0036c134e5a";
//
// //Service info
// 		String url    = "https://face.cn-south-1.myhuaweicloud.com";
// 		String region = "cn-south-1";
//
// 		AuthInfo authInfo = new AuthInfo(url, region, ak, sk);
//
// 		try (FrsClient frsClient = new FrsClient(authInfo, projectId)) {
// //创建人脸集合
// 			String faceSetName     = "firstFaceSet";
// 			int    faceSetCapacity = 10000;
// //创建人脸集合时，自定义属性
// 			CreateExternalFields createExternalFields = new CreateExternalFields();
// 			createExternalFields.addField("token", FieldType.STRING);
// 			CreateFaceSetResult createFaceSetResult = frsClient.getFaceSetService().createFaceSet(faceSetName, faceSetCapacity, createExternalFields);
// 			System.out.println(createFaceSetResult.toJSONString());
//
// //获取人脸集合
// 			GetAllFaceSetsResult getAllFaceSetsResult = frsClient.getFaceSetService().getAllFaceSets();
// 			System.out.println(getAllFaceSetsResult.toJSONString());
//
// //添加人脸
// 			String            imageId           = "image1";
// 			File              image             = new File("data/face.jpg");
// 			byte[]            fileData          = FileUtils.readFileToByteArray(image);
// 			String            imageBase64       = Base64.encodeBase64String(fileData);
// 			AddExternalFields addExternalFields = new AddExternalFields();
// 			addExternalFields.addField("testInteger", 123);
// 			AddFaceResult addFaceResult = frsClient.getFaceService().addFaceByBase64(faceSetName, imageId, imageBase64, addExternalFields);
// 			System.out.println(addFaceResult.toJSONString());
//
// //人脸对比
// 			String            image1Path        = "data/face1.jpg";
// 			String            image2Path        = "data/face2.jpg";
// 			CompareFaceResult compareFaceResult = frsClient.getCompareService().compareFaceByFile(image1Path, image2Path);
// 			System.out.println(compareFaceResult.toJSONString());
//
// //人脸检测
// 			String           obsUrl           = "/bucket/face.jpg";
// 			String           attr             = "0,1,2,3,4,5";
// 			DetectFaceResult detectFaceResult = frsClient.getDetectService().detectFaceByObsUrl(obsUrl, attr);
// 			System.out.println(detectFaceResult.toJSONString());
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 		}
//
// 	}
// }
