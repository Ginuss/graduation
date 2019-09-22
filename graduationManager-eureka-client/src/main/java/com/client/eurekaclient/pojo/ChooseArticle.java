package com.client.eurekaclient.pojo;

public class ChooseArticle {
    private String stuid;

    private String articleid;

    private String teaid;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }

    public String getTeaid() {
        return teaid;
    }

    public void setTeaid(String teaid) {
        this.teaid = teaid == null ? null : teaid.trim();
    }
}