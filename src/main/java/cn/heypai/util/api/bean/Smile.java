package cn.heypai.util.api.bean;

/**
 * @author by licheng on 2018/6/29.
 */

public class Smile extends ValueBean {

    private int threshold;

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }


    public String toString() {
        return "{" +
                "\"threshold\":" + threshold +
                '}';
    }
}
