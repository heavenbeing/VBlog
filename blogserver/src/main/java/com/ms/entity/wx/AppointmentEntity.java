package com.ms.entity.wx;

public class AppointmentEntity {
    private String apiece_value; // "12"
    private String createTime; // "0"
    private String details; // "&lt;p&gt;放到了卡斯放四大离开&lt;/p&gt;"
    private String end_value; // "1521073970"
    private String id; // "6"
    private String img; // "https; ////wxapi.weiyunyi.com/Uploads/20170715/5969e5c2c9047.jpg"
    private String intro; // "装修给你美丽,美丽因装修不同,一切从装修开始"
    private String isPay; // "0"
    private String pay_name; // ""
    private String price; // "0.00"
    private String sub_value; // "55"
    private String title; // "装修预约"
    private String today_value; // "5"
    private String wxAppId; // "6"

    public AppointmentEntity(String apiece_value, String createTime, String details, String end_value, String id, String img, String intro, String isPay, String pay_name, String price, String sub_value, String title, String today_value, String wxAppId) {
        this.apiece_value = apiece_value;
        this.createTime = createTime;
        this.details = details;
        this.end_value = end_value;
        this.id = id;
        this.img = img;
        this.intro = intro;
        this.isPay = isPay;
        this.pay_name = pay_name;
        this.price = price;
        this.sub_value = sub_value;
        this.title = title;
        this.today_value = today_value;
        this.wxAppId = wxAppId;
    }

    public AppointmentEntity() {
    }

    public String getApiece_value() {
        return apiece_value;
    }

    public void setApiece_value(String apiece_value) {
        this.apiece_value = apiece_value;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getEnd_value() {
        return end_value;
    }

    public void setEnd_value(String end_value) {
        this.end_value = end_value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    public String getPay_name() {
        return pay_name;
    }

    public void setPay_name(String pay_name) {
        this.pay_name = pay_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSub_value() {
        return sub_value;
    }

    public void setSub_value(String sub_value) {
        this.sub_value = sub_value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getToday_value() {
        return today_value;
    }

    public void setToday_value(String today_value) {
        this.today_value = today_value;
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }
}
