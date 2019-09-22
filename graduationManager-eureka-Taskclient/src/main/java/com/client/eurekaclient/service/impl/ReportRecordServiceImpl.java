package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.RepRecordMapper;
import com.client.eurekaclient.pojo.RepRecord;
import com.client.eurekaclient.service.ReportRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ReportRecordServiceImpl
 * @Author gaoyang
 * @Date 2019/4/1214:54
 * @Version 1.0
 **/
@Service
public class ReportRecordServiceImpl implements ReportRecordService {
    @Autowired
    private RepRecordMapper repRecordMapper;
    @Override
    public List<RepRecord> getReportRecord(String id) {
        return repRecordMapper.getReportRecord(id);
    }
}
