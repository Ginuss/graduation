package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.RepRecord;
import com.client.eurekaclient.pojo.RepRecordExample;
import java.util.List;

public interface RepRecordMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(RepRecord record);

    int insertSelective(RepRecord record);

    List<RepRecord> selectByExample(RepRecordExample example);

    RepRecord selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(RepRecord record);

    int updateByPrimaryKey(RepRecord record);
}