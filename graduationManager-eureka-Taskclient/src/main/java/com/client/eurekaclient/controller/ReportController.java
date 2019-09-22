package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.pojo.RepRecord;
import com.client.eurekaclient.pojo.Report;
import com.client.eurekaclient.service.ReportRecordService;
import com.client.eurekaclient.service.ReportService;
import com.client.eurekaclient.tool.JwtToken;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName ReportController
 * @Author gaoyang
 * @Date 2019/4/1015:20
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;
    @Autowired
    private ReportRecordService reportRecordService;
    @RequestMapping("submitReport")
    public String submitReport(@RequestBody JSONObject jsonObject){
        String reportid = UUID.randomUUID().toString().replace("-", "");
        String reprecordid = UUID.randomUUID().toString().replace("-", "");
        String repname = jsonObject.get("repname").toString();
        String repvalue = jsonObject.get("repvalue").toString();
        String repauth = jsonObject.get("repauth").toString();
        String repcreatetime = jsonObject.get("repcreatetime").toString();
        String articleid = jsonObject.get("articleid").toString();
        String reportaddr = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload"+jsonObject.get("reportaddr").toString();
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        //这个creater是当前用户的id
        String creater = user.split(":")[6].split("\"")[1];
        reportService.submitReport(reportid,reprecordid,repname,repvalue,repauth,repcreatetime,articleid,creater,reportaddr);
        return "success";
    }

    @RequestMapping("getMyReportCount")
    public String getMyReportCount(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String id = user.split(":")[6].split("\"")[1];
        int count = reportService.getMyReportCount(id);
        return String.valueOf(count);
    }

    @RequestMapping("getMyReport")
    public String getMyReport(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String id = user.split(":")[6].split("\"")[1];
        List<Report> list = reportService.getMyReport(id,start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getReportRecord")
    public String getReportRecord(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        List<RepRecord> list = reportRecordService.getReportRecord(id);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getReportByChoose")
    public String getReportByChoose(@RequestBody JSONObject jsonObject){
        String stuid = jsonObject.get("stuid").toString();
        List<Report> list = reportService.getReportByChoose(stuid);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("TeaExamineReportTask")
    public String TeaExamineReportTask(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        String currmessage = jsonObject.get("currmessage").toString();
        String dealtime = jsonObject.get("dealtime").toString();
        String dealperson = jsonObject.get("dealperson").toString();
        String dealmethod = jsonObject.get("dealmethod").toString();
        String creatername = jsonObject.get("creatername").toString();
        String token = jsonObject.get("token").toString();
        String recordid = UUID.randomUUID().toString().replace("-", "");

        reportService.TeaExamineReportTask(recordid,id,currmessage,dealperson,dealtime,dealmethod,creatername);
        return "success";
    }

    @RequestMapping("getReportByRepId")
    public String getReportByRepId(@RequestBody JSONObject jsonObject){
        String repid = jsonObject.get("repid").toString();
        List<Report> list = reportService.getReportByRepId(repid);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("editReport")
    public String editReport(@RequestBody JSONObject jsonObject){
        String reportid = jsonObject.get("repid").toString();
        String repvalue = jsonObject.get("repvalue").toString();
        String repauth = jsonObject.get("repauth").toString();
        String repcreatetime = jsonObject.get("repcreatetime").toString();
        String reportaddr = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload"+jsonObject.get("reportaddr").toString();
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        //这个creater是当前用户的id
        String creater = user.split(":")[6].split("\"")[1];
        reportService.editReport(reportid,repvalue,repcreatetime,repauth,creater,reportaddr);
        return "success";
    }

    @RequestMapping("getReportFileCount")
    public String getReportFileCount(){
       int count = reportService.getReportFileCount();
        return String.valueOf(count);
    }

    @RequestMapping("getReportFile")
    public String getReportFile(@RequestBody JSONObject jsonObject){
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<Report> list = reportService.getReportFile(start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }










}
