package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.Article;

import java.util.List;

public interface ArticleService {
    int getMyArticleCount(String uuid);

    List<Article> getMyArticle(String uuid,int start,int limit);

    int getMyHandlerArticleCount(String uuid);

    List<Article> getMyHandlerArticle(String uuid,int start,int limit);

}
