package cn.music.po;

public class CatogeryC {
    private Integer categoryid;

    private String singer;

    private String originalsinger;

    private String creativeinspiration;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer == null ? null : singer.trim();
    }

    public String getOriginalsinger() {
        return originalsinger;
    }

    public void setOriginalsinger(String originalsinger) {
        this.originalsinger = originalsinger == null ? null : originalsinger.trim();
    }

    public String getCreativeinspiration() {
        return creativeinspiration;
    }

    public void setCreativeinspiration(String creativeinspiration) {
        this.creativeinspiration = creativeinspiration == null ? null : creativeinspiration.trim();
    }
}