package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.client.eurekaclient.pojo.Article;
import com.client.eurekaclient.service.ArticleService;
import com.client.eurekaclient.tool.JwtToken;
import com.netflix.discovery.converters.Auto;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ArticleController
 * @Author gaoyang
 * @Date 2019/4/521:58
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("getMyArticleCount")
    public String getMyArticleCount(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        int count = articleService.getMyArticleCount(uuid);
        return String.valueOf(count);
    }

    @RequestMapping("getMyArticle")
    public String getMyArticle(@RequestBody JSONObject jsonObject){
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
        List<Article> list = articleService.getMyArticle(uuid,start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }

    @RequestMapping("getMyHandlerArticleCount")
    public String getMyHandlerArticleCount(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        Map<String, Claim> claim= null;
        try {
            claim = (Map<String, Claim>) JwtToken.verifyToken(token);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String user = claim.get("content").asString();
        String uuid = user.split(":")[6].split("\"")[1];
        int count = articleService.getMyHandlerArticleCount(uuid);
        return String.valueOf(count);
    }

    @RequestMapping("getMyHandlerArticle")
    public String getMyHandlerArticle(@RequestBody JSONObject jsonObject){
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
        List<Article> list = articleService.getMyHandlerArticle(uuid,start,limit);
        String result = JSONObject.toJSONString(list);
        JSONArray res= JSONArray.fromObject(result);
        return res.toString();
    }






}
