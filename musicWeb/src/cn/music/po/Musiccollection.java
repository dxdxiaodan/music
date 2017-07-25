package cn.music.po;

import java.util.Date;

public class Musiccollection extends MusiccollectionKey {
    private Integer categoryid;

    private Date addtime;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}