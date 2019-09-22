package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getNotice();

    List<Notice> getMyNotice(String stuid);

    List<Notice> getAdminNotice();

    void addNotice(String uuid,String noticename,String noticeauth,String noticevalue);

    int getNoticeCount();

    List<Notice> getNoticeByPage(int start,int limit);

    void delNoticeById(String id );

    int searchNoticeCount(String author);

    List<Notice> searchNotice(String author,int start,int limit);

    List<Notice> getNoticeByName(String noticename);


}
