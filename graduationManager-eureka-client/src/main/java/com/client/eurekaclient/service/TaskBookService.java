package com.client.eurekaclient.service;

public interface TaskBookService {
    String getTaskBook(String stuid);

    void submitTaskBook(String taskid, String taskname,String taskvalue, String taskauth,String tasktime,String articlename);

    String queryTaskBook(String artname);
}
