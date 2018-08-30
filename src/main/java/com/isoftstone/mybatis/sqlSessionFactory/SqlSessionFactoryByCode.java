package com.isoftstone.mybatis.sqlSessionFactory;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import javax.sql.DataSource;
import java.sql.SQLException;

public class SqlSessionFactoryByCode {

    private static SqlSession sqlSession;
    public static SqlSession createSqlSession() {
        try {
            DataSource dataSource = new PooledDataSource();
            ((PooledDataSource) dataSource).setDriver("oracle.jdbc.driver.OracleDriver");
            ((PooledDataSource) dataSource).setUrl("jdbc:oracle:thin:@10.5.43.39:1521:orcl");
            ((PooledDataSource) dataSource).setDriver("pts_t");
            ((PooledDataSource) dataSource).setDriver("pts");
            TransactionFactory transactionFactory = new JdbcTransactionFactory();
            Environment environment = new Environment("development", transactionFactory, dataSource);
            Configuration configuration = new Configuration(environment);
            configuration.addMappers("com.isoftstone.mybatis.mapper");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
            sqlSession = sqlSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

}
