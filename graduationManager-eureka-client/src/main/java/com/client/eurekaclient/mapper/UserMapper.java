package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.User;
import com.client.eurekaclient.pojo.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(String uuid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    String getPass(@Param("loginName") String loginName,@Param("role") String role);

    User getUser(@Param("loginName") String loginName,@Param("role") String role);

    int getStudentCount();

    List<Map<String,String>> getStudent(@Param("start")int start, @Param("limit") int limit);

    int searchStudentCount(@Param("stuname") String stuname);

    List<User> searchStudent(@Param("stuname") String stuname, @Param("start") int start, @Param("limit") int limit);

    List<Map<String,String>> getGrade(@Param("uuid") String uuid);

    String getCurrpass(@Param("uuid")String uuid);

    void editPass(@Param("uuid")String uuid,@Param("newPass") String newPass);

    List<User> getUserDetail(@Param("uuid")String uuid);

    void editUserDetail(@Param("uuid")String uuid,@Param("email")String email);

    void submitGrade(@Param("id")String id,@Param("reportGrade")String reportGrade,@Param("subjectGrade")String subjectGrade,@Param("answerGrade")String answerGrade);

    void editUser(@Param("sid")String sid,@Param("sname")String sname,@Param("semail")String semail,@Param("spass")String spass);

    int getUserCount();

    List<User> getAllUser(@Param("start")int start,@Param("limit")int limit);

    void addUser(@Param("uuid")String uuid,@Param("loginname")String loginname,@Param("name")String name,@Param("role")String role);

    void setRole(@Param("id")String id,@Param("role")String role);
}