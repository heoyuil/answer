package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application6 {

	public static void main(String[] args) {
		
		/* 두 개의 정수를 입력 받아 변수에 저장하고,
		 * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
		 * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
		 * 
		 * -- 입력 예시 --
		 * 첫 번째 정수 : 4
		 * 두 번쨰 정수 : 3
		 * 연산 기호를 입력하세요 : +
		 * 
		 * -- 출력 예시 --
		 * 4 + 3 = 7 
		 */
		Scanner sc =new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		
		sc.nextLine();									//버퍼 초기화
		System.out.print("연산기호를 입력하세요 : ");
		char c = sc.nextLine().charAt(0);				//문자형을 받을려면 nextLine으로 받은 후 charAt로 원하느 인덱스에 있는 문자를 받음

		int result = 0;
		
		switch(c) {
		case '+': result = a+b;break;
		case '-': result = a-b;break;
		case '*': result = a*b;break;
		case '/': result = a/b;break;
		case '%': result = a%b;break;
		default: System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");return; //입력한 연산이 없을 시 종료
		}
		System.out.println(a+" "+c+" "+b+" = " +result);
	}
}
