package cn.music.po;

public class Downloadpermissions {
    private Integer downloadpermissionsid;

    private String downloadpermissionsvalue;

    public Integer getDownloadpermissionsid() {
        return downloadpermissionsid;
    }

    public void setDownloadpermissionsid(Integer downloadpermissionsid) {
        this.downloadpermissionsid = downloadpermissionsid;
    }

    public String getDownloadpermissionsvalue() {
        return downloadpermissionsvalue;
    }

    public void setDownloadpermissionsvalue(String downloadpermissionsvalue) {
        this.downloadpermissionsvalue = downloadpermissionsvalue == null ? null : downloadpermissionsvalue.trim();
    }
}