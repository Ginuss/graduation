package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.Subject;
import com.client.eurekaclient.pojo.SubjectExample;
import java.util.List;

public interface SubjectMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExample(SubjectExample example);

    Subject selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}