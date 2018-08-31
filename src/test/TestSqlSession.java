import com.isoftstone.mybatis.dao.GlfDao;
import com.isoftstone.mybatis.dao.impl.GlfDaoImpl;
import com.isoftstone.mybatis.entity.Glf;
import com.isoftstone.mybatis.mapper.GlfMapper;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByCode;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByXml;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSqlSession {

    /**
     * 第一种和第二种属于·mapper代理方式
     */

    @Test
    public void testSqlSessionFactoryByXml() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        GlfMapper glfMapper = sqlSession.getMapper(GlfMapper.class);
        List<Glf> glfList =  glfMapper.queryGlf(null);
//        List<Glf> glfList = sqlSession.selectList("queryGlf");
        for (Glf glf : glfList) {
            System.out.println(glf);
        }
    }

    @Test
    public void testSqlSessionFactoryByCode() {
        SqlSession sqlSession = SqlSessionFactoryByCode.createSqlSession();
        GlfMapper glfMapper = sqlSession.getMapper(GlfMapper.class);
        List<Glf> glfList = glfMapper.queryGlf(null);
//        List<Glf> glfList = sqlSession.selectList("com.isoftstone.mybatis.mapper.GlfMapper.queryGlf");
        for (Glf glf : glfList) {
            System.out.println(glf);
        }
    }

    /**
     * 传统的Dao形式
     */
    @Test
    public void testSqlSessionFactoryByDao() {
        try {
            InputStream in = Resources.getResourceAsStream("configuration.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            GlfDao glfDao = new GlfDaoImpl(sqlSessionFactory);
            List<Glf> glfList =glfDao.queryGlf(null);
            for (Glf glf : glfList) {
                System.out.println(glf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
