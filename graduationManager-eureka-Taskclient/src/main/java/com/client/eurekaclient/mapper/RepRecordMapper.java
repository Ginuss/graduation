package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.RepRecord;
import com.client.eurekaclient.pojo.RepRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RepRecordMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(RepRecord record);

    int insertSelective(RepRecord record);

    List<RepRecord> selectByExample(RepRecordExample example);

    RepRecord selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(RepRecord record);

    int updateByPrimaryKey(RepRecord record);

    void createReportRecord(@Param("reprecordid") String reprecordid,@Param("reportid")  String reportid,
                            @Param("currMessage") String currMessage, @Param("creater") String creater,
                            @Param("repcreatetime") String repcreatetime, @Param("dealMethod") String dealMethod);

    List<RepRecord> getReportRecord(@Param("id")String id );

    void addRecord(@Param("recordid") String recordid,@Param("id") String id,
                   @Param("currmessage") String currmessage,@Param("dealperson") String dealperson,
                   @Param("dealtime") String dealtime,@Param("dealmethod") String dealmethod);

    void editReportRecord(@Param("uuid")String uuid,@Param("reportid")String reportid,
                          @Param("currmessage")String currmessage,@Param("creater")String creater,
                          @Param("repcreatetime")String repcreatetime,@Param("dealmethod")String dealmethod);
}