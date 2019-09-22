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

    void addArticle(@Param("articleid")String articleid,@Param("articlename")String articlename,@Param("articlevalue")String articlevalue,
                    @Param("articleauth")String articleauth,@Param("articlecreatetime")String articlecreatetime,@Param("uuid")String uuid);
}