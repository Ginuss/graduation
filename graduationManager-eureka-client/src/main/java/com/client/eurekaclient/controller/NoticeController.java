package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.pojo.Notice;
import com.client.eurekaclient.service.NoticeService;
import com.client.eurekaclient.tool.JwtToken;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * @ClassName NoticeController
 * @Author gaoyang
 * @Date 2019/3/2413:06
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class NoticeController {
    @Autowired
    private NoticeService noticeService;
    @RequestMapping("getNotice")
    public String getNotice(){
        Map<String,String> result = new HashMap<>();
        List<Notice> list = noticeService.getNotice();
        String noticeList = JSONObject.toJSONString(list);
        result.put("msg","success");
        result.put("res",noticeList);
        return JSONObject.toJSONString(result);
    }

    @RequestMapping("getMyNotice")
    public String getMyNotice(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String stuid = user.split(":")[6].split("\"")[1];
        List<Notice> list = noticeService.getMyNotice(stuid);
        String result = JSONObject.toJSONString(list);
        net.sf.json.JSONArray res= JSONArray.fromObject(result);
        return res.toString();    }

    @RequestMapping("getAdminNotice")
    public String getAdminNotice(){
        List<Notice> list = noticeService.getAdminNotice();
        String result = JSONObject.toJSONString(list);
        net.sf.json.JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("addNotice")
    public String addNotice(@RequestBody JSONObject jsonObject){
        String noticename = jsonObject.get("noticename").toString();
        String noticeauth= jsonObject.get("noticeauth").toString();
        String noticevalue = jsonObject.get("noticevalue").toString();
        String uuid =  UUID.randomUUID().toString().replace("-", "");
        noticeService.addNotice(uuid,noticename,noticeauth,noticevalue);
        return "success";
    }

    @RequestMapping("getNoticeCount")
    public String getNoticeCount(){
        int count = noticeService.getNoticeCount();
        return String.valueOf(count);
    }

    @RequestMapping("getNoticeByPage")
    public String getNoticeByPage(@RequestBody JSONObject jsonObject){
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<Notice> list = noticeService.getNoticeByPage(start,limit);
        String result = JSONObject.toJSONString(list);
        net.sf.json.JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("delNoticeById")
    public String delNoticeById(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        noticeService.delNoticeById(id);
        return "success";
    }

    @RequestMapping("searchNoticeCount")
    public String searchNoticeCount(@RequestBody JSONObject jsonObject){
        String author = jsonObject.get("author").toString();
        int count = noticeService.searchNoticeCount(author);
        return String.valueOf(count);
    }

    @RequestMapping("searchNotice")
    public String searchNotice(@RequestBody JSONObject jsonObject){
        String author = jsonObject.get("author").toString();
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<Notice> list = noticeService.searchNotice(author,start,limit);
        String result = JSONObject.toJSONString(list);
        net.sf.json.JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getNoticeByName")
    public String getNoticeByName(@RequestBody JSONObject jsonObject){
        String noticename = jsonObject.get("noticename").toString();
        List<Notice> list = noticeService.getNoticeByName(noticename);
        String result = JSONObject.toJSONString(list);
        net.sf.json.JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }









}
