package com.ms.controller.wxapp;

import com.ms.bean.Article;
import com.ms.model.LoginInfoReq;
import com.ms.model.MapResp;
import com.ms.service.ArticleService;
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

    @RequestMapping(value = "/getmap", method = RequestMethod.POST)
    public MapResp getMap(@RequestParam String wxappid) {
        if (wxAppId.equalsIgnoreCase(wxappid)) {
            return new MapResp("113.30084898", "33.7453014");
        }

        return new MapResp("","");
    }
}
