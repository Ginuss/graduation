package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.Subject;
import com.client.eurekaclient.pojo.SubjectExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SubjectMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExample(SubjectExample example);

    Subject selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);

    void submitSubject(@Param("subjectid")String subjectid,@Param("subname")String subname,
                       @Param("subauth")String subauth,@Param("subrecordid")String subrecordid,
                       @Param("subcreatetime")String subcreatetime,@Param("addr")String addr,
                       @Param("articleid")String articleid, @Param("createrid")String createrid);

    int getMySubjectCount(@Param("uuid")String uuid );

    List<Subject> getMySubject(@Param("uuid")String uuid ,@Param("start") int start,@Param("limit")int limit);

    List<Subject> getSubjectByChoose(@Param("stuid") String stuid);

    void updateReport(@Param("status") String status,@Param("subhandler") String subhandler,@Param("creatername")String creatername);

    void editReport(@Param("subid")String subid,@Param("subauth")String subauth,@Param("subcreatetime")String subcreatetime,@Param("subjectadd")String subjectadd);

    int getSubjectFileCount();

    List<Subject> getSubjectFile(@Param("start")int start,@Param("limit")int limit);
}