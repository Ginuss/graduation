package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.SubRecord;
import com.client.eurekaclient.pojo.SubRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.javassist.bytecode.analysis.Subroutine;

import java.util.List;
@Mapper
public interface SubRecordMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(SubRecord record);

    int insertSelective(SubRecord record);

    List<SubRecord> selectByExample(SubRecordExample example);

    SubRecord selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(SubRecord record);

    int updateByPrimaryKey(SubRecord record);

    void createRecord(@Param("subrecordid")String subrecordid, @Param("subjectid")String subjectid,
                      @Param("currmessage")String currmessage, @Param("createrid")String createrid,
                      @Param("subcreatetime")String subcreatetime, @Param("dealmethod")String dealmethod);

    List<SubRecord> getSubjectRecord(@Param("id")String id);

    void addRecord(@Param("recordid") String recordid,@Param("id") String id,
                   @Param("currmessage") String currmessage,@Param("dealperson") String dealperson,
                   @Param("dealtime") String dealtime,@Param("dealmethod") String dealmethod);

    void editSubjectRecord(@Param("uuid")String uuid,@Param("subid")String subid,@Param("currmessage")String currmessage,
                           @Param("creater")String creater,@Param("subcreatetime")String subcreatetime,@Param("dealmethod")String dealmethod);
}