package com.ms.controller.wxapp;

import com.ms.bean.Article;
import com.ms.model.LoginInfoReq;
import com.ms.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wx/index/")
public class IndexController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/slogin", method = RequestMethod.POST)
    public void login(@RequestBody LoginInfoReq loginInfoReq) {
        return;
    }
}
