package cn.music.po;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component(value = "admin" )
public class Admin {
    private String staffid;

    private String staffname;

    private String password;

    private String sex;

    private Date birthday;

    private Date registertime;

    private Integer amountstatusid;

    private Integer telephone;

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Integer getAmountstatusid() {
        return amountstatusid;
    }

    public void setAmountstatusid(Integer amountstatusid) {
        this.amountstatusid = amountstatusid;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}