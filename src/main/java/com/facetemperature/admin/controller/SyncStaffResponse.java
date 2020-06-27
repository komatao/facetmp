package com.facetemperature.admin.controller;

public class SyncStaffResponse {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffImgUrl01() {
        return staffImgUrl01;
    }

    public void setStaffImgUrl01(String staffImgUrl01) {
        this.staffImgUrl01 = staffImgUrl01;
    }

    public String getStaffImgUrl02() {
        return staffImgUrl02;
    }

    public void setStaffImgUrl02(String staffImgUrl02) {
        this.staffImgUrl02 = staffImgUrl02;
    }

    public String getTimestampStr() {
        return timestampStr;
    }

    public void setTimestampStr(String timestampStr) {
        this.timestampStr = timestampStr;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private String id;
    private String staffCode;
    private String staffName;
    private String staffImgUrl01;
    private String staffImgUrl02;
    private String timestampStr;
    private int status;
}
