package cn.music.po;

public class Musiclibrary extends MusiclibraryKey {
    private String musicname;

    private Integer categorydetailId;

    private Integer styleid;

    private Integer languageid;

    private Integer downloadpermissionsid;

    private String lyric;

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname == null ? null : musicname.trim();
    }

    public Integer getCategorydetailId() {
        return categorydetailId;
    }

    public void setCategorydetailId(Integer categorydetailId) {
        this.categorydetailId = categorydetailId;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }

    public Integer getDownloadpermissionsid() {
        return downloadpermissionsid;
    }

    public void setDownloadpermissionsid(Integer downloadpermissionsid) {
        this.downloadpermissionsid = downloadpermissionsid;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric == null ? null : lyric.trim();
    }
}