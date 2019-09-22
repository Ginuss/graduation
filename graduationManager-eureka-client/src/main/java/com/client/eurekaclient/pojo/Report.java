package com.client.eurekaclient.pojo;

public class Report {
    private String uuid;

    private String repname;

    private String repvalue;

    private String repauth;

    private String reprecordid;

    private String repcreatetime;

    private String repedittime;

    private String status;

    private String rephandler;

    private String articleid;

    private String reportaddr;

    private String creater;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getRepname() {
        return repname;
    }

    public void setRepname(String repname) {
        this.repname = repname == null ? null : repname.trim();
    }

    public String getRepvalue() {
        return repvalue;
    }

    public void setRepvalue(String repvalue) {
        this.repvalue = repvalue == null ? null : repvalue.trim();
    }

    public String getRepauth() {
        return repauth;
    }

    public void setRepauth(String repauth) {
        this.repauth = repauth == null ? null : repauth.trim();
    }

    public String getReprecordid() {
        return reprecordid;
    }

    public void setReprecordid(String reprecordid) {
        this.reprecordid = reprecordid == null ? null : reprecordid.trim();
    }

    public String getRepcreatetime() {
        return repcreatetime;
    }

    public void setRepcreatetime(String repcreatetime) {
        this.repcreatetime = repcreatetime == null ? null : repcreatetime.trim();
    }

    public String getRepedittime() {
        return repedittime;
    }

    public void setRepedittime(String repedittime) {
        this.repedittime = repedittime == null ? null : repedittime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRephandler() {
        return rephandler;
    }

    public void setRephandler(String rephandler) {
        this.rephandler = rephandler == null ? null : rephandler.trim();
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }

    public String getReportaddr() {
        return reportaddr;
    }

    public void setReportaddr(String reportaddr) {
        this.reportaddr = reportaddr == null ? null : reportaddr.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}