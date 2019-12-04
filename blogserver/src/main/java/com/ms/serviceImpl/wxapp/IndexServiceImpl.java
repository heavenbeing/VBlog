package com.ms.serviceImpl.wxapp;

import com.ms.dao.IndexMapper;
import com.ms.entity.wx.BuzTypeEntity;
import com.ms.model.MapResp;
import com.ms.model.wx.BuzTypeResp;
import com.ms.model.wx.CompanyInfo;
import com.ms.model.wx.CompanyInfoResp;
import com.ms.service.wxapp.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
}
