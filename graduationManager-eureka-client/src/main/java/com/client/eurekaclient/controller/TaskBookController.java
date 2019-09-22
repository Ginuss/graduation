package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.service.TaskBookService;
import com.client.eurekaclient.tool.JwtToken;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName TaskBookController
 * @Author gaoyang
 * @Date 2019/3/2917:44
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class TaskBookController {
    @Autowired
    private TaskBookService taskBookService;
    @RequestMapping("getTaskBook")
    public String getTaskBook(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String stuid = user.split(":")[6].split("\"")[1];
        String taskBook = taskBookService.getTaskBook(stuid);
        return taskBook;
    }

    @RequestMapping("submitTaskBook")
    public String submitTaskBook(@RequestBody JSONObject jsonObject){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String taskid = UUID.randomUUID().toString().replace("-", "");
        String taskname = jsonObject.get("taskname").toString();
        String taskvalue = jsonObject.get("taskvalue").toString();
        String taskauth = jsonObject.get("teaname").toString();
        String tasktime = sdf.format(new Date());
        String articlename = jsonObject.get("articlename").toString();
        taskBookService.submitTaskBook(taskid,taskname,taskvalue,taskauth,tasktime,articlename);
        return "success";
    }

    @RequestMapping("queryTaskBook")
    public String queryTaskBook(@RequestBody JSONObject jsonObject){
        String artname = jsonObject.get("artname").toString();
        String taskvalue = taskBookService.queryTaskBook(artname);
        return taskvalue;
    }

}
