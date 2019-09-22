package com.client.eurekaclient.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.client.eurekaclient.mapper.UserMapper;
import com.client.eurekaclient.pojo.User;
import com.client.eurekaclient.service.LoginService;
import com.client.eurekaclient.tool.JwtToken;
import net.sf.json.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DemoController
 * @Author gaoyang
 * @Date 2019/3/1818:14
 * @Version 1.0
 **/
@EnableEurekaClient
@RestController
public class LoginController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    LoginService loginService;

    @RequestMapping("login")
    public String login(@RequestBody JSONObject jsonObject){
        String name = jsonObject.get("name").toString();
        String password = jsonObject.get("password").toString();
        String role = jsonObject.get("role").toString();
        String currPass = loginService.getPass(name, role);
        Map<String, String> result = new HashMap<>();
        if(password.equals(currPass)){
            result.put("msg","登录成功");
            //找当前登入用户
            User currUser = loginService.getUser(name, role);
            try {
                result.put("token", JwtToken.createToken(JSONObject.toJSONString(currUser)));
            } catch (UnsupportedEncodingException e) {
                result.put("msg","token生成错误，请重试!!!");
                e.printStackTrace();
            }
        } else {
            result.put("msg","用户名或密码错误!!!");
        }
        return JSONArray.toJSONString(result);
    }

    @RequestMapping("getLogo")
    public String getLogo(@RequestBody JSONObject jsonObject){
        String token = jsonObject.get("token").toString();
        try {
            Map<String, Claim> claim= (Map<String, Claim>) JwtToken.verifyToken(token);
            String user = claim.get("content").asString();
            String jsonUser = jsonObject.toJSONString(user);
            return jsonUser;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
