package com.ohgiraffers.section02.view;

import com.ohgiraffers.section02.dto.MenuDTO;

import java.util.List;

public class PrintResult {

    public void printMenuList(List<MenuDTO> menuList) {
        System.out.println("요청하신 전체 메뉴 조회 결과 입니다.");

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        System.out.println("===========================================");
    }
}
