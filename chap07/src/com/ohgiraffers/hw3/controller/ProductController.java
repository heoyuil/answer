package com.ohgiraffers.hw3.controller;


import java.util.Scanner;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

public class ProductController {
	private ProductDTO[] pro;
	public static int count;
	{
		pro = new ProductDTO[10];
	}
	
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		lable:
		do {
			System.out.println("=====제품 관리 메뉴=====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("번호를 선택하세요 ");
			int n = sc.nextInt();
			
			switch(n) {
			case 1:System.out.println("제품 정보 추가");productInput();break;
			case 2:System.out.println("제품 전체 조회");productPrint();break;
			case 9:System.out.println("프로그램을 종료하겠습니다");break lable;
			default:System.out.println("번호를 잘못입력했습니다");continue;
			}
		}while(count<10);
	}
	
	public void productInput() {
		System.out.print("제품 번호 : ");
		int pld =sc.nextInt();
		sc.nextLine();
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		System.out.print("제품가격 : ");
		int price =sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax =sc.nextDouble();
		pro[count++] = new ProductDTO(pld,pName,price,tax);
	}
	
	public void productPrint() {
		for(int i = 0 ; i < count ; i++) {
			System.out.println(pro[i].information());
		}
	}
}
