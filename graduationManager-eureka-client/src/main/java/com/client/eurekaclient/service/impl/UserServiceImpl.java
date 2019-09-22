package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.UserMapper;
import com.client.eurekaclient.pojo.User;
import com.client.eurekaclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Author gaoyang
 * @Date 2019/4/120:20
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int getStudentCount() {
        return userMapper.getStudentCount();
    }

    @Override
    public List<Map<String, String>> getStudent(int start, int limit) {
        return userMapper.getStudent(start,limit);
    }

    @Override
    public int searchStudentCount(String stuname) {
        return userMapper.searchStudentCount(stuname);
    }

    @Override
    public List<User> searchStudent(String stuname, int start, int limit) {
        return userMapper.searchStudent(stuname,start,limit);

    }

    @Override
    public List<Map<String, String>> getGrade(String uuid) {
        return userMapper.getGrade(uuid);
    }

    @Override
    public String getCurrpass(String uuid) {
        return userMapper.getCurrpass(uuid);
    }

    @Override
    public void editPass(String uuid, String newPass) {
        userMapper.editPass(uuid,newPass);
    }

    @Override
    public List<User> getUserDetail(String uuid) {
        return userMapper.getUserDetail(uuid);
    }

    @Override
    public void editUserDetail(String uuid, String email) {
        userMapper.editUserDetail(uuid,email);
    }

    @Override
    public List<Map<String, String>> getGradeById(String id) {
        return userMapper.getGrade(id);
    }

    @Override
    public void submitGrade(String id, String reportGrade, String subjectGrade, String answerGrade) {
        userMapper.submitGrade(id,reportGrade,subjectGrade,answerGrade);

    }

    @Override
    public void editUser(String sid, String sname, String semail, String spass) {
        userMapper.editUser(sid,sname,semail,spass);
    }

    @Override
    public int getUserCount() {
        return userMapper.getUserCount();
    }

    @Override
    public List<User> getUser(int start, int limit) {
        return userMapper.getAllUser(start,limit);
    }

    @Override
    public void addUser(String uuid, String loginname, String name, String role) {
        userMapper.addUser(uuid,loginname,name,role);
    }

    @Override
    public void setRole(String id, String role) {
        userMapper.setRole(id,role);
    }
}
