package com.ohgiraffers.section02.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Templeate {
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession sqlSession(){
        if(sqlSessionFactory == null) {
            String resources = "com/ohgiraffers/section/xmlconfig/config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resources);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession;
    }
}
