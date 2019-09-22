package com.feign.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.feign.service.Client1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName LoginController
 * @Author gaoyang
 * @Date 2019/3/1818:12
 * @Version 1.0
 **/
@RestController
public class LoginController {
    @Autowired
    Client1Service client1Service;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/login")
    public String login(){
        JSONObject json= JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.login(json);
    }

    @RequestMapping("/getLogo")
    public String getLogo(){
        JSONObject json= JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getLogo(json);
    }
    @RequestMapping(value = "/getNotice")
    String getNotice(){return client1Service.getNotice();}

    @RequestMapping("/getArticle")
    public String getArticle(){
        JSONObject json= JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getArticle(json);
    }

    @RequestMapping("/getArticleByChoose")
    public String getArticleByChoose(){
        String token = request.getParameter("token");
        String aa = "[{\"token\":\""+token+"\"}]";
        JSONArray json = JSONArray.parseArray(aa);
        System.out.println(json.toString());
        JSONObject s =(JSONObject) json.get(0);
        return client1Service.getArticleByChoose(s);
    }

    @RequestMapping("/searchArticle")
    public String searchArticle(){
        JSONObject json= JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.searchArticle(json);
    }

    @RequestMapping("/delArticleByChoose")
    public String delArticleByChoose(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.delArticleByChoose(json);
    }

    @RequestMapping("/chooseArticle")
    public String chooseArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.chooseArticle(json);
    }

    @RequestMapping("/getArticleCount")
    public String getArticleCount(){
        return client1Service.getArticleCount();
    }

    @RequestMapping("/getArticleCount2")
    public String getArticleCount2(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getArticleCount2(json);
    }

    @RequestMapping("/getTaskBook")
    public String getTaskBook(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getTaskBook(json);
    }

    @RequestMapping("/updateArticle")
    public String updateArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.updateArticle(json);
    }

    @RequestMapping("/delArticle")
    public String delArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.delArticle(json);
    }

    @RequestMapping("/getStudentCount")
    public String getStudentCount(){
        return client1Service.getStudentCount();
    }

    @RequestMapping("/getStudent")
    public String getStudent(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getStudent(json);
    }

    @RequestMapping("/submitTaskBook")
    public String submitTaskBook(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.submitTaskBook(json);
    }

    @RequestMapping("/queryTaskBook")
    public String queryTaskBook(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.queryTaskBook(json);
    }

    @RequestMapping("/searchStudentCount")
    public String searchStudentCount(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.searchStudentCount(json);
    }

    @RequestMapping("/searchStudent")
    public String searchStudent(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.searchStudent(json);
    }

    @RequestMapping("/getMyNotice")
    public String getMyNotice(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getMyNotice(json);
    }

    @RequestMapping("/getAdminNotice")
    public String getAdminNotice(){
        return client1Service.getAdminNotice();
    }

    @RequestMapping("/getGradeByToken")
    public String getGradeByToken(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getGradeByToken(json);
    }

    @RequestMapping("/editPass")
    public String editPass(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.editPass(json);
    }

    @RequestMapping("/getUserDetail")
    public String getUserDetail(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getUserDetail(json);
    }

    @RequestMapping("/editUserDetail")
    public String editUserDetail(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.editUserDetail(json);
    }

    @RequestMapping("/getGradeById")
    public String getGradeById(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getGradeById(json);
    }

    @RequestMapping("/submitGrade")
    public String submitGrade(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.submitGrade(json);
    }

    @RequestMapping("/addNotice")
    public String addNotice(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.addNotice(json);
    }

    @RequestMapping("/addArticle")
    public String addArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.addArticle(json);
    }

    @RequestMapping("/getUserDetailById")
    public String getUserDetailById(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getUserDetailById(json);
    }

    @RequestMapping("/editUser")
    public String editUser(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.editUser(json);
    }

    @RequestMapping("/getNoticeCount")
    public String getNoticeCount(){
        return client1Service.getNoticeCount();
    }

    @RequestMapping("/getNoticeByPage")
    public String getNoticeByPage(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getNoticeByPage(json);
    }

    @RequestMapping("/delNoticeById")
    public String delNoticeById(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.delNoticeById(json);
    }

    @RequestMapping("/searchNoticeCount")
    public String searchNoticeCount(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.searchNoticeCount(json);
    }

    @RequestMapping("/searchNotice")
    public String searchNotice(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.searchNotice(json);
    }

    @RequestMapping("/getUserCount")
    public String getUserCount(){
        return client1Service.getUserCount();
    }

    @RequestMapping("/getUser")
    public String getUser(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getUser(json);
    }

    @RequestMapping("/addUser")
    public String addUser(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.addUser(json);
    }

    @RequestMapping("/setRole")
    public String setRole(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.setRole(json);
    }

    @RequestMapping("/getNoticeByName")
    public String getNoticeByName(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client1Service.getNoticeByName(json);
    }































}

