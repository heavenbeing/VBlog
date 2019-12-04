package com.ms.model.wx;

// 公司基本信息
public class CompanyInfo {
    private String address; // "美国洛杉矶"
    private String id; // "3"
    private String intro; // "<p>记录多少级了空间范德萨来看金额为电脑上来看奋斗史莱克充满多少来看额外发大水了卡分为电风扇</p>"
    private String latitude; // "33.7453014"
    private String longitude; // "113.30084898"
    private String name; // "装修界的扛把子"
    private String tel; // "123456789"
    private String wxappid; //"6"

    public CompanyInfo(String address, String id, String intro, String latitude, String longitude, String name, String tel, String wxappid) {
        this.address = address;
        this.id = id;
        this.intro = intro;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.tel = tel;
        this.wxappid = wxappid;
    }

    public CompanyInfo() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWxappid() {
        return wxappid;
    }

    public void setWxappid(String wxappid) {
        this.wxappid = wxappid;
    }
}
