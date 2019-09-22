package com.client.eurekaclient.service;

import com.client.eurekaclient.pojo.SubRecord;
import com.client.eurekaclient.pojo.Subject;

import java.util.List;

public interface SubjectService {
    void submitSubject(String subjectid,String subname,
                       String subauth,String subrecordid,
                       String subcreatetime,String addr,String articleid,
                       String createrid);

    int getMySubjectCount(String uuid);

    List<Subject> getMySubject(String uuid, int start, int limit);

    List<SubRecord> getSubjectRecord(String id);

    List<Subject> getSubjectByChoose(String stuid);

    void TeaExamineSubjectTask(String recordid,String id,String currmessage,String dealperson,
                               String dealtime, String dealmethod,String creatername);

    void editReport(String subid,String subcreatetime,String subauth,String creater,String subjectadd);

    int getSubjectFileCount();

    List<Subject> getSubjectFile(int start,int limit);
}
