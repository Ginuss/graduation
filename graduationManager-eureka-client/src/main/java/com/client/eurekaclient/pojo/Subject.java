package com.client.eurekaclient.pojo;

public class Subject {
    private String uuid;

    private String subname;

    private String subvalue;

    private String subtype;

    private String subauth;

    private String subhandler;

    private String subrecordid;

    private String grade;

    private String subcreatetime;

    private String subedittime;

    private String status;

    private String subjectadd;

    private String articleid;

    private String creater;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname == null ? null : subname.trim();
    }

    public String getSubvalue() {
        return subvalue;
    }

    public void setSubvalue(String subvalue) {
        this.subvalue = subvalue == null ? null : subvalue.trim();
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype == null ? null : subtype.trim();
    }

    public String getSubauth() {
        return subauth;
    }

    public void setSubauth(String subauth) {
        this.subauth = subauth == null ? null : subauth.trim();
    }

    public String getSubhandler() {
        return subhandler;
    }

    public void setSubhandler(String subhandler) {
        this.subhandler = subhandler == null ? null : subhandler.trim();
    }

    public String getSubrecordid() {
        return subrecordid;
    }

    public void setSubrecordid(String subrecordid) {
        this.subrecordid = subrecordid == null ? null : subrecordid.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSubcreatetime() {
        return subcreatetime;
    }

    public void setSubcreatetime(String subcreatetime) {
        this.subcreatetime = subcreatetime == null ? null : subcreatetime.trim();
    }

    public String getSubedittime() {
        return subedittime;
    }

    public void setSubedittime(String subedittime) {
        this.subedittime = subedittime == null ? null : subedittime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSubjectadd() {
        return subjectadd;
    }

    public void setSubjectadd(String subjectadd) {
        this.subjectadd = subjectadd == null ? null : subjectadd.trim();
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}