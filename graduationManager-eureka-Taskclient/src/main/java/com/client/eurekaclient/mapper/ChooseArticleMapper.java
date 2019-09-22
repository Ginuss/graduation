package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.ChooseArticle;
import com.client.eurekaclient.pojo.ChooseArticleExample;

import java.util.List;

public interface ChooseArticleMapper {
    int insert(ChooseArticle record);

    int insertSelective(ChooseArticle record);

    List<ChooseArticle> selectByExample(ChooseArticleExample example);
}
