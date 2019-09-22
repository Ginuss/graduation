package com.client.eurekaclient.pojo;

public class Notice {
    private String uuid;

    private String noticename;

    private String noticevalue;

    private String noticeauthor;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getNoticename() {
        return noticename;
    }

    public void setNoticename(String noticename) {
        this.noticename = noticename == null ? null : noticename.trim();
    }

    public String getNoticevalue() {
        return noticevalue;
    }

    public void setNoticevalue(String noticevalue) {
        this.noticevalue = noticevalue == null ? null : noticevalue.trim();
    }

    public String getNoticeauthor() {
        return noticeauthor;
    }

    public void setNoticeauthor(String noticeauthor) {
        this.noticeauthor = noticeauthor == null ? null : noticeauthor.trim();
    }
}