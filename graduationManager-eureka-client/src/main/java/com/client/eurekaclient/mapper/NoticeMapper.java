package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.Notice;
import com.client.eurekaclient.pojo.NoticeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Notice> getAll();

    List<Notice> getMyNotice(@Param("stuid")String stuid);

    List<Notice> getAdminNotice();

    void addNotice(@Param("uuid")String uuid,@Param("noticename")String noticename,@Param("noticeauth") String noticeauth,@Param("noticevalue")String noticevalue);

    int getNoticeCount();

    List<Notice> getNoticeByPage(@Param("start")int start,@Param("limit")int limit);

    void delNoticeById(@Param("id")String id );

    int searchNoticeCount(@Param("author") String author);

    List<Notice>  searchNotice(@Param("author")String author,@Param("start")int start,@Param("limit")int limit);

    List<Notice> getNoticeByName(@Param("noticename") String noticename);
}