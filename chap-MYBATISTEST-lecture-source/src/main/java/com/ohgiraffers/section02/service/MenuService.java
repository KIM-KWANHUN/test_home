package com.ohgiraffers.section02.service;

import com.ohgiraffers.section02.dto.MenuDAO;
import com.ohgiraffers.section02.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.test.Session.getSqlSession;

public class MenuService {

    public static List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = MenuDAO.selectAllMenu(sqlSession);

        sqlSession.close();

        return menuList;
    }
}
