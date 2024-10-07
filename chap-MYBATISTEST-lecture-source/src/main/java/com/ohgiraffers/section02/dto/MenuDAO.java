package com.ohgiraffers.section02.dto;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {

    public static List<MenuDTO> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("MenuMapper.selectAllMenu");


    }
}
