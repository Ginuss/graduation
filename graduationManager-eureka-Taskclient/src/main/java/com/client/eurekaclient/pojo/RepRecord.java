package com.client.eurekaclient.pojo;

public class RepRecord {
    private String uuid;

    private String reportid;

    private String currmessage;

    private String premessage;

    private String dealperson;

    private String dealtime;

    private String dealmethod;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getCurrmessage() {
        return currmessage;
    }

    public void setCurrmessage(String currmessage) {
        this.currmessage = currmessage == null ? null : currmessage.trim();
    }

    public String getPremessage() {
        return premessage;
    }

    public void setPremessage(String premessage) {
        this.premessage = premessage == null ? null : premessage.trim();
    }

    public String getDealperson() {
        return dealperson;
    }

    public void setDealperson(String dealperson) {
        this.dealperson = dealperson == null ? null : dealperson.trim();
    }

    public String getDealtime() {
        return dealtime;
    }

    public void setDealtime(String dealtime) {
        this.dealtime = dealtime == null ? null : dealtime.trim();
    }

    public String getDealmethod() {
        return dealmethod;
    }

    public void setDealmethod(String dealmethod) {
        this.dealmethod = dealmethod == null ? null : dealmethod.trim();
    }
}