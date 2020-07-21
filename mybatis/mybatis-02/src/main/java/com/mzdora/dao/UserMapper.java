package com.mzdora.dao;

import com.mzdora.pojo.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<user> getUserList();
    public user getUserById(int id);
    public int changeUserById(user user);
    public int removeUserById(int id);
    public int addUser(user user);
    public List<user> getUserByLimit(Map<String,Integer> map);
    @Select("select * from user where id = #{id}")
    user getUserByIdTwo(@Param("id")int id);
}
