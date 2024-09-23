package test_2024.test0923;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    //    private int bNo; // 도서번호
    //    private int category; // 장르 분류 번호
    //    private String title; // 도서 제목
    //    private String author; // 도서 저자

    Scanner sc = new Scanner(System.in);
    List<BookDTO> booklist = new ArrayList<>();

    public BookManager() {} // 기본 생성자

    public void addBook(BookDTO bookDTO) {
        booklist.add(bookDTO);
        System.out.println(bookDTO);
    }

    public void deleteBook(int key) {
        booklist.remove(key);
        System.out.println(key + "번째 책을 삭제했습니다.");
    }

    public void searchBook(String title) {
        for(BookDTO a : booklist) {
            if (title.equals(a.getTitle())) {
                System.out.println("조회한 책의 제목은? : " + title);
            } else {
                System.out.println("조회된 도서가 목록에 없습니다");
            }
        }
    }

    public void displayAll() {
        if(booklist.size() == 0) {
            System.out.println("조회 결과가 없습니다.");
        }else {
            for(int i = 0; i < booklist.size(); i++) {
                System.out.println(booklist.get(i));

            }
        }

    }

}
