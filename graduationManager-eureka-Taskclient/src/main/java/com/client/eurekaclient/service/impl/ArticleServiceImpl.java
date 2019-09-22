package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.ArticleMapper;
import com.client.eurekaclient.pojo.Article;
import com.client.eurekaclient.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ArticleServiceImpl
 * @Author gaoyang
 * @Date 2019/4/521:59
 * @Version 1.0
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public int getMyArticleCount(String uuid) {
        return articleMapper.getMyArticleCount(uuid);
    }

    @Override
    public List<Article> getMyArticle(String uuid, int start, int limit) {
        return articleMapper.getMyArticle(uuid,start,limit);
    }

    @Override
    public int getMyHandlerArticleCount(String uuid) {
        return articleMapper.getMyHandlerArticleCount(uuid);
    }

    @Override
    public List<Article> getMyHandlerArticle(String uuid, int start, int limit) {
        return articleMapper.getMyHandlerArticle(uuid,start,limit);
    }
}
