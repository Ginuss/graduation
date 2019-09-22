package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.pojo.SubRecord;
import com.client.eurekaclient.pojo.Subject;
import com.client.eurekaclient.service.SubjectService;
import com.client.eurekaclient.tool.JwtToken;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName SubjectController
 * @Author gaoyang
 * @Date 2019/4/1614:14
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("submitSubject")
    public String submitSubject(@RequestBody JSONObject jsonObject){
        String subname = jsonObject.get("subname").toString();
        String subauth = jsonObject.get("subauth").toString();
        String subcreatetime = jsonObject.get("subcreatetime").toString();
        String articleid = jsonObject.get("articleid").toString();
        String addr = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload2"+jsonObject.get("addr").toString();
        String subjectid = UUID.randomUUID().toString().replace("-", "");
        String subrecordid = UUID.randomUUID().toString().replace("-", "");
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String createrid = user.split(":")[6].split("\"")[1];
        subjectService.submitSubject(subjectid,subname,subauth,subrecordid,subcreatetime,addr,articleid,createrid);
        return "success";
    }

    @RequestMapping("getMySubjectCount")
    public String getMySubjectCount(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        int count = subjectService.getMySubjectCount(uuid);
        return String.valueOf(count);
    }

    @RequestMapping("getMySubject")
    public String getMySubject(@RequestBody JSONObject jsonObject){
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        List<Subject> list = subjectService.getMySubject(uuid,start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getSubjectRecord")
    public String getSubjectRecord(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        List<SubRecord> list = subjectService.getSubjectRecord(id);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getSubjectByChoose")
    public String getSubjectByChoose(@RequestBody JSONObject jsonObject){
        String stuid = jsonObject.get("stuid").toString();
        List<Subject> list = subjectService.getSubjectByChoose(stuid);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("TeaExamineSubjectTask")
    public String TeaExamineSubjectTask(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        String currmessage = jsonObject.get("currmessage").toString();
        String dealtime = jsonObject.get("dealtime").toString();
        String dealperson = jsonObject.get("dealperson").toString();
        String dealmethod = jsonObject.get("dealmethod").toString();
        String creatername = jsonObject.get("creatername").toString();
        String token = jsonObject.get("token").toString();
        String recordid = UUID.randomUUID().toString().replace("-", "");

        subjectService.TeaExamineSubjectTask(recordid,id,currmessage,dealperson,dealtime,dealmethod,creatername);
        return "success";
    }

    @RequestMapping("editSubject")
    public String editSubject(@RequestBody JSONObject jsonObject) {
        String subid = jsonObject.get("subid").toString();
        String subauth = jsonObject.get("subauth").toString();
        String subcreatetime = jsonObject.get("subcreatetime").toString();
        String subjectadd = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload" + jsonObject.get("addr").toString();
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim = null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        //这个creater是当前用户的id
        String creater = user.split(":")[6].split("\"")[1];
        subjectService.editReport(subid, subcreatetime, subauth, creater, subjectadd);
        return "success";
    }

    @RequestMapping("getSubjectFileCount")
    public String getSubjectFileCount(){
        int count = subjectService.getSubjectFileCount();
        return String.valueOf(count);
    }

    @RequestMapping("getSubjectFile")
    public String getSubjectFile(@RequestBody JSONObject jsonObject){
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<Subject> list = subjectService.getSubjectFile(start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }










}
