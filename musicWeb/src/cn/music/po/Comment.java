package cn.music.po;

import java.util.Date;

public class Comment {
    private Integer commentid;

    private Integer musicid;

    private String userid;

    private Date time;

    private Integer checkstatusid;

    private Date updatetime;

    private String content;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getMusicid() {
        return musicid;
    }

    public void setMusicid(Integer musicid) {
        this.musicid = musicid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}