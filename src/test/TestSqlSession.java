import com.isoftstone.mybatis.entity.Ck_GLF;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByCode;
import com.isoftstone.mybatis.sqlSessionFactory.SqlSessionFactoryByXml;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.Test;

import java.util.List;

public class TestSqlSession {

    @Test
    public void testSqlSessionFactoryByXml() {
        SqlSession sqlSession = SqlSessionFactoryByXml.getSeqSession();
        List<Ck_GLF> glfList = sqlSession.selectList("com.iss.ole.jk.in.ba.queryGlf");
        for (Ck_GLF glf : glfList) {
            System.out.println(glf);
        }
    }

    @Test
    public void testSqlSessionFactoryByCode() {
        SqlSession sqlSession = SqlSessionFactoryByCode.createSqlSession();
        List<Ck_GLF> glfList = sqlSession.selectList("com.iss.ole.jk.in.ba.queryGlf");
        for (Ck_GLF glf : glfList) {
            System.out.println(glf);
        }
    }
}
