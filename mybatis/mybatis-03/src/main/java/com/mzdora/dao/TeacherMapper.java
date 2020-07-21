package com.mzdora.dao;

import com.mzdora.pojo.teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    List<teacher> getTeachers();
}
