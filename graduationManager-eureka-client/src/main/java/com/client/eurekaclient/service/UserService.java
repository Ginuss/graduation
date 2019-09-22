package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    int getStudentCount();

    List<Map<String,String>> getStudent(int start,int limit);

    int searchStudentCount(String stuname);

    List<User> searchStudent(String stuname, int start, int limit);

    List<Map<String,String>> getGrade(String uuid);

    String getCurrpass(String uuid);

    void editPass(String uuid,String newPass);

    List<User> getUserDetail(String uuid);

    void editUserDetail(String uuid,String email);

    List<Map<String,String>> getGradeById(String id);

    void submitGrade(String id,String reportGrade,String subjectGrade,String answerGrade);

    void editUser(String sid,String sname,String semail,String spass);

    int getUserCount();

    List<User> getUser(int start, int limit);

    void addUser(String uuid,String loginname, String name,String role);

    void setRole(String id,String role);


}
