package com.ohgiraffers.section01.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Session {

    private static SqlSessionFactory sessionFactory; // 싱글톤

    public static SqlSession getSqlSession() {
        if(sessionFactory==null) {
            String resources = "com/ohgiraffers/section/xmlconfig/config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resources);

                sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        SqlSession sqlSession = sessionFactory.openSession(false);
        return sqlSession;
    }

}
