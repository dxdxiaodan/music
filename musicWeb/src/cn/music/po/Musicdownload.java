package cn.music.po;

import java.util.Date;

public class Musicdownload {
    private Integer downloadid;

    private String userid;

    private Integer musicid;

    private Date downloadtime;

    public Integer getDownloadid() {
        return downloadid;
    }

    public void setDownloadid(Integer downloadid) {
        this.downloadid = downloadid;
    }

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

    public Date getDownloadtime() {
        return downloadtime;
    }

    public void setDownloadtime(Date downloadtime) {
        this.downloadtime = downloadtime;
    }
}