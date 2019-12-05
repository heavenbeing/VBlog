package com.ms.serviceImpl.wxapp;

import com.ms.dao.IndexMapper;
import com.ms.entity.wx.BuzTypeEntity;
import com.ms.entity.wx.SlideEntity;
import com.ms.model.MapResp;
import com.ms.model.wx.ApiResultResp;
import com.ms.model.wx.BuzTypeResp;
import com.ms.model.wx.CompanyInfo;
import com.ms.model.wx.CompanyInfoResp;
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
                    "33.7453014",
                    "113.30084898",
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
            return new MapResp("113.30084898", "33.7453014");
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
}
