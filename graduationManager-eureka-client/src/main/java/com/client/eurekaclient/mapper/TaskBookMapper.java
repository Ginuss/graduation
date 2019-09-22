package com.client.eurekaclient.mapper;

import com.client.eurekaclient.pojo.TaskBook;
import com.client.eurekaclient.pojo.TaskBookExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TaskBookMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(TaskBook record);

    int insertSelective(TaskBook record);

    List<TaskBook> selectByExample(TaskBookExample example);

    TaskBook selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(TaskBook record);

    int updateByPrimaryKey(TaskBook record);

    String getTaskBook(String stuid);

    void submitTaskBook(@Param("taskid") String taskid,@Param("taskname") String taskname, @Param("taskvalue")String taskvalue,@Param("taskauth") String taskauth,@Param("tasktime") String tasktime,@Param("articlename") String articlename);

    String queryTaskBook(@Param("artname") String artname);
}