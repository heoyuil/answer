package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application7 {

	public static void main(String[] args) {
		
		/* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면 
		 * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
		 * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
		 * 
		 * -- 상품 가격 --
		 * 사과 :  1000원
		 * 바나나 : 3000원
		 * 복숭아 : 2000원
		 * 키위 : 5000원
		 * 
		 * -- 입력 예시 --
		 * 과일 이름을 입력하세요 : 바나나
		 * 
		 * -- 출력 예시 --
		 * 바나나의 가격은 3000원 입니다.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하세요 : ");
		String str = sc.nextLine();
		int result = 0;
		
		if(str.equals("사과")) {						
			result = 1000;
		}else if(str.equals("바나나")) {
			result = 3000;
		}else if(str.equals("복숭아")) {
			result = 2000;
		}else if(str.equals("키위")) {
			result = 5000;
		}else {
			System.out.println("준비된 상품이없습니다");
			return;
		}
		System.out.println(str + "의가격은 "+ result+"입니다");
	}
}
