package com.ms.entity.wx;

public class SlideEntity {
    private String id; // "17"
    private String img; // "https://wxapi.weiyunyi.com/Uploads/20170714/596875c0e3698.png"
    private String info; // "装修啦"
    private String url; // "测试地址"
    private String wxappid; // "6"

    public SlideEntity(String id, String img, String info, String url, String wxappid) {
        this.id = id;
        this.img = img;
        this.info = info;
        this.url = url;
        this.wxappid = wxappid;
    }

    public SlideEntity() {
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWxappid() {
        return wxappid;
    }

    public void setWxappid(String wxappid) {
        this.wxappid = wxappid;
    }
}
