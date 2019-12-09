package com.ms.serviceImpl.wxapp;

import com.ms.bean.Article;
import com.ms.dao.IndexMapper;
import com.ms.entity.wx.*;
import com.ms.mapper.ArticleMapper;
import com.ms.model.MapResp;
import com.ms.model.wx.*;
import com.ms.service.wxapp.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexMapper indexDao;
    @Autowired
    private ArticleMapper articleMapper;

    private final String wxAppId = "6";

    @Override
    public BuzTypeResp getBuzType(String appId) {

        if (!wxAppId.equalsIgnoreCase(appId) || StringUtils.isEmpty(appId)) {
            return new BuzTypeResp("0");
        }

        List<BuzTypeEntity> buzTypes = indexDao.getBuzTypes();

        BuzTypeResp resp = new BuzTypeResp();
        resp.setInfo(buzTypes);
        resp.setStatus("1");

        return resp;
    }

    @Override
    public CompanyInfoResp getInfo(String appId) {
        if (wxAppId.equalsIgnoreCase(appId)) {
            CompanyInfo companyInfo = new CompanyInfo(
                    "郑州市高新区",
                    "3",
                    "<p>装修界的扛把子</p>",
                    "113.54",
                    "34.83",
                    "茗顺装饰",
                    "123456789",
                    "6"
            );

            CompanyInfoResp resp = new CompanyInfoResp();
            resp.setInfo(companyInfo);
            resp.setStatus("1");

            return resp;
        }

        return new CompanyInfoResp(new CompanyInfo(), "0");
    }

    @Override
    public MapResp getMap(String appId) {
        if (wxAppId.equalsIgnoreCase(appId)) {
            return new MapResp("34.83", "113.54");
        }

        return new MapResp("","");
    }

    @Override
    public ApiResultResp getSlide(String appId) {

        if (!wxAppId.equalsIgnoreCase(appId) || StringUtils.isEmpty(appId)) {
            return new ApiResultResp("0");
        }

        SlideEntity slideEntity = new SlideEntity(
                "17",
                "https://wxapi.weiyunyi.com/Uploads/20170714/596875c0e3698.png",
                "装修啦",
                "测试地址",
                "6");
        SlideEntity slideEntity1 = new SlideEntity(
                "18",
                "https://wxapi.weiyunyi.com/Uploads/20170714/596875903b58f.png",
                "专修",
                "测试地址",
                "6");
        SlideEntity slideEntity2 = new SlideEntity(
                "18",
                "https://wxapi.weiyunyi.com/Uploads/20170714/596875903b58f.png",
                "专修",
                "测试地址",
                "6");
        SlideEntity slideEntity3 = new SlideEntity(
                "18",
                "https://wxapi.weiyunyi.com/Uploads/20170714/596875903b58f.png",
                "专修",
                "测试地址",
                "6");

        List<SlideEntity> slideEntities = new ArrayList<>();
        slideEntities.add(slideEntity);
        slideEntities.add(slideEntity1);
        slideEntities.add(slideEntity2);
        slideEntities.add(slideEntity3);

        return new ApiResultResp<List<SlideEntity>>(slideEntities, "1");
    }

    @Override
    public ApiResultResp getPhotoGroup(String appId) {
        if (!wxAppId.equalsIgnoreCase(appId) || StringUtils.isEmpty(appId)) {
            return new ApiResultResp("0");
        }

        PhotoGroupEntity photoGroupEntity = new PhotoGroupEntity(
                "1500078445",
                "6",
                "https://wxapi.weiyunyi.com/Uploads/20170715/5969615e72041.jpg",
                "公司环境介绍",
                "公司环境",
                "6");
        PhotoGroupEntity photoGroupEntity1 = new PhotoGroupEntity(
                "1500078445",
                "6",
                "https://wxapi.weiyunyi.com/Uploads/20170715/5969615e72041.jpg",
                "公司环境介绍",
                "公司环境",
                "6");
        PhotoGroupEntity photoGroupEntity2 = new PhotoGroupEntity(
                "1500078445",
                "6",
                "https://wxapi.weiyunyi.com/Uploads/20170715/5969615e72041.jpg",
                "公司环境介绍",
                "公司环境",
                "6");
        PhotoGroupEntity photoGroupEntity3 = new PhotoGroupEntity(
                "1500078445",
                "6",
                "https://wxapi.weiyunyi.com/Uploads/20170715/5969615e72041.jpg",
                "公司环境介绍",
                "公司环境",
                "6");


        List<PhotoGroupEntity> photoGroupEntities = new ArrayList<>();
        photoGroupEntities.add(photoGroupEntity);
        photoGroupEntities.add(photoGroupEntity1);
        photoGroupEntities.add(photoGroupEntity2);
        photoGroupEntities.add(photoGroupEntity3);

        return new ApiResultResp<List<PhotoGroupEntity>>(photoGroupEntities, "1");
    }

    @Override
    public ApiResultResp getPreList(String appId) {
        if (!wxAppId.equalsIgnoreCase(appId) || StringUtils.isEmpty(appId)) {
            return new ApiResultResp("0");
        }

        AppointmentEntity appointmentEntity = new AppointmentEntity(
                "12",
                "0",
                "&lt;p&gt;放到了卡斯放四大离开&lt;/p&gt;",
                "1521073970",
                "6",
                "https://wxapi.weiyunyi.com/Uploads/20170715/5969e5c2c9047.jpg",
                "装修给你美丽,美丽因装修不同,一切从装修开始",
                "0",
                "",
                "0.00",
                "55",
                "装修预约",
                "5",
                "6"
                );

        List<AppointmentEntity> appointmentEntities = new ArrayList<>();
        appointmentEntities.add(appointmentEntity);

        return new ApiResultResp<List<AppointmentEntity>>(appointmentEntities, "1");
    }

    @Override
    public ApiResultResp getPre(String appId, String preId) {
        if (!wxAppId.equalsIgnoreCase(appId) || StringUtils.isEmpty(appId)) {
            return new ApiResultResp("0");
        }

        if (StringUtils.isEmpty(preId)) {
            return new ApiResultResp("0");
        }

//        String resp = "{\"pre\":{\"id\":\"6\",\"wxappid\":\"6\",\"title\":\"\\u88c5\\u4fee\\u9884\\u7ea6\",\"intro\":\"\\u88c5\\u4fee\\u7ed9\\u4f60\\u7f8e\\u4e3d,\\u7f8e\\u4e3d\\u56e0\\u88c5\\u4fee\\u4e0d\\u540c,\\u4e00\\u5207\\u4ece\\u88c5\\u4fee\\u5f00\\u59cb\",\"details\":\"<p>\\u653e\\u5230\\u4e86\\u5361\\u65af\\u653e\\u56db\\u5927\\u79bb\\u5f00<\\/p>\",\"ispay\":\"0\",\"pay_name\":\"\",\"price\":\"0.00\",\"end_value\":\"1521073970\",\"apiece_value\":\"12\",\"today_value\":\"5\",\"sub_value\":\"55\",\"createtime\":\"0\",\"img\":\"https:\\/\\/wxapi.weiyunyi.com\\/Uploads\\/20170715\\/5969e5c2c9047.jpg\"},\"forms\":{\"text\":[{\"id\":\"1\",\"wxappid\":\"6\",\"preid\":\"6\",\"name\":\"\\u59d3\\u540d\",\"field_type\":\"text\",\"field_match\":\"\",\"is_empty\":\"1\",\"field_option\":\"\",\"fieldname\":\"I6ImUl_6\"},{\"id\":\"2\",\"wxappid\":\"6\",\"preid\":\"6\",\"name\":\"\\u624b\\u673a\\u53f7\",\"field_type\":\"text\",\"field_match\":\"^13[0-9]{9}$|^14[0-9]{9}$|^15[0-9]{9}$|^17[0-9]{9}$|^18[0-9]{9}$\",\"is_empty\":\"1\",\"field_option\":\"\",\"fieldname\":\"PyOq3j_6\"}],\"radio\":[{\"id\":\"3\",\"wxappid\":\"6\",\"preid\":\"6\",\"name\":\"\\u88c5\\u4fee\\u9879\\u76ee\\u9009\\u62e9\",\"field_type\":\"radio\",\"field_match\":\"^[\\\\u4e00-\\\\u9fa5\\\\a-zA-Z0-9]+$\",\"is_empty\":\"1\",\"field_option\":\"\\u5bb6\\u88c5|\\u516c\\u53f8|\\u9152\\u5427|\\u9152\\u5e97|\\u65c5\\u9986|\\u7f51\\u5427|\\u8d85\\u5e02|\\u996d\\u5e97|\\u94f6\\u884c|\\u653f\\u5e9c\\u5927\\u697c|\\u5065\\u8eab\\u9986|\\u6e38\\u6cf3\\u9986\",\"fieldname\":\"jafMUx_6\",\"options\":[{\"name\":\"jafMUx_6\",\"value\":\"\\u5bb6\\u88c5\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u516c\\u53f8\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u9152\\u5427\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u9152\\u5e97\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u65c5\\u9986\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u7f51\\u5427\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u8d85\\u5e02\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u996d\\u5e97\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u94f6\\u884c\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u653f\\u5e9c\\u5927\\u697c\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u5065\\u8eab\\u9986\"},{\"name\":\"jafMUx_6\",\"value\":\"\\u6e38\\u6cf3\\u9986\"}]}],\"checkbox\":[{\"id\":\"4\",\"wxappid\":\"6\",\"preid\":\"6\",\"name\":\"\\u88c5\\u4fee\",\"field_type\":\"checkbox\",\"field_match\":\"^[\\\\u4e00-\\\\u9fa5\\\\a-zA-Z0-9]+$\",\"is_empty\":\"1\",\"field_option\":\"\\u591a\\u90091|\\u591a\\u90092|\\u591a\\u90093|\\u591a\\u90094\",\"fieldname\":\"CUEE6e_6\",\"options\":[{\"name\":\"CUEE6e_6\",\"value\":\"\\u591a\\u90091\"},{\"name\":\"CUEE6e_6\",\"value\":\"\\u591a\\u90092\"},{\"name\":\"CUEE6e_6\",\"value\":\"\\u591a\\u90093\"},{\"name\":\"CUEE6e_6\",\"value\":\"\\u591a\\u90094\"}]}],\"textarea\":[{\"id\":\"5\",\"wxappid\":\"6\",\"preid\":\"6\",\"name\":\"\\u8bf7\\u8f93\\u5165\\u7559\\u8a00\",\"field_type\":\"textarea\",\"field_match\":\"^[\\\\u4e00-\\\\u9fa5\\\\a-zA-Z0-9]+$\",\"is_empty\":\"1\",\"field_option\":\"\",\"fieldname\":\"B7v8Dd_6\"}],\"date\":[{\"id\":\"6\",\"wxappid\":\"6\",\"preid\":\"6\",\"name\":\"\\u9884\\u7ea6\\u65e5\\u671f\",\"field_type\":\"date\",\"field_match\":\"\",\"is_empty\":\"1\",\"field_option\":\"\",\"fieldname\":\"IRXIMO_6\"}]}}";
        String resp = "{pre:{id:6,wxappid:6,title:\\u88c5\\u4fee\\u9884\\u7ea6,intro:\\u88c5\\u4fee\\u7ed9\\u4f60\\u7f8e\\u4e3d,\\u7f8e\\u4e3d\\u56e0\\u88c5\\u4fee\\u4e0d\\u540c,\\u4e00\\u5207\\u4ece\\u88c5\\u4fee\\u5f00\\u59cb,details:<p>\\u653e\\u5230\\u4e86\\u5361\\u65af\\u653e\\u56db\\u5927\\u79bb\\u5f00<\\/p>,ispay:0,pay_name:,price:0.00,end_value:1521073970,apiece_value:12,today_value:5,sub_value:55,createtime:0,img:https:\\/\\/wxapi.weiyunyi.com\\/Uploads\\/20170715\\/5969e5c2c9047.jpg},forms:{text:[{id:1,wxappid:6,preid:6,name:\\u59d3\\u540d,field_type:text,field_match:,is_empty:1,field_option:,fieldname:I6ImUl_6},{id:2,wxappid:6,preid:6,name:\\u624b\\u673a\\u53f7,field_type:text,field_match:^13[0-9]{9}$|^14[0-9]{9}$|^15[0-9]{9}$|^17[0-9]{9}$|^18[0-9]{9}$,is_empty:1,field_option:,fieldname:PyOq3j_6}],radio:[{id:3,wxappid:6,preid:6,name:\\u88c5\\u4fee\\u9879\\u76ee\\u9009\\u62e9,field_type:radio,field_match:^[\\\\u4e00-\\\\u9fa5\\\\a-zA-Z0-9]+$,is_empty:1,field_option:\\u5bb6\\u88c5|\\u516c\\u53f8|\\u9152\\u5427|\\u9152\\u5e97|\\u65c5\\u9986|\\u7f51\\u5427|\\u8d85\\u5e02|\\u996d\\u5e97|\\u94f6\\u884c|\\u653f\\u5e9c\\u5927\\u697c|\\u5065\\u8eab\\u9986|\\u6e38\\u6cf3\\u9986,fieldname:jafMUx_6,options:[{name:jafMUx_6,value:\\u5bb6\\u88c5},{name:jafMUx_6,value:\\u516c\\u53f8},{name:jafMUx_6,value:\\u9152\\u5427},{name:jafMUx_6,value:\\u9152\\u5e97},{name:jafMUx_6,value:\\u65c5\\u9986},{name:jafMUx_6,value:\\u7f51\\u5427},{name:jafMUx_6,value:\\u8d85\\u5e02},{name:jafMUx_6,value:\\u996d\\u5e97},{name:jafMUx_6,value:\\u94f6\\u884c},{name:jafMUx_6,value:\\u653f\\u5e9c\\u5927\\u697c},{name:jafMUx_6,value:\\u5065\\u8eab\\u9986},{name:jafMUx_6,value:\\u6e38\\u6cf3\\u9986}]}],checkbox:[{id:4,wxappid:6,preid:6,name:\\u88c5\\u4fee,field_type:checkbox,field_match:^[\\\\u4e00-\\\\u9fa5\\\\a-zA-Z0-9]+$,is_empty:1,field_option:\\u591a\\u90091|\\u591a\\u90092|\\u591a\\u90093|\\u591a\\u90094,fieldname:CUEE6e_6,options:[{name:CUEE6e_6,value:\\u591a\\u90091},{name:CUEE6e_6,value:\\u591a\\u90092},{name:CUEE6e_6,value:\\u591a\\u90093},{name:CUEE6e_6,value:\\u591a\\u90094}]}],textarea:[{id:5,wxappid:6,preid:6,name:\\u8bf7\\u8f93\\u5165\\u7559\\u8a00,field_type:textarea,field_match:^[\\\\u4e00-\\\\u9fa5\\\\a-zA-Z0-9]+$,is_empty:1,field_option:,fieldname:B7v8Dd_6}],date:[{id:6,wxappid:6,preid:6,name:\\u9884\\u7ea6\\u65e5\\u671f,field_type:date,field_match:,is_empty:1,field_option:,fieldname:IRXIMO_6}]}}";
        
        return new ApiResultResp(resp, "0");
    }

    @Override
    public ApiResultResp getArticle(String appId, String id) {
        if (!wxAppId.equalsIgnoreCase(appId) || StringUtils.isEmpty(appId)) {
            return new ApiResultResp("0");
        }

        if (StringUtils.isEmpty(id)) {
            return new ApiResultResp("0");
        }

        ArticleEntity articleEntity = new ArticleEntity(
                "2017-07-17",
                "<p>的萨菲拉开距离就哭了尽量尽量快进来看快乐快乐就凉快哪了呢凉快圣诞节快哭了解放了贷款时间了空间车型,来看大家来看拉开距离咖啡色的,放大搜卡嘉莉放大数据量快捷你来看大家来看而我李炯sd卡就噢诶哦不能从下面哦偶尔今晚哦的说法经理级能吃吗就哭了我就欧皮文理科的撒娇刻录机额外破来看就上课了偶尔今晚io</p>",
                "6",
                "https://wxapi.weiyunyi.com/Uploads/20170715/5969902c56885.jpg",
                "因为你的家,就是我们的家,因为顾客,就是上帝,我们为上帝提供最优的服务,最适合的价钱",
                "家装报价",
                "https://wxapi.weiyunyi.com/Uploads/20170715/5969673bd509c.jpg",
                "5",
                "6"
        );

        List<ArticleEntity> articleEntities = new ArrayList<>();
        articleEntities.add(articleEntity);

        return new ApiResultResp<List<ArticleEntity>>(articleEntities, "1");
    }

    @Override
    public ApiResultResp getArticleList(String appId, Integer typeId) {
        if (!wxAppId.equalsIgnoreCase(appId) || StringUtils.isEmpty(appId)) {
            return new ApiResultResp("0");
        }

        if (StringUtils.isEmpty(typeId)) {
            return new ApiResultResp("0");
        }

        List<Article> articles = articleMapper.getArticles(typeId);

        List<ArticleResp> resps = new ArrayList<>();

        for (Article article : articles) {
            ArticleResp resp = new ArticleResp();

            resp.setId(article.getId().toString());
            if (article.getPublishDate() != null) {
                resp.setCreateTime(article.getPublishDate().toString());
            }
            resp.setDetails(article.getHtmlContent());
            resp.setText(article.getSummary());
            resp.setTitle(article.getTitle());
            resp.setTypeId(article.getCid().toString());
            resp.setWxAppId(article.getWxAppId());
            resp.setImg(article.getImg());
            resp.setTopPic(article.getTopPic());

            resps.add(resp);
        }

        return new ApiResultResp<List<ArticleResp>>(resps, "1");
    }
}
