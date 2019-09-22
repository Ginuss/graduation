package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.pojo.Article;
import com.client.eurekaclient.pojo.User;
import com.client.eurekaclient.service.UserService;
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
 * @ClassName UserController
 * @Author gaoyang
 * @Date 2019/4/120:19
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getStudentCount")
    public String getStudentCount(){
        int a = userService.getStudentCount();
        return String.valueOf(a);
    }

    @RequestMapping("getStudent")
    public String getStudent(@RequestBody JSONObject jsonObject){
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<Map<String,String>> list = userService.getStudent(start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("searchStudentCount")
    public String searchStudentCount(@RequestBody JSONObject jsonObject){
        String stuname = jsonObject.get("stuname").toString();
        int count = userService.searchStudentCount(stuname);
        return String.valueOf(count);
    }

    @RequestMapping("searchStudent")
    public String searchStudent(@RequestBody JSONObject jsonObject){
        String stuname = jsonObject.get("stuname").toString();
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<User> list = userService.searchStudent(stuname,start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getGradeByToken")
    public String getGradeByToken(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        List<Map<String,String>> list = userService.getGrade(uuid);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("editPass")
    public String editPass(@RequestBody JSONObject jsonObject){
        String oldPass = jsonObject.get("oldPass").toString();
        String newPass = jsonObject.get("newPass").toString();
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        String currPass = userService.getCurrpass(uuid);
        if(currPass.equals(oldPass)){
            userService.editPass(uuid,newPass);
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping("getUserDetail")
    public String getUserDetail(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        List<User> list = userService.getUserDetail(uuid);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("editUserDetail")
    public String editUserDetail(@RequestBody JSONObject jsonObject){
        String email = jsonObject.get("email").toString();
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        userService.editUserDetail(uuid,email);
        return "success";
    }

    @RequestMapping("getGradeById")
    public String getGradeById(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        List<Map<String,String>> list = userService.getGradeById(id);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("submitGrade")
    public String submitGrade(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        String reportGrade = jsonObject.get("reportGrade").toString();
        String subjectGrade = jsonObject.get("subjectGrade").toString();
        String answerGrade = jsonObject.get("answerGrade").toString();
        userService.submitGrade(id,reportGrade,subjectGrade,answerGrade);
        return "success";
    }

    @RequestMapping("getUserDetailById")
    public String getUserDetailById(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        List<User> list = userService.getUserDetail(id);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("editUser")
    public String editUser(@RequestBody JSONObject jsonObject){
        String sid = jsonObject.get("sid").toString();
        String sname = jsonObject.get("sname").toString();
        String semail = jsonObject.get("semail").toString();
        String spass = jsonObject.get("spass").toString();
        userService.editUser(sid,sname,semail,spass);
        return "success";
    }

    @RequestMapping("getUserCount")
    public String getUserCount(){
        int count = userService.getUserCount();
        return String.valueOf(count);
    }

    @RequestMapping("getUser")
    public String getUser(@RequestBody JSONObject jsonObject){
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<User> list = userService.getUser(start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("addUser")
    public String addUser(@RequestBody JSONObject jsonObject){
        String name = jsonObject.get("name").toString();
        String loginname = jsonObject.get("loginname").toString();
        String role = jsonObject.get("role").toString();
        String uuid =  UUID.randomUUID().toString().replace("-", "");
        userService.addUser(uuid,loginname,name,role);
        return "success";
    }

    @RequestMapping("setRole")
    public String setRole(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        String role = jsonObject.get("role").toString();
        userService.setRole(id,role);
        return "success";
    }
















}
