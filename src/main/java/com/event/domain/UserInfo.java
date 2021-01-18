package com.event.domain;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
public class UserInfo {

    @NotNull(message = "用户id不可为空")
    private int uId;
    @NotNull(message = "用户名不可为空")
    private String uName;
    @NotNull(message = "用户登录名不可为空")
    private String uLoginName;
    private String uPwd;
    private String uIdcard;
    private int uSex;
    private String remark;
    private Date createTime;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getuIdcard() {
        return uIdcard;
    }

    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard;
    }

    public int getuSex() {
        return uSex;
    }

    public void setuSex(int uSex) {
        this.uSex = uSex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uLoginName='" + uLoginName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", uIdcard='" + uIdcard + '\'' +
                ", uSex=" + uSex +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
