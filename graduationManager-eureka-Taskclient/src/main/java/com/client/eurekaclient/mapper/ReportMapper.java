package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.Report;
import com.client.eurekaclient.pojo.ReportExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ReportMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);

    void insertReport(@Param("reportid") String reportid,@Param("reprecordid") String reprecordid,
                      @Param("repname") String repname,@Param("repvalue")String repvalue,
                      @Param("repauth")String repauth, @Param("repcreatetime")String repcreatetime,
                      @Param("articleid")String articleid, @Param("creater")String creater,@Param("reportaddr")String reportaddr);

    int getMyReportCount(@Param("id")String id);

    List<Report> getMyReport(@Param("id")String id ,@Param("start")int start,@Param("limit")int limit);

    List<Report> getReportByChoose(@Param("stuid")String stuid);

    void updateReport(@Param("status") String status,@Param("rephandler") String rephandler,@Param("creatername")String creatername);

    List<Report> getReportByRepId(@Param("repid")String repid);

    void editReport(@Param("reportid")String rportid,@Param("repvalue")String repvalue,
                    @Param("repcreatetime")String repcreatetime,@Param("repauth")String repauth,
                    @Param("creater")String creater,@Param("reportaddr")String reportaddr);

    int getReportFileCount();

    List<Report> getReportFile(@Param("start")int start,@Param("limit")int limit);
}