package com.ms.model.wx;

import com.ms.entity.wx.BuzTypeEntity;

import java.util.List;

public class BuzTypeResp {
    private List<BuzTypeEntity> info;
    private String status;

    public BuzTypeResp(String status) {
        this.status = status;
    }

    public BuzTypeResp() {
    }

    public  List<BuzTypeEntity> getInfo() {
        return info;
    }

    public void setInfo( List<BuzTypeEntity> info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
