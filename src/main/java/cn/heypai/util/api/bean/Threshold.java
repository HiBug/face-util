package cn.heypai.util.api.bean;

/**
 * @author by licheng on 2018/6/29.
 */

public class Threshold extends ValueBean {

    private float threshold;

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }


    public String toString() {
        return "{" +
                "\"threshold\":" + threshold +
                '}';
    }
}
