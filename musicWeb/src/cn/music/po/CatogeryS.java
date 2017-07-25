package cn.music.po;

public class CatogeryS {
    private Integer categoryid;

    private String singer;

    private String writelyric;

    private String compose;

    private String sharereason;

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

    public String getSharereason() {
        return sharereason;
    }

    public void setSharereason(String sharereason) {
        this.sharereason = sharereason == null ? null : sharereason.trim();
    }
}