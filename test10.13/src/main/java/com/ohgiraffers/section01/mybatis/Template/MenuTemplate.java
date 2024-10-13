package com.ohgiraffers.section01.mybatis.Template;

import com.mysql.cj.jdbc.Driver;
import com.ohgiraffers.section01.mybatis.DAO.Menumapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class MenuTemplate {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/menudb";
    private static String USERNAME = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    private static SqlSessionFactory sqlSessionFactory;


    public static SqlSession getSqlSession() {

        if(sqlSessionFactory == null) {

            Environment environment = new Environment("dev",
                    new JdbcTransactionFactory(),
                    new PooledDataSource(DRIVER, URL, USERNAME, PASSWORD));

            Configuration configuration = new Configuration(environment);

            configuration.addMapper(Menumapper.class);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);


        }
        return sqlSessionFactory.openSession(false);
    }
}
