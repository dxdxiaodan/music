package cn.music.po;

public class MusiccollectionKey {
    private String userid;

    private Integer musicid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getMusicid() {
        return musicid;
    }

    public void setMusicid(Integer musicid) {
        this.musicid = musicid;
    }
}