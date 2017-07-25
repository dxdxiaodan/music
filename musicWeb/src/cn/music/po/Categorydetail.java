package cn.music.po;

public class Categorydetail {
    private Integer categorydetailId;

    private String categorydetailvalue;

    public Integer getCategorydetailId() {
        return categorydetailId;
    }

    public void setCategorydetailId(Integer categorydetailId) {
        this.categorydetailId = categorydetailId;
    }

    public String getCategorydetailvalue() {
        return categorydetailvalue;
    }

    public void setCategorydetailvalue(String categorydetailvalue) {
        this.categorydetailvalue = categorydetailvalue == null ? null : categorydetailvalue.trim();
    }
}