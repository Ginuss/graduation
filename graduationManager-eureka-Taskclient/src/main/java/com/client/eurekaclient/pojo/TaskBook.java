package com.client.eurekaclient.pojo;

public class TaskBook {
    private String uuid;

    private String taskname;

    private String taskvalue;

    private String taskauth;

    private String tasktime;

    private String taskhandler;

    private String subjectid;

    private String articleid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getTaskvalue() {
        return taskvalue;
    }

    public void setTaskvalue(String taskvalue) {
        this.taskvalue = taskvalue == null ? null : taskvalue.trim();
    }

    public String getTaskauth() {
        return taskauth;
    }

    public void setTaskauth(String taskauth) {
        this.taskauth = taskauth == null ? null : taskauth.trim();
    }

    public String getTasktime() {
        return tasktime;
    }

    public void setTasktime(String tasktime) {
        this.tasktime = tasktime == null ? null : tasktime.trim();
    }

    public String getTaskhandler() {
        return taskhandler;
    }

    public void setTaskhandler(String taskhandler) {
        this.taskhandler = taskhandler == null ? null : taskhandler.trim();
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid == null ? null : subjectid.trim();
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }
}