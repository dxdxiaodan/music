package cn.music.po;

public class Style {
    private Integer styleid;

    private String stylevalue;

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getStylevalue() {
        return stylevalue;
    }

    public void setStylevalue(String stylevalue) {
        this.stylevalue = stylevalue == null ? null : stylevalue.trim();
    }
}