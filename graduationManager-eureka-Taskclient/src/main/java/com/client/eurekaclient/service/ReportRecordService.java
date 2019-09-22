package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.RepRecord;

import java.util.List;

public interface ReportRecordService {
    List<RepRecord> getReportRecord(String id);
}
