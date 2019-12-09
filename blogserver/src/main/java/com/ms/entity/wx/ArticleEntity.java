package com.ms.entity.wx;

public class ArticleEntity {
    private String createTime; // "2017-07-17"
    private String details; // ""
    private String id; // "6"
    private String img; // "https; ////wxapi.weiyunyi.com/Uploads/20170715/5969902c56885.jpg"
    private String text; // "因为你的家,就是我们的家,因为顾客,就是上帝,我们为上帝提供最优的服务,最适合的价钱"
    private String title; // "家装报价"
    private String topPic; // "20170715/5969673bd509c.jpg"
    private String typeId; // "5"
    private String wxAppId; // "6"

    public ArticleEntity(String createTime, String details, String id, String img, String text, String title, String topPic, String typeId, String wxAppId) {
        this.createTime = createTime;
        this.details = details;
        this.id = id;
        this.img = img;
        this.text = text;
        this.title = title;
        this.topPic = topPic;
        this.typeId = typeId;
        this.wxAppId = wxAppId;
    }

    public ArticleEntity() {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopPic() {
        return topPic;
    }

    public void setTopPic(String topPic) {
        this.topPic = topPic;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }
}
