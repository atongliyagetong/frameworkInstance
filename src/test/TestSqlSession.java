import com.isoftstone.mybatis.entity.Glf;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByCode;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByXml;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSqlSession {

    @Test
    public void testSqlSessionFactoryByXml() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        List<Glf> glfList = sqlSession.selectList("com.iss.ole.jk.in.ba.queryGlf");
        for (Glf glf : glfList) {
            System.out.println(glf);
        }
    }

    @Test
    public void testSqlSessionFactoryByCode() {
        SqlSession sqlSession = SqlSessionFactoryByCode.createSqlSession();
        List<Glf> glfList = sqlSession.selectList("com.iss.ole.jk.in.ba.queryGlf");
        for (Glf glf : glfList) {
            System.out.println(glf);
        }
    }
}
