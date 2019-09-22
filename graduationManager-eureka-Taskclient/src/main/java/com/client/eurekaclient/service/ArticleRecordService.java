package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.ArticleRecord;

import java.util.List;

public interface ArticleRecordService {
    int getArticleRecordCount(String id);

    List<ArticleRecord> getArticleRecord(String id, int start, int limit );
}
