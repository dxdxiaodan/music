package cn.music.po;

public class Checkstatus {
    private Integer checkstatusid;

    private String checkstatusvalue;

    public Integer getCheckstatusid() {
        return checkstatusid;
    }

    public void setCheckstatusid(Integer checkstatusid) {
        this.checkstatusid = checkstatusid;
    }

    public String getCheckstatusvalue() {
        return checkstatusvalue;
    }

    public void setCheckstatusvalue(String checkstatusvalue) {
        this.checkstatusvalue = checkstatusvalue == null ? null : checkstatusvalue.trim();
    }
}