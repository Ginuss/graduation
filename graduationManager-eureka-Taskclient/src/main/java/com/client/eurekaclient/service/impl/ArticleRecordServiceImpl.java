package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.ArticleRecordMapper;
import com.client.eurekaclient.pojo.ArticleRecord;
import com.client.eurekaclient.service.ArticleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ArticleRecordServiceImpl
 * @Author gaoyang
 * @Date 2019/4/813:18
 * @Version 1.0
 **/
@Service
public class ArticleRecordServiceImpl implements ArticleRecordService {
    @Autowired
    private ArticleRecordMapper articleRecordMapper;
    @Override
    public int getArticleRecordCount(String id) {
        return articleRecordMapper.getArticleRecordCount(id);
    }

    @Override
    public List<ArticleRecord> getArticleRecord(String id, int start, int limit) {
        return articleRecordMapper.getArticleRecord(id,start,limit);
    }
}
