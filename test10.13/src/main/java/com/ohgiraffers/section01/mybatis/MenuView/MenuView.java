package com.ohgiraffers.section01.mybatis.MenuView;

import com.ohgiraffers.section01.mybatis.Controller.MenuController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuView {


    public void display() {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();


        do{
            System.out.println("====== 코드로 정보 조회 ======");
            System.out.println("1. 코드로 정보 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("============================");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuController.selectMenuByCode(inputMenuCode());
                        break;
                case 9 :
                        return;
            }

        }while (true);
    }

    private static Map<String, String> inputMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("코드를 입력해주세요 : ");
        String menuCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode",menuCode);

        return parameter;
    }

}
