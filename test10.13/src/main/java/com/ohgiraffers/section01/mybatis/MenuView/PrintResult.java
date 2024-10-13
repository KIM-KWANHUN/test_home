package com.ohgiraffers.section01.mybatis.MenuView;

import com.ohgiraffers.section01.mybatis.DAO.MenuDTO;

public class PrintResult
{
    public void successPrintResult(MenuDTO menuDTO) {
        System.out.println(menuDTO.getMenuCode() + "조회에 성공하셨습니다.");
        System.out.println(menuDTO);
    }

    public void outPrintResult(String error) {

        String errorMessage = "";

        switch (error) {
            case "menuError" :
                errorMessage = "메뉴코드 조회에 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);
    }
}
