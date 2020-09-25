package com.cuizx.test;

import com.cuizx.io.Resources;
import com.cuizx.pojo.User;
import com.cuizx.sqlsession.SqlSession;
import com.cuizx.sqlsession.SqlSessionFactory;
import com.cuizx.sqlsession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

public class IPersistenceTest {
    public void test() throws PropertyVetoException, DocumentException {
        InputStream inputStream=Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        //调用
        User user2= sqlSession.selectOne("user.selectone", user);

    }
}
