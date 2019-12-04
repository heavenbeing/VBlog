package com.ms.controller.wxapp;

import com.ms.bean.Article;
import com.ms.model.LoginInfoReq;
import com.ms.model.MapResp;
import com.ms.model.wx.CompanyInfo;
import com.ms.model.wx.CompanyInfoResp;
import com.ms.service.ArticleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wx/index/")
public class IndexController {
    @Autowired
    ArticleService articleService;

    private final String wxAppId = "6";

    @RequestMapping(value = "/slogin", method = RequestMethod.POST)
    public void login(@RequestBody LoginInfoReq loginInfoReq) {
        return;
    }

    @ApiOperation(value = "获取地图经纬度",notes ="获取地图经纬度")
    @RequestMapping(value = "/getmap", method = RequestMethod.POST)
    public MapResp getMap(@RequestParam String wxappid) {
        if (wxAppId.equalsIgnoreCase(wxappid)) {
            return new MapResp("113.30084898", "33.7453014");
        }

        return new MapResp("","");
    }

    @ApiOperation(value = "获取公司基本信息",notes ="获取公司基本信息")
    @RequestMapping(value = "/getinfo", method = RequestMethod.POST)
    public CompanyInfoResp getInfo(@RequestParam String wxappid) {
        if (wxAppId.equalsIgnoreCase(wxappid)) {
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

}
