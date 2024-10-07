package com.ohgiraffers.section02.controller;

import com.ohgiraffers.section02.dto.MenuDTO;
import com.ohgiraffers.section02.service.MenuService;
import com.ohgiraffers.section02.view.PrintResult;

import java.util.List;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.printResult = new PrintResult();
        this.menuService = new MenuService();
    }

    public void selectAllMenu() {

    List<MenuDTO> menuList = MenuService.selectAllMenu();

    if(menuList != null) {
        printResult.printMenuList(menuList);
    }else {
        System.out.println("조회결과가 없습니다.");
    }

    }
}
