package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.ArticleRecord;
import com.client.eurekaclient.pojo.ArticleRecordExample;
import java.util.List;

public interface ArticleRecordMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(ArticleRecord record);

    int insertSelective(ArticleRecord record);

    List<ArticleRecord> selectByExample(ArticleRecordExample example);

    ArticleRecord selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(ArticleRecord record);

    int updateByPrimaryKey(ArticleRecord record);
}