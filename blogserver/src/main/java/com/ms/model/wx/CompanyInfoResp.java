package com.ms.model.wx;

public class CompanyInfoResp {
    private CompanyInfo info;

    private String status;

    public CompanyInfoResp(CompanyInfo info, String status) {
        this.info = info;
        this.status = status;
    }

    public CompanyInfoResp() {
    }

    public CompanyInfo getInfo() {
        return info;
    }

    public void setInfo(CompanyInfo info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
