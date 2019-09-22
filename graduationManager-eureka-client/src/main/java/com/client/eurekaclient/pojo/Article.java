package com.client.eurekaclient.pojo;

public class Article {
    private String uuid;

    private String articlename;

    private String articlevalue;

    private String articleauth;

    private String articlerecordid;

    private String articlecreatetime;

    private String articleedittime;

    private String status;

    private String articlehandler;

    private String subjectid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename == null ? null : articlename.trim();
    }

    public String getArticlevalue() {
        return articlevalue;
    }

    public void setArticlevalue(String articlevalue) {
        this.articlevalue = articlevalue == null ? null : articlevalue.trim();
    }

    public String getArticleauth() {
        return articleauth;
    }

    public void setArticleauth(String articleauth) {
        this.articleauth = articleauth == null ? null : articleauth.trim();
    }

    public String getArticlerecordid() {
        return articlerecordid;
    }

    public void setArticlerecordid(String articlerecordid) {
        this.articlerecordid = articlerecordid == null ? null : articlerecordid.trim();
    }

    public String getArticlecreatetime() {
        return articlecreatetime;
    }

    public void setArticlecreatetime(String articlecreatetime) {
        this.articlecreatetime = articlecreatetime == null ? null : articlecreatetime.trim();
    }

    public String getArticleedittime() {
        return articleedittime;
    }

    public void setArticleedittime(String articleedittime) {
        this.articleedittime = articleedittime == null ? null : articleedittime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getArticlehandler() {
        return articlehandler;
    }

    public void setArticlehandler(String articlehandler) {
        this.articlehandler = articlehandler == null ? null : articlehandler.trim();
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid == null ? null : subjectid.trim();
    }
}