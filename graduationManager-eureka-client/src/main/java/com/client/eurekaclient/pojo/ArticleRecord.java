package com.client.eurekaclient.pojo;

public class ArticleRecord {
    private String uuid;

    private String articleid;

    private String currmessage;

    private String premessage;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
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
}