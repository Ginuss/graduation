package com.client.eurekaclient.service.impl;

import com.client.eurekaclient.mapper.SubRecordMapper;
import com.client.eurekaclient.mapper.SubjectMapper;
import com.client.eurekaclient.pojo.SubRecord;
import com.client.eurekaclient.pojo.Subject;
import com.client.eurekaclient.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName SubjectServiceImpl
 * @Author gaoyang
 * @Date 2019/4/1614:15
 * @Version 1.0
 **/
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectMapper subjectMapper;
    @Autowired
    private SubRecordMapper subRecordMapper;
    @Override
    public void submitSubject(String subjectid, String subname,
                              String subauth, String subrecordid,
                              String subcreatetime, String addr,
                              String articleid, String createrid) {
        subjectMapper.submitSubject(subjectid,subname,subauth,subrecordid,subcreatetime,addr,articleid,createrid);
        String currmessage = "发起申请";
        String dealmethod = "发起申请";
        subRecordMapper.createRecord(subrecordid,subjectid,currmessage,createrid,subcreatetime,dealmethod);
    }

    @Override
    public int getMySubjectCount(String uuid) {
        return subjectMapper.getMySubjectCount(uuid);
    }

    @Override
    public List<Subject> getMySubject(String uuid, int start, int limit) {
        return subjectMapper.getMySubject(uuid,start,limit);
    }

    @Override
    public List<SubRecord> getSubjectRecord(String id) {
        return subRecordMapper.getSubjectRecord(id);
    }

    @Override
    public List<Subject> getSubjectByChoose(String stuid) {
        return subjectMapper.getSubjectByChoose(stuid);
    }

    @Override
    public void TeaExamineSubjectTask(String recordid, String id,
                                      String currmessage, String dealperson,
                                      String dealtime, String dealmethod, String creatername) {
        String status;
        String subhandler;
        if(dealmethod.equals("通过")){
            status = "2";
            subhandler = "";
            subjectMapper.updateReport(status,subhandler,creatername);
        }else{
            status = "0";
            subhandler = creatername;
            subjectMapper.updateReport(status,subhandler,creatername);
        }
        subRecordMapper.addRecord(recordid,id,currmessage,dealperson,dealtime,dealmethod);
    }

    @Override
    public void editReport(String subid, String subcreatetime,
                           String subauth, String creater, String subjectadd) {
        subjectMapper.editReport(subid,subauth,subcreatetime,subjectadd);
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String currmessage = "重新发起申请";
        String dealmethod = "重新发起申请";
        subRecordMapper.editSubjectRecord(uuid,subid,currmessage,creater,subcreatetime,dealmethod);
    }

    @Override
    public int getSubjectFileCount() {
        return subjectMapper.getSubjectFileCount();
    }

    @Override
    public List<Subject> getSubjectFile(int start, int limit) {
        return subjectMapper.getSubjectFile(start,limit);
    }
}
