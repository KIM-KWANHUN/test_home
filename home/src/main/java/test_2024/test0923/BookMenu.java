package test_2024.test0923;

import java.util.Scanner;

public class BookMenu {

//    private int bNo; // 도서번호
//    private int category; // 장르 분류 번호
//    private String title; // 도서 제목
//    private String author; // 도서 저자

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public void mainMenu() {
        while (true) {
            System.out.println("============하이미디어 도서관===============");
            System.out.println("1. 책 추가 ");
            System.out.println("2. 책 삭제");
            System.out.println("3. 책 검색");
            System.out.println("4. 책 전체검색");
            System.out.println("5. 프로그램 종료");
            System.out.println("=========================================");
            System.out.print("메뉴를 선택해주세요 : ");
            int num1 = sc.nextInt();
            sc.nextLine();

            switch (num1) {
                case 1 :
                    bm.addBook(inputBook());
                    break;
                case 2 :
                    bm.deleteBook(intputBookNo());
                    break;
                case 3 :
                    bm.searchBook(inputBookTitle());
                    break;
                case 4 :
                    bm.displayAll();
                    break;
                case 5 :
                    System.out.println("프로그램을 종료하겠습니다.");
                    return;
                default :
                    System.out.println("번호를 잘못 입력 하셨습니다.");
                    break;
            }
        }

    }

    public BookDTO inputBook() { // 책 추가프로그램

        System.out.print("책의 카테고리 : 1. 인문, 2. 자연과학, 3. 의료, 4.기타 : " );
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("책의 제목은 : ");
        String title = sc.nextLine();
        System.out.print("책의 저자는 : ");
        String author = sc.nextLine();

        return new BookDTO(category, title, author);
    }

    public int intputBookNo() { // 책 삭제 프로그램

        System.out.println("삭제할 도서번호는? : ");
        int bookNo = sc.nextInt();

        return bookNo;
    }

    public String inputBookTitle() { // 책 제목검색 프로그램

        System.out.print("책의 제목을 검색해주세요 : ");
        String title = sc.nextLine();

        return title;
    }

}