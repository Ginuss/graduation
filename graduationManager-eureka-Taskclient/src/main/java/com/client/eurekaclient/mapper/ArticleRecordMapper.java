package com.client.eurekaclient.mapper;


import com.client.eurekaclient.pojo.ArticleRecord;
import com.client.eurekaclient.pojo.ArticleRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleRecordMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(ArticleRecord record);

    int insertSelective(ArticleRecord record);

    List<ArticleRecord> selectByExample(ArticleRecordExample example);

    ArticleRecord selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(ArticleRecord record);

    int updateByPrimaryKey(ArticleRecord record);
//第一次增加record，id是从token中获取
    void createRecord(@Param("artrecordid")String artrecordid, @Param("articleid")String articleid,
                   @Param("message")String message,@Param("articlecreatetime") String articlecreatetime,
                   @Param("creater") String creater,@Param("dealmethod") String dealmethod);
//第二次以后增加record，可从页面直接拿数据
    void addRecord(@Param("recordid") String recordid,@Param("id") String id,
                   @Param("currmessage") String currmessage,@Param("dealtime") String dealtime,
                   @Param("dealperson") String dealperson,@Param("dealmethod") String dealmethod);

    int getArticleRecordCount(@Param("id") String id);

    List<ArticleRecord> getArticleRecord(@Param("id")String id ,@Param("start") int start ,@Param("limit")int limit);
}