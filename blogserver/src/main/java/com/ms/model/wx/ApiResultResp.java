package com.ms.model.wx;

import com.ms.entity.wx.BuzTypeEntity;

import java.io.Serializable;
import java.util.List;

public class ApiResultResp<T> implements Serializable {
    private T info;
    private String status;

    public ApiResultResp(T info, String status) {
        this.info = info;
        this.status = status;
    }

    public ApiResultResp(String status) {
        this.status = status;
    }

    public ApiResultResp() {
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
