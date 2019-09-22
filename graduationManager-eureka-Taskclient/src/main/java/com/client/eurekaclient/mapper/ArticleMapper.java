package com.client.eurekaclient.mapper;


import com.client.eurekaclient.pojo.Article;
import com.client.eurekaclient.pojo.ArticleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> getAll(@Param("start") int start,@Param("limit") int limit);

    List<Article> getArticleByChoose(@Param("uuid") String uuid);

    List<Article> searchArticle(@Param("status")String status, @Param("articleauth")String articleauth,@Param("start") int start,@Param("limit") int limit);

    void delArticleByChoose(@Param("stuid") String stuid,@Param("artid") String artid);

    void chooseArticle(@Param("stuid") String stuid,@Param("artid") String artid);

    int getArticleCount();

    int getArticleCount2(@Param("status")String status, @Param("articleauth")String articleauth);

    void updateArticle(@Param("id") String id,@Param("articlename") String articlename,@Param("articlevalue") String articlevalue,@Param("edittime")String edittime);

    void delArticle(@Param("id") String id);

    void createStuArticle(@Param("creater") String creater, @Param("articlename")String articlename,
                          @Param("articleauth")String articleauth, @Param("articlevalue")String articlevalue,
                          @Param("articlecreatetime")String articlecreatetime, @Param("articleid")String articleid,
                          @Param("artrecordid")String artrecordid, @Param("message")String message);

    int getMyArticleCount(@Param("uuid") String uuid);

    List<Article> getMyArticle(@Param("uuid") String uuid,@Param("start") int start,@Param("limit") int limit);

    int getMyHandlerArticleCount(@Param("uuid") String uuid);

    List<Article> getMyHandlerArticle(@Param("uuid") String uuid,@Param("start") int start,@Param("limit") int limit);

    void TeaExamineArticleTask(@Param("id") String id,@Param("status") String status,@Param("articlehandler") String articlehandler);

    void teaSubmitArticle(@Param("creater") String creater, @Param("articlename")String articlename,
                          @Param("articleauth")String articleauth, @Param("articlevalue")String articlevalue,
                          @Param("articlecreatetime")String articlecreatetime, @Param("articleid")String articleid,
                          @Param("artrecordid")String artrecordid, @Param("message")String message);



}