package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.Report;
import com.client.eurekaclient.pojo.ReportExample;
import java.util.List;

public interface ReportMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}