package com.feign.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hi2")
public interface Client2Service {
    @RequestMapping(value = "/createStuArticle",method = RequestMethod.GET)
    String createStuArticle(JSONObject jsonObject);

    @RequestMapping(value = "/getMyArticleCount",method = RequestMethod.GET)
    String getMyArticleCount(JSONObject jsonObject);

    @RequestMapping(value = "/getMyArticle",method = RequestMethod.GET)
    String getMyArticle(JSONObject jsonObject);

    @RequestMapping(value = "/getMyHandlerArticleCount",method = RequestMethod.GET)
    String getMyHandlerArticleCount(JSONObject jsonObject);

    @RequestMapping(value = "/getMyHandlerArticle",method = RequestMethod.GET)
    String getMyHandlerArticle(JSONObject jsonObject);

    @RequestMapping(value = "/TeaExamineArticleTask",method = RequestMethod.GET)
    String TeaExamineArticleTask(JSONObject jsonObject);

    @RequestMapping(value = "/adminExamineArticleTask",method = RequestMethod.GET)
    String adminExamineArticleTask(JSONObject jsonObject);

    @RequestMapping(value = "/getArticleRecordCount",method = RequestMethod.GET)
    String getArticleRecordCount(JSONObject jsonObject);

    @RequestMapping(value = "/getArticleRecord",method = RequestMethod.GET)
    String getArticleRecord(JSONObject jsonObject);

    @RequestMapping(value = "/teaSubmitArticle",method = RequestMethod.GET)
    String teaSubmitArticle(JSONObject jsonObject);

    @RequestMapping(value = "/submitReport",method = RequestMethod.GET)
    String submitReport(JSONObject jsonObject);

    @RequestMapping(value = "/getMyReportCount",method = RequestMethod.GET)
    String getMyReportCount(JSONObject jsonObject);

    @RequestMapping(value = "/getMyReport",method = RequestMethod.GET)
    String getMyReport(JSONObject jsonObject);

    @RequestMapping(value = "/getReportRecord",method = RequestMethod.GET)
    String getReportRecord(JSONObject jsonObject);

    @RequestMapping(value = "/getReportByChoose",method = RequestMethod.GET)
    String getReportByChoose(JSONObject jsonObject);

    @RequestMapping(value = "/TeaExamineReportTask",method = RequestMethod.GET)
    String TeaExamineReportTask(JSONObject jsonObject);

    @RequestMapping(value = "/getReportByRepId",method = RequestMethod.GET)
    String getReportByRepId(JSONObject jsonObject);

    @RequestMapping(value = "/editReport",method = RequestMethod.GET)
    String editReport(JSONObject jsonObject);

    @RequestMapping(value = "/submitSubject",method = RequestMethod.GET)
    String submitSubject(JSONObject jsonObject);

    @RequestMapping(value = "/getMySubjectCount",method = RequestMethod.GET)
    String getMySubjectCount(JSONObject jsonObject);

    @RequestMapping(value = "/getMySubject",method = RequestMethod.GET)
    String getMySubject(JSONObject jsonObject);

    @RequestMapping(value = "/getSubjectRecord",method = RequestMethod.GET)
    String getSubjectRecord(JSONObject jsonObject);

    @RequestMapping(value = "/getSubjectByChoose",method = RequestMethod.GET)
    String getSubjectByChoose(JSONObject jsonObject);

    @RequestMapping(value = "/TeaExamineSubjectTask",method = RequestMethod.GET)
    String TeaExamineSubjectTask(JSONObject jsonObject);

    @RequestMapping(value = "/editSubject",method = RequestMethod.GET)
    String editSubject(JSONObject jsonObject);

    @RequestMapping(value = "/getReportFileCount",method = RequestMethod.GET)
    String getReportFileCount();

    @RequestMapping(value = "/getReportFile",method = RequestMethod.GET)
    String getReportFile(JSONObject jsonObject);

    @RequestMapping(value = "/getSubjectFileCount",method = RequestMethod.GET)
    String getSubjectFileCount();

    @RequestMapping(value = "/getSubjectFile",method = RequestMethod.GET)
    String getSubjectFile(JSONObject jsonObject);

    @RequestMapping(value = "/importExcel",method = RequestMethod.GET)
    String importExcel(JSONObject jsonObject);


























}



