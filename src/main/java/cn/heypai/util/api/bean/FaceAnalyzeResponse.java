package cn.heypai.util.api.bean;

import java.util.List;

/**
 * @author by licheng on 2018/7/3.
 */

public class FaceAnalyzeResponse extends BaseResponse {

    private List<Face> faces;

    public List<Face> getFaces() {
        return faces;
    }

    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }


    public String toString() {
        return "{" +
                "\"faces\":" + faces +
                '}';
    }
}
