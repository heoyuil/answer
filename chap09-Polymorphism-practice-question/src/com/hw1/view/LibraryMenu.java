package com.hw1.view;

import java.util.Scanner;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

public class LibraryMenu {
	private LibraryManager Im = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("회원 이름 : ");
		String name = sc.nextLine(); 
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		Im.insertMember(new Member(name,age,gender));
		
		lable:
		while(true) {
			System.out.println("====메뉴====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("숫자를 선택하세요 : ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1: Im.myInfo(); break;
			case 2: selectAll(); break;
			case 3:searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("프로그램을 종료합니다");break lable;
			default: System.out.println("숫자를 잘못입력했습니다");break;
			}
		}
	}
	
	public void selectAll() {
		Book[] blist = Im.selectAll();
			for(int i = 0; i < blist.length;i++) {
				System.out.println(i+"번"+blist[i]);
			}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList=Im.searchBook(keyword);
		
		for(Book b : searchList) {
			System.out.println(b);
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int  result= Im.rentBook(index);
		System.out.println(result==0?"성공적으로 대여되었습니다":(result==1?"나이 제한으로 대여불가능합니다":
			"성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요"));
	}

	
}
