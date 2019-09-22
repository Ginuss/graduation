package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.ArticleMapper;
import com.client.eurekaclient.mapper.ArticleRecordMapper;
import com.client.eurekaclient.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TaskServiceImpl
 * @Author gaoyang
 * @Date 2019/4/517:24
 * @Version 1.0
 **/
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleRecordMapper articleRecordMapper;
    @Override
    public void createStuArticle(String creater, String articlename,
                                 String articleauth, String articlevalue,
                                 String articlecreatetime, String articleid,
                                 String artrecordid, String message,String dealmethod) {
        articleMapper.createStuArticle(creater,articlename,
                articleauth,articlevalue,
                articlecreatetime,articleid,
                artrecordid,message);
        articleRecordMapper.createRecord(artrecordid,articleid,message,articlecreatetime,creater,dealmethod);
    }

    @Override
    public void TeaExamineArticleTask(String id, String currmessage,
                                      String dealtime, String dealperson,
                                      String dealmethod, String recordid, String creatername) {
        if(dealmethod.equals("通过")){
            String status = "1";
            String articlehandler = "管理员";
            articleMapper.TeaExamineArticleTask(id,status,articlehandler);
        }else {
            String status = "0";
            String articlehandler = creatername;
            articleMapper.TeaExamineArticleTask(id,status,articlehandler);
        }
        articleRecordMapper.addRecord(recordid,id,currmessage,dealtime,dealperson,dealmethod);
    }

    @Override
    public void adminExamineArticleTask(String id, String currmessage,
                                        String dealtime, String dealperson,
                                        String dealmethod, String recordid, String creatername) {
        if(dealmethod.equals("通过")){
            String status = "2";
            String articlehandler = "";
            articleMapper.TeaExamineArticleTask(id,status,articlehandler);
        }else {
            String status = "0";
            String articlehandler = "";
            articleMapper.TeaExamineArticleTask(id,status,articlehandler);
        }
        articleRecordMapper.addRecord(recordid,id,currmessage,dealtime,dealperson,dealmethod);
    }

    @Override
    public void teaSubmitArticle(String creater, String articlename,
                                 String articleauth, String articlevalue,
                                 String articlecreatetime, String articleid,
                                 String artrecordid, String message, String dealmethod) {
        articleMapper.teaSubmitArticle(creater,articlename,
                articleauth,articlevalue,
                articlecreatetime,articleid,
                artrecordid,message);
        articleRecordMapper.createRecord(artrecordid,articleid,message,articlecreatetime,creater,dealmethod);
    }
}
