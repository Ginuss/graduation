package com.client.eurekaclient.service;

public interface TaskService {
    void createStuArticle(String creater, String articlename,
                          String articleauth, String articlevalue,
                          String articlecreatetime, String articleid,
                          String artrecordid, String message,String dealmethod);

    void TeaExamineArticleTask(String id, String currmessage,String dealtime,
                               String dealperson, String dealmethod, String recordid, String creatername);

    void adminExamineArticleTask(String id, String currmessage,String dealtime,
                               String dealperson, String dealmethod, String recordid, String creatername);

    void teaSubmitArticle(String creater, String articlename,
                          String articleauth, String articlevalue,
                          String articlecreatetime, String articleid,
                          String artrecordid, String message,String dealmethod);

}
