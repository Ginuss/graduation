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
 * @Date 2019/3/2610:49
 * @Version 1.0
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> getAll(int start,int limit) {
        return articleMapper.getAll(start,limit);
    }

    @Override
    public List<Article> getArticleByChoose(String uuid) {
        return articleMapper.getArticleByChoose(uuid);
    }

    @Override
    public List<Article> searchArticle(String status, String articleauth, int start, int limit) {
        return articleMapper.searchArticle(status,articleauth,start,limit);
    }

    @Override
    public void delArticleByChoose(String stuid,String artid) {
        articleMapper.delArticleByChoose(stuid,artid);
    }

    @Override
    public void chooseArticle(String stuid, String artid) {
        articleMapper.chooseArticle(stuid,artid);
    }

    @Override
    public int getArticleCount() {
        return articleMapper.getArticleCount();
    }

    @Override
    public int getArticleCount2(String status, String articleauth) {
        return articleMapper.getArticleCount2(status,articleauth);
    }

    @Override
    public void updateArticle(String id, String articlename, String articlevlaue, String edittime) {
        articleMapper.updateArticle(id,articlename,articlevlaue,edittime);
    }

    @Override
    public void delArticle(String id) {
        articleMapper.delArticle(id);
    }

    @Override
    public void addArticle(String articleid, String articlename, String articlevalue, String articleauth, String articlecreatetime, String uuid) {
        articleMapper.addArticle(articleid,articlename,articlevalue,articleauth,articlecreatetime,uuid);
    }
}
