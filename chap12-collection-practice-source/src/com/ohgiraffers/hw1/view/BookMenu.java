package com.ohgiraffers.hw1.view;

import java.util.List;
import java.util.Scanner;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm;									// 초기화 해주자
	
	public BookMenu() {
		bm = new BookManager();									
	}
	
	public void mainMenu() {
		while(true) {
		System.out.println("***도서 관리 프로그램***");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서정보 정렬 후 출력");
		System.out.println("3. 도서 삭제");
		System.out.println("4. 도서 검색출력");
		System.out.println("5. 전체 출력");
		System.out.println("6. 끝내기");
		System.out.print("메뉴 번호 선택 : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		switch(n) {
			case 1 : bm.addBook(inputBook());break;
			case 2 : bm.printBookList(selectSortedBook());break;
			case 3 : bm.deleteBook(inputBookNo()); break;
			case 4 : bm.searchBook(inputBookTitle()); break;
			case 5 : bm.displayAll(); break;
			case 6 : System.out.println("프로그램을 종료합니다");return;
			default : System.out.println("번호를 잘못입력했습니다");
		 	}
		}
	}
	
	public BookDTO inputBook() {
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();					//제목
		System.out.print("도서 장르 : ");
		int category = sc.nextInt();					//장르
		sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();					//저자
		return new BookDTO(category, title, author);
	}
	
	public int inputBookNo() {
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		return bNo;
	}
	
	public String inputBookTitle() {
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();	
		return title;
	}
	
	public List<BookDTO> selectSortedBook(){
		System.out.println("도서 정렬 방식을 선택하세요");
		System.out.println("1. 도서번호(ISBN)으로 오름차순 정렬");
		System.out.println("2. 도서번호(ISBN)으로 내림차순 정렬");
		System.out.println("3. 책 제목으로 오름차순 정렬");
		System.out.println("4. 책 제목으로 내림차순 정렬");
		System.out.print("번호 : ");
		int type = sc.nextInt();
		return bm.sortedBookList(type);
		
	}
	
	
	
}