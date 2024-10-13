package com.ohgiraffers.section01.mybatis.Controller;

import com.ohgiraffers.section01.mybatis.DAO.MenuDTO;
import com.ohgiraffers.section01.mybatis.DAO.MenuService;
import com.ohgiraffers.section01.mybatis.MenuView.PrintResult;

import java.util.Map;

public class MenuController {
    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }


    public void selectMenuByCode(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("menuCode"));

        MenuDTO menuDTO = menuService.selectMenuByCode(code);

        if(menuDTO != null) {
            printResult.successPrintResult(menuDTO);
        } else {
            printResult.outPrintResult("menuError");
        }


    }
}
