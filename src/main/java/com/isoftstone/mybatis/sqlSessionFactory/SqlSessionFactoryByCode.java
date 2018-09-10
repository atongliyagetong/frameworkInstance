package com.isoftstone.mybatis.sqlSessionFactory;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;

public class SqlSessionFactoryByCode {

    private static SqlSession sqlSession;
    public static SqlSession createSqlSession() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@10.5.43.39:1521:orcl";
        String username = "pts_t";
        String password = "pts";
        try {
            DataSource dataSource = new PooledDataSource(driver,url,username,password);
            TransactionFactory transactionFactory = new JdbcTransactionFactory();
            Environment environment = new Environment("development", transactionFactory, dataSource);
            Configuration configuration = new Configuration(environment);
//            configuration.addMapper(GlfMapper.class);
//            configuration.addMappers("com.isoftstone.mybatis.mapper",GlfMapper.class);
            configuration.addMappers("com.isoftstone.mybatis.mapper");


            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
            sqlSession = sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

}
