package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAll(int start,int limit);

    List<Article> getArticleByChoose(String uuid);

    List<Article> searchArticle(String status, String articleauth, int start, int limit);

    void delArticleByChoose(String stuid,String artid);

    void chooseArticle(String stuid,String artid);

    int getArticleCount();

    int getArticleCount2(String status, String articleauth );

    void updateArticle(String id, String articlename, String articlevlaue, String edittime);

    void delArticle(String id);

    void addArticle(String articleid,String articlename,String articlevalue,String articleauth,String articlecreatetime,String uuid);
}
