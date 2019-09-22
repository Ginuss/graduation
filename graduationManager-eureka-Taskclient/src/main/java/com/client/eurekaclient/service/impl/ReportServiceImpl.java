package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.RepRecordMapper;
import com.client.eurekaclient.mapper.ReportMapper;
import com.client.eurekaclient.pojo.Report;
import com.client.eurekaclient.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName ReportServiceImpl
 * @Author gaoyang
 * @Date 2019/4/1015:21
 * @Version 1.0
 **/
@Service
public class ReportServiceImpl implements ReportService {
    private final ReportMapper reportMapper;
    @Autowired
    private RepRecordMapper repRecordMapper;

    @Autowired
    public ReportServiceImpl(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    @Override
    public void submitReport(String reportid,String reprecordid,
                             String repname, String repvalue,
                             String repauth, String repcreatetime,
                             String articleid, String creater, String reportaddr) {
        reportMapper.insertReport(reportid,reprecordid,repname,repvalue,repauth,repcreatetime,articleid,creater,reportaddr);

        String currMessage = "发起申请";
        String dealMethod = "发起申请";
        repRecordMapper.createReportRecord(reprecordid,reportid,currMessage,creater,repcreatetime,dealMethod);
    }

    @Override
    public int getMyReportCount(String id) {
        return reportMapper.getMyReportCount(id);
    }

    @Override
    public List<Report> getMyReport(String id, int start, int limit) {
        List<Report> list = reportMapper.getMyReport(id,start,limit);
        return list;
    }

    @Override
    public List<Report> getReportByChoose(String stuid) {
        return reportMapper.getReportByChoose(stuid);
    }

    @Override
    public void TeaExamineReportTask(String recordid,String id,String currmessage,String dealperson,
                                     String dealtime, String dealmethod,String creatername) {
        String status;
        String rephandler;
        if(dealmethod.equals("通过")){
            status = "2";
            rephandler = "";
            reportMapper.updateReport(status,rephandler,creatername);
        }else{
            status = "0";
            rephandler = creatername;
            reportMapper.updateReport(status,rephandler,creatername);
        }
        repRecordMapper.addRecord(recordid,id,currmessage,dealperson,dealtime,dealmethod);


    }

    @Override
    public List<Report> getReportByRepId(String repid) {
        return reportMapper.getReportByRepId(repid);
    }

    @Override
    public void editReport(String reportid, String repvalue, String repcreatetime, String repauth, String creater, String reportaddr) {
        reportMapper.editReport(reportid,repvalue,repcreatetime,repauth,creater,reportaddr);
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String currmessage = "重新发起申请";
        String dealmethod = "重新发起申请";
        repRecordMapper.editReportRecord(uuid,reportid,currmessage,creater,repcreatetime,dealmethod);
    }

    @Override
    public int getReportFileCount() {
        return reportMapper.getReportFileCount();
    }

    @Override
    public List<Report> getReportFile(int start, int limit) {
        return reportMapper.getReportFile(start,limit);
    }
}
