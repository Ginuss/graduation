package com.feign.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName Client1Service
 * @Author gaoyang
 * @Date 2019/3/1512:15
 * @Version 1.0
 **/
@FeignClient(value = "service-hi1")
public interface Client1Service {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    String login(JSONObject jsonObject);

    @RequestMapping(value = "/getLogo",method = RequestMethod.GET)
    String getLogo(JSONObject jsonObject);

    @RequestMapping(value = "/getNotice",method = RequestMethod.GET)
    String getNotice();

    @RequestMapping(value = "/getArticle",method = RequestMethod.GET)
    String getArticle(JSONObject jsonObject);

    @RequestMapping(value = "/getArticleByChoose",method = RequestMethod.GET)
    String getArticleByChoose(JSONObject jsonObject);

    @RequestMapping(value = "/searchArticle",method = RequestMethod.GET)
    String searchArticle(JSONObject jsonObject);

    @RequestMapping(value = "/delArticleByChoose",method = RequestMethod.GET)
    String delArticleByChoose(JSONObject jsonObject);

    @RequestMapping(value = "/chooseArticle",method = RequestMethod.GET)
    String chooseArticle(JSONObject jsonObject);

    @RequestMapping(value = "/getArticleCount",method = RequestMethod.GET)
    String getArticleCount();

    @RequestMapping(value = "/getArticleCount2",method = RequestMethod.GET)
    String getArticleCount2(JSONObject jsonObject);

    @RequestMapping(value = "/getTaskBook",method = RequestMethod.GET)
    String getTaskBook(JSONObject jsonObject);

    @RequestMapping(value = "/updateArticle",method = RequestMethod.GET)
    String updateArticle(JSONObject jsonObject);

    @RequestMapping(value = "/delArticle",method = RequestMethod.GET)
    String delArticle(JSONObject jsonObject);

    @RequestMapping(value = "/getStudentCount",method = RequestMethod.GET)
    String getStudentCount();

    @RequestMapping(value = "/getStudent",method = RequestMethod.GET)
    String getStudent(JSONObject jsonObject);

    @RequestMapping(value = "/submitTaskBook",method = RequestMethod.GET)
    String submitTaskBook(JSONObject jsonObject);

    @RequestMapping(value = "/queryTaskBook",method = RequestMethod.GET)
    String queryTaskBook(JSONObject jsonObject);

    @RequestMapping(value = "/searchStudentCount",method = RequestMethod.GET)
    String searchStudentCount(JSONObject jsonObject);

    @RequestMapping(value = "/searchStudent",method = RequestMethod.GET)
    String searchStudent(JSONObject jsonObject);

    @RequestMapping(value = "/getMyNotice",method = RequestMethod.GET)
    String getMyNotice(JSONObject jsonObject);

    @RequestMapping(value = "/getAdminNotice",method = RequestMethod.GET)
    String getAdminNotice();

    @RequestMapping(value = "/getGradeByToken",method = RequestMethod.GET)
    String getGradeByToken(JSONObject jsonObject);

    @RequestMapping(value = "/editPass",method = RequestMethod.GET)
    String editPass(JSONObject jsonObject);

    @RequestMapping(value = "/getUserDetail",method = RequestMethod.GET)
    String getUserDetail(JSONObject jsonObject);

    @RequestMapping(value = "/editUserDetail",method = RequestMethod.GET)
    String editUserDetail(JSONObject jsonObject);

    @RequestMapping(value = "/getGradeById",method = RequestMethod.GET)
    String getGradeById(JSONObject jsonObject);

    @RequestMapping(value = "/submitGrade",method = RequestMethod.GET)
    String submitGrade(JSONObject jsonObject);

    @RequestMapping(value = "/addNotice",method = RequestMethod.GET)
    String addNotice(JSONObject jsonObject);

    @RequestMapping(value = "/addArticle",method = RequestMethod.GET)
    String addArticle(JSONObject jsonObject);

    @RequestMapping(value = "/getUserDetailById",method = RequestMethod.GET)
    String getUserDetailById(JSONObject jsonObject);

    @RequestMapping(value = "/editUser",method = RequestMethod.GET)
    String editUser(JSONObject jsonObject);

    @RequestMapping(value = "/getNoticeCount",method = RequestMethod.GET)
    String getNoticeCount();

    @RequestMapping(value = "/getNoticeByPage",method = RequestMethod.GET)
    String getNoticeByPage(JSONObject jsonObject);

    @RequestMapping(value = "/delNoticeById",method = RequestMethod.GET)
    String delNoticeById(JSONObject jsonObject);

    @RequestMapping(value = "/searchNoticeCount",method = RequestMethod.GET)
    String searchNoticeCount(JSONObject jsonObject);

    @RequestMapping(value = "/searchNotice",method = RequestMethod.GET)
    String searchNotice(JSONObject jsonObject);

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    String getUserCount();

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    String getUser(JSONObject jsonObject);

    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    String addUser(JSONObject jsonObject);

    @RequestMapping(value = "/setRole",method = RequestMethod.GET)
    String setRole(JSONObject jsonObject);

    @RequestMapping(value = "/getNoticeByName",method = RequestMethod.GET)
    String getNoticeByName(JSONObject jsonObject);





















}
