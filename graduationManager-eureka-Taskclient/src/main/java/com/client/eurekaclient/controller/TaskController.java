package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.mapper.UserMapper;
import com.client.eurekaclient.pojo.ArticleRecord;
import com.client.eurekaclient.service.ArticleRecordService;
import com.client.eurekaclient.service.TaskService;
import com.client.eurekaclient.tool.ExcelUtil;
import com.client.eurekaclient.tool.JwtToken;
import com.netflix.discovery.converters.Auto;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * @ClassName TaskController
 * @Author gaoyang
 * @Date 2019/4/517:23
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;
    @Autowired
    private ArticleRecordService articleRecordService;
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("createStuArticle")
    public String createStuArticle(@RequestBody JSONObject jsonObject){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String token = jsonObject.get("token").toString();
        String articlename = jsonObject.get("articlename").toString();
        String articleauth = jsonObject.get("articleauth").toString();
        String articlevalue = jsonObject.get("articlevalue").toString();
        String articlecreatetime = jsonObject.get("articlecreatetime").toString();
        String message = jsonObject.get("message").toString();
        String articleid = UUID.randomUUID().toString().replace("-", "");
        String artrecordid = UUID.randomUUID().toString().replace("-", "");
        String dealmethod = "发起申请";
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String creater = user.split(":")[6].split("\"")[1];
        taskService.createStuArticle(creater,articlename,
                articleauth,articlevalue,
                articlecreatetime,articleid,
                artrecordid,message,dealmethod);
        return "success";
    }

    @RequestMapping("TeaExamineArticleTask")
    public String TeaExamineArticleTask(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        String currmessage = jsonObject.get("currmessage").toString();
        String dealtime = jsonObject.get("dealtime").toString();
        String dealperson = jsonObject.get("dealperson").toString();
        String dealmethod = jsonObject.get("dealmethod").toString();
        String creatername = jsonObject.get("creatername").toString();
        String token = jsonObject.get("token").toString();
        String recordid = UUID.randomUUID().toString().replace("-", "");

        taskService.TeaExamineArticleTask(id,currmessage,dealtime,dealperson,dealmethod,recordid,creatername);
        return "success";
    }

    @RequestMapping("adminExamineArticleTask")
    public String adminExamineArticleTask(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        String currmessage = jsonObject.get("currmessage").toString();
        String dealtime = jsonObject.get("dealtime").toString();
        String dealperson = jsonObject.get("dealperson").toString();
        String dealmethod = jsonObject.get("dealmethod").toString();
        String creatername = jsonObject.get("creatername").toString();
        String token = jsonObject.get("token").toString();
        String recordid = UUID.randomUUID().toString().replace("-", "");

        taskService.adminExamineArticleTask(id,currmessage,dealtime,dealperson,dealmethod,recordid,creatername);
        return "success";
    }

    @RequestMapping("getArticleRecordCount")
    public String getArticleRecordCount(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        int count = articleRecordService.getArticleRecordCount(id);
        return String.valueOf(count);
    }

    @RequestMapping("getArticleRecord")
    public String getArticleRecord(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<ArticleRecord> list = articleRecordService.getArticleRecord(id,start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("teaSubmitArticle")
    public String teaSubmitArticle(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        String articlename = jsonObject.get("articlename").toString();
        String articleauth = jsonObject.get("articleauth").toString();
        String articlevalue = jsonObject.get("articlevalue").toString();
        String articlecreatetime = jsonObject.get("articlecreatetime").toString();
        String message = jsonObject.get("message").toString();
        String articleid = UUID.randomUUID().toString().replace("-", "");
        String artrecordid = UUID.randomUUID().toString().replace("-", "");
        String dealmethod = "发起申请";
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String creater = user.split(":")[6].split("\"")[1];
        taskService.teaSubmitArticle(creater,articlename,
                articleauth,articlevalue,
                articlecreatetime,articleid,
                artrecordid,message,dealmethod);
        return "success";
    }

    @RequestMapping("importExcel")
    public String importExcel(@RequestBody JSONObject jsonObject){
        String path = "C:\\Users\\hp\\Desktop\\"+jsonObject.get("fileName").toString();
        try {
            List<List<String>> result = new ExcelUtil().readXlsx(path);
            System.out.println("目标Excel中一共有"+result.size()+"行数据");
            for (int i = 0; i < result.size(); i++) {
                List<String> model = result.get(i);
                String uuid = UUID.randomUUID().toString().replace("-", "");
                String loginname = model.get(0);
                String name = model.get(1);
                String role = model.get(2).split(".0")[0];
                userMapper.importExcel(uuid,loginname,name,role);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }





}
