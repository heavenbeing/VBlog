package com.ms.controller.wxapp;

import com.ms.bean.Article;
import com.ms.model.LoginInfoReq;
import com.ms.model.MapResp;
import com.ms.model.wx.ApiResultResp;
import com.ms.model.wx.BuzTypeResp;
import com.ms.model.wx.CompanyInfo;
import com.ms.model.wx.CompanyInfoResp;
import com.ms.service.ArticleService;
import com.ms.service.wxapp.IndexService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wx/index/")
public class IndexController {
    @Autowired
    IndexService indexService;

    @RequestMapping(value = "/slogin", method = RequestMethod.POST)
    public void login(@RequestBody LoginInfoReq loginInfoReq) {
        return;
    }

    @ApiOperation(value = "获取地图经纬度",notes ="获取地图经纬度")
    @RequestMapping(value = "/getmap", method = RequestMethod.POST)
    public MapResp getMap(@RequestParam String wxappid) {
        return indexService.getMap(wxappid);
    }

    @ApiOperation(value = "获取公司基本信息",notes ="获取公司基本信息")
    @RequestMapping(value = "/getinfo", method = RequestMethod.POST)
    public CompanyInfoResp getInfo(@RequestParam String wxappid) {
        return indexService.getInfo(wxappid);
    }

    @ApiOperation(value = "获取商家分类", notes = "获取商家分类")
    @RequestMapping(value = "/gettype", method = RequestMethod.POST)
    public BuzTypeResp getBuzType(@RequestParam String wxappid) {
        return indexService.getBuzType(wxappid);
    }

    @ApiOperation(value = "获取商家首页幻灯片", notes = "获取商家首页幻灯片")
    @RequestMapping(value = "/getslide", method = RequestMethod.GET)
    public ApiResultResp getSlide(@RequestParam String wxappid) {
        return indexService.getSlide(wxappid);
    }
}
