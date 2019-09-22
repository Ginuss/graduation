package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.pojo.Article;
import com.client.eurekaclient.service.ArticleService;
import com.client.eurekaclient.tool.JwtToken;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName ArticleController
 * @Author gaoyang
 * @Date 2019/3/2610:47
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("getArticle")
    public String getArticle(@RequestBody JSONObject jsonObject){
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<Article> list = articleService.getAll(start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getArticleByChoose")
    public String getArticleByChoose(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        List<Article> list = articleService.getArticleByChoose(uuid);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("searchArticle")
    public String searchArticle(@RequestBody JSONObject jsonObject){
        String status = jsonObject.get("status").toString();
        String articleauth = jsonObject.get("articleauth").toString();
        int curr = Integer.parseInt(jsonObject.get("curr").toString());
        int limit = Integer.parseInt(jsonObject.get("limit").toString());
        int start = (curr-1)*limit;
        List<Article> list = articleService.searchArticle(status,articleauth,start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("delArticleByChoose")
    public String delArticleByChoose(@RequestBody JSONObject jsonObject){
        String artid = jsonObject.get("artid").toString();
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String stuid = user.split(":")[6].split("\"")[1];
        articleService.delArticleByChoose(stuid,artid);
        return "success";
    }

    @RequestMapping("chooseArticle")
    public String chooseArticle(@RequestBody JSONObject jsonObject){
        String artid = jsonObject.get("artid").toString();
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String stuid = user.split(":")[6].split("\"")[1];
        articleService.chooseArticle(stuid,artid);
        List<Article> list = articleService.getArticleByChoose(stuid);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getArticleCount")
    public String getArticleCount(){
        int count = articleService.getArticleCount();
        return String.valueOf(count);
    }

    @RequestMapping("getArticleCount2")
    public String getArticleCount2(@RequestBody JSONObject jsonObject){
        String status = jsonObject.get("status").toString();
        String articleauth = jsonObject.get("articleauth").toString();
        int count = articleService.getArticleCount2(status,articleauth);
        return String.valueOf(count);
    }

    @RequestMapping("updateArticle")
    public String updateArticle(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        String articlename = jsonObject.get("articlename").toString();
        String articlevalue = jsonObject.get("articlevalue").toString();
        String edittime = jsonObject.get("edittime").toString();
        articleService.updateArticle(id,articlename,articlevalue,edittime);
        return "success";
    }

    @RequestMapping("delArticle")
    public String delArticle(@RequestBody JSONObject jsonObject){
        String id = jsonObject.get("id").toString();
        articleService.delArticle(id);
        return "success";
    }

    @RequestMapping("addArticle")
    public String addArticle(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        String articlename = jsonObject.get("articlename").toString();
        String articleauth = jsonObject.get("articleauth").toString();
        String articlevalue = jsonObject.get("articlevalue").toString();
        String articlecreatetime = jsonObject.get("articlecreatetime").toString();
        String articleid =  UUID.randomUUID().toString().replace("-", "");
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        articleService.addArticle(articleid,articlename,articlevalue,articleauth,articlecreatetime,uuid);
        return "success";
    }

}
