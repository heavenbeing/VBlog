package com.ms.service.wxapp;

import com.ms.model.MapResp;
import com.ms.model.wx.BuzTypeResp;
import com.ms.model.wx.CompanyInfoResp;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public interface IndexService {

    BuzTypeResp getBuzType(String appId);

    CompanyInfoResp getInfo(String appId);

    MapResp getMap(String appId);

}
