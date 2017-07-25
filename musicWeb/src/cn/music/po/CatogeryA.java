package cn.music.po;

public class CatogeryA {
    private Integer categoryid;

    private String originalsinger;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getOriginalsinger() {
        return originalsinger;
    }

    public void setOriginalsinger(String originalsinger) {
        this.originalsinger = originalsinger == null ? null : originalsinger.trim();
    }
}