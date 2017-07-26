package cn.music.po;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    private String userid;

    private String username;

    private String password;

    private String sex;

    private Date birthday;

    private Date registertime;

    private Integer amountstatusid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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
}