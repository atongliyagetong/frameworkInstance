import com.isoftstone.mybatis.dao.GlfDao;
import com.isoftstone.mybatis.dao.impl.GlfDaoImpl;
import com.isoftstone.mybatis.entity.Glf;
import com.isoftstone.mybatis.mapper.GlfResultMap;
import com.isoftstone.mybatis.entity.Mybatis;
import com.isoftstone.mybatis.entity.XmJhgl;
import com.isoftstone.mybatis.mapper.GlfMapper;
import com.isoftstone.mybatis.mapper.GlfMapperAnnotation;
import com.isoftstone.mybatis.mapper.XmJhglMapper;
import com.isoftstone.mybatis.objectFactory.GlfFactory;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryAnnotationMapper;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByCode;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByXml;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
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
        sqlSession.close();
    }

    @Test
    public void testSqlSessionFactoryByCode() {
        SqlSession sqlSession = SqlSessionFactoryByCode.createSqlSession();
        GlfMapper glfMapper = sqlSession.getMapper(GlfMapper.class);//使用mapper更简单更安全，没那么容易发生字符和文字转换的错误
        List<Glf> glfList = glfMapper.queryGlf(null);
//        List<Glf> glfList = sqlSession.selectList("com.isoftstone.mybatis.mapper.GlfMapper.queryGlf");
        for (Glf glf : glfList) {
            System.out.println(glf);
        }
        sqlSession.close();
    }

    /**
     * 测试注解的mapper
     */
    @Test
    public void testAnnotationMapper() {
        SqlSession sqlSession = SqlSessionFactoryAnnotationMapper.createSqlSessionWithAnnotationMapper();
        GlfMapperAnnotation glfMapper = sqlSession.getMapper(GlfMapperAnnotation.class);//使用mapper更简单更安全，没那么容易发生字符和文字转换的错误
        Glf bean = new Glf();
        bean.setBfh("G188060325");
        List<Glf> glfList = glfMapper.queryGlf(bean);
        for (Glf glf : glfList) {
            System.out.println(glf);
        }
        sqlSession.close();
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

    /**
     * 测试ObjectFactory
     */
    @Test
    public void testDefaultObjectFactory() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        DefaultObjectFactory defaultObjectFactory = new GlfFactory();
        Glf glf = defaultObjectFactory.create(Glf.class);
        System.out.println(glf);
    }

    /**
     * 测试插入
     */
    @Test
    public void testMapperInsert() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        GlfMapper glfMapper = sqlSession.getMapper(GlfMapper.class);
        Mybatis mybatis = new Mybatis();
        mybatis.setBfh("34125432");
//        mybatis.setBfhh("00010");
        Integer affectRowCount = glfMapper.insertMybatis(mybatis);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(affectRowCount);
    }

    @Test
    public void testResultMap() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        GlfMapper glfMapper = sqlSession.getMapper(GlfMapper.class);
        List<GlfResultMap> glfList =  glfMapper.findGlf(null);
        for (GlfResultMap glf : glfList) {
            System.out.println(glf);
        }
        sqlSession.close();
    }

    @Test
    public void testResultMapConstructor() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        GlfMapper glfMapper = sqlSession.getMapper(GlfMapper.class);
        List<GlfResultMap> glfList =  glfMapper.findGlfByConstructResultMap(null);
        for (GlfResultMap glf : glfList) {
            System.out.println(glf);
        }
        sqlSession.close();
    }

    /**
     * 嵌套查询
     */
    @Test
    public void testResultMapAssocationNestedQuery() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        XmJhglMapper xmJhglMapper = sqlSession.getMapper(XmJhglMapper.class);
        XmJhgl xmJhgl = new XmJhgl();
        xmJhgl.setJhh("PT170310A1");
        XmJhgl xmjhgl = xmJhglMapper.queryXmjhglNestedSelect(xmJhgl);
        System.out.println(xmjhgl);
        sqlSession.close();
    }

    /**
     * 嵌套结果
     */
    @Test
    public void testResultMapAssocationNestedResult() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        XmJhglMapper xmJhglMapper = sqlSession.getMapper(XmJhglMapper.class);
        XmJhgl xmJhgl = new XmJhgl();
        xmJhgl.setJhh("PT170310A1");
        XmJhgl xmjhgl = xmJhglMapper.queryXmjhglNestedResult(xmJhgl);
        System.out.println(xmjhgl);
        sqlSession.close();
    }
}
