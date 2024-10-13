package com.ohgiraffers.section01.mybatis.DAO;

import org.apache.ibatis.session.SqlSession;

import static com.ohgiraffers.section01.mybatis.Template.MenuTemplate.getSqlSession;

public class MenuService {

    private static Menumapper menumapper;

    public MenuDTO selectMenuByCode(int code) {

        SqlSession sqlSession = getSqlSession();

        menumapper = sqlSession.getMapper(Menumapper.class);

        MenuDTO menuDTO = menumapper.selectMenuByCode(code);

        return menuDTO;
    }
}
