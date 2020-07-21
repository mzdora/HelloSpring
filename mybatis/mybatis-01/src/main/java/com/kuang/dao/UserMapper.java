package com.kuang.dao;

import com.kuang.pojo.user;

import java.util.List;

public interface UserMapper  {
    public List<user> getUserList();
    public user getUserById(int id);
    public int changeUserById(user user);
    public int removeUserById(int id);
    public int addUser(user user);
}
