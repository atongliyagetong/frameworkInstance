package com.isoftstone.mybatis.dao.impl;

import com.isoftstone.mybatis.dao.GlfDao;
import com.isoftstone.mybatis.entity.Glf;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class GlfDaoImpl implements GlfDao {
    private SqlSessionFactory sqlSessionFactory;

    public GlfDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public List<Glf> queryGlf(Glf ck_glf) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectList("queryGlf");
        return null;
    }
}
