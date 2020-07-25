package com.mzdora.dao;

import com.mzdora.pojo.user;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class userMapperImpl implements userMapper{
    private SqlSessionTemplate SqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        SqlSession = sqlSession;
    }

    public List<user> getUsers() {
        return SqlSession.getMapper(userMapper.class).getUsers();
    }
}
