package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.Report;
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

public interface ReportService {
    void submitReport(String reportid,String reprecordid,
                      String repname,String repvalue,
                      String repauth,String repcreatetime,
                      String articleid,String creater,String reportaddr);

    int getMyReportCount(String id);

    List<Report> getMyReport(String id, int start, int limit);

    List<Report> getReportByChoose(String stuid);

    void TeaExamineReportTask(String recordid,String id,String currmessage,String dealperson,
                              String dealtime, String dealmethod,String creatername);

    List<Report> getReportByRepId(String repid);

    void editReport(String reportid,String repvalue,String repcreatetime,String repauth,String creater,String reportaddr);

    int getReportFileCount();

    List<Report> getReportFile(int start, int limit);
}
