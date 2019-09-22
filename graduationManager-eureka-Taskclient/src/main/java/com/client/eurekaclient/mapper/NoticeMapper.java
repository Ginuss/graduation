package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.Notice;
import com.client.eurekaclient.pojo.NoticeExample;
import org.apache.ibatis.annotations.Mapper;

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
}