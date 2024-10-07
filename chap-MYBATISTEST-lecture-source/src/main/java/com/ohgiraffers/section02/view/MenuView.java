package com.ohgiraffers.section02.view;

import com.ohgiraffers.section02.controller.MenuController;

import java.util.Scanner;

public class MenuView {

    public void display() {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("===================================");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴조회");
            System.out.println("3. 신규 메뉴 등록");
            System.out.println("4. 메뉴 수정 하기");
            System.out.println("5. 메뉴 삭제 하기");
            System.out.println("===================================");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    menuController.selectAllMenu();
                    break;
            }
        }while (true);
    }
}
