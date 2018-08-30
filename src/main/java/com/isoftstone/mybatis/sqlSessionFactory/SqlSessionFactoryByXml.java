package com.isoftstone.mybatis.sqlSessionFactory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryByXml {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    public static SqlSession getSeqSession(){
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = sqlSessionFactory.openSession();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
