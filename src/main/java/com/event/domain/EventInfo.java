package com.event.domain;

import java.util.Date;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
public class EventInfo {

    private int eId;
    private String eName;
    private String remark;
    private int label;
    private String backColor;
    private String backImg;
    private String fontColor;
    private int fontSize;
    private String listStyle;
    private int remindType;
    private int uId;
    private Date createTime;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getListStyle() {
        return listStyle;
    }

    public void setListStyle(String listStyle) {
        this.listStyle = listStyle;
    }

    public int getRemindType() {
        return remindType;
    }

    public void setRemindType(int remindType) {
        this.remindType = remindType;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "EventInfo{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", remark='" + remark + '\'' +
                ", label=" + label +
                ", backColor='" + backColor + '\'' +
                ", backImg='" + backImg + '\'' +
                ", fontColor='" + fontColor + '\'' +
                ", fontSize=" + fontSize +
                ", listStyle='" + listStyle + '\'' +
                ", remindType=" + remindType +
                ", uId=" + uId +
                ", createTime=" + createTime +
                '}';
    }
}
