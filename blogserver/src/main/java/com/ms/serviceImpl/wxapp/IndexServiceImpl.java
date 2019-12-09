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
