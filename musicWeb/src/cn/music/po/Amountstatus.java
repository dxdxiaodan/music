package cn.music.po;

public class Amountstatus {
    private Integer amountstatusid;

    private String amountstatusvalue;

    public Integer getAmountstatusid() {
        return amountstatusid;
    }

    public void setAmountstatusid(Integer amountstatusid) {
        this.amountstatusid = amountstatusid;
    }

    public String getAmountstatusvalue() {
        return amountstatusvalue;
    }

    public void setAmountstatusvalue(String amountstatusvalue) {
        this.amountstatusvalue = amountstatusvalue == null ? null : amountstatusvalue.trim();
    }
}