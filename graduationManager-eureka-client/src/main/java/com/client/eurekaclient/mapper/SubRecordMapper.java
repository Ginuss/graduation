package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.SubRecord;
import com.client.eurekaclient.pojo.SubRecordExample;
import java.util.List;

public interface SubRecordMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(SubRecord record);

    int insertSelective(SubRecord record);

    List<SubRecord> selectByExample(SubRecordExample example);

    SubRecord selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(SubRecord record);

    int updateByPrimaryKey(SubRecord record);
}