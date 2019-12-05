package com.ms.entity.wx;

public class PhotoGroupEntity {
    private String createtime;// "1500078445"
    private String id;// "6"
    private String img;// "https://wxapi.weiyunyi.com/Uploads/20170715/5969615e72041.jpg"
    private String intro;// "公司环境介绍"
    private String name;// "公司环境"
    private String wxappid;// "6"

    public PhotoGroupEntity(String createtime, String id, String img, String intro, String name, String wxappid) {
        this.createtime = createtime;
        this.id = id;
        this.img = img;
        this.intro = intro;
        this.name = name;
        this.wxappid = wxappid;
    }

    public PhotoGroupEntity() {
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWxappid() {
        return wxappid;
    }

    public void setWxappid(String wxappid) {
        this.wxappid = wxappid;
    }
}
