package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.TaskBookMapper;
import com.client.eurekaclient.service.TaskBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TaskBookServiceImpl
 * @Author gaoyang
 * @Date 2019/3/2917:45
 * @Version 1.0
 **/
@Service
public class TaskBookServiceImpl implements TaskBookService {
    @Autowired
    private TaskBookMapper taskBookMapper;
    @Override
    public String getTaskBook(String stuid) {
        return taskBookMapper.getTaskBook(stuid);
    }

    @Override
    public void submitTaskBook(String taskid, String taskname, String taskvalue, String taskauth, String tasktime, String articlename) {
        taskBookMapper.submitTaskBook(taskid,taskname,taskvalue,taskauth,tasktime,articlename);
    }

    @Override
    public String queryTaskBook(String artname) {
        return taskBookMapper.queryTaskBook(artname);
    }
}
