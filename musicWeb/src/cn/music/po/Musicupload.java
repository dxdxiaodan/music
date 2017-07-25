package cn.music.po;

import java.util.Date;

public class Musicupload {
    private Integer uploadid;

    private String userid;

    private Date uploadtime;

    private Integer musicid;

    private Integer checkstatusid;

    private Date updatetime;

    public Integer getUploadid() {
        return uploadid;
    }

    public void setUploadid(Integer uploadid) {
        this.uploadid = uploadid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Integer getMusicid() {
        return musicid;
    }

    public void setMusicid(Integer musicid) {
        this.musicid = musicid;
    }

    public Integer getCheckstatusid() {
        return checkstatusid;
    }

    public void setCheckstatusid(Integer checkstatusid) {
        this.checkstatusid = checkstatusid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}