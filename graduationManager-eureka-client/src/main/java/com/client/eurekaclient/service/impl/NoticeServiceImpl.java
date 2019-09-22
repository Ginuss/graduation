package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.NoticeMapper;
import com.client.eurekaclient.pojo.Notice;
import com.client.eurekaclient.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName NoticeServiceImpl
 * @Author gaoyang
 * @Date 2019/3/2413:07
 * @Version 1.0
 **/
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public List<Notice> getNotice() {
        return noticeMapper.getAll();
    }

    @Override
    public List<Notice> getMyNotice(String stuid) {
        return  noticeMapper.getMyNotice(stuid);
    }

    @Override
    public List<Notice> getAdminNotice() {
        return noticeMapper.getAdminNotice();
    }

    @Override
    public void addNotice(String uuid,String noticename, String noticeauth, String noticevalue) {
        noticeMapper.addNotice(uuid,noticename,noticeauth,noticevalue);
    }

    @Override
    public int getNoticeCount() {
        return noticeMapper.getNoticeCount();
    }

    @Override
    public List<Notice> getNoticeByPage(int start, int limit) {
        return noticeMapper.getNoticeByPage(start,limit);
    }

    @Override
    public void delNoticeById(String id) {
        noticeMapper.delNoticeById(id);
    }

    @Override
    public int searchNoticeCount(String author) {
        return noticeMapper.searchNoticeCount(author);
    }

    @Override
    public List<Notice> searchNotice(String author, int start, int limit) {
        return noticeMapper.searchNotice(author,start,limit);
    }

    @Override
    public List<Notice> getNoticeByName(String noticename) {
        return noticeMapper.getNoticeByName(noticename);
    }
}
