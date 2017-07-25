package cn.music.po;

public class CatogeryO {
    private Integer categoryid;

    private String originalsinger;

    private String writelyric;

    private String compose;

    private String creativeinspiration;

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

    public String getWritelyric() {
        return writelyric;
    }

    public void setWritelyric(String writelyric) {
        this.writelyric = writelyric == null ? null : writelyric.trim();
    }

    public String getCompose() {
        return compose;
    }

    public void setCompose(String compose) {
        this.compose = compose == null ? null : compose.trim();
    }

    public String getCreativeinspiration() {
        return creativeinspiration;
    }

    public void setCreativeinspiration(String creativeinspiration) {
        this.creativeinspiration = creativeinspiration == null ? null : creativeinspiration.trim();
    }
}