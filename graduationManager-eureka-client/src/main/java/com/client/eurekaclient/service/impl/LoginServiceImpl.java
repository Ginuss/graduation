package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.UserMapper;
import com.client.eurekaclient.pojo.User;
import com.client.eurekaclient.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoginServiceImpl
 * @Author gaoyang
 * @Date 2019/3/2017:01
 * @Version 1.0
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String getPass(String loginName, String role) {
        System.out.println("dsfsfdsfdsfdsfs"+ loginName);
        return userMapper.getPass(loginName, role);
    }

    @Override
    public User getUser(String loginName, String role) {
        return userMapper.getUser(loginName,role);
    }
}
