package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.User;

/**
 * @ClassName LoginService
 * @Author gaoyang
 * @Date 2019/3/2017:00
 * @Version 1.0
 **/
public interface LoginService {
    String getPass(String loginName, String role);

    User getUser(String loginName, String role);
}
