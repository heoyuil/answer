package com.greedy.operatorPractice;

public class Application3 {

	public static void main(String[] args) {
		
		/*
		 * 문자형 변수 하나를 선언하고 변수에 값이 M으로 초기화하면 남자입니다.
		 * F이면 여성입니다를 출력하도록 작성하세요 (삼항연산자사용)
		 * 
		 * M 
		 * 
		 * ---- 출력 결과 ---
		 * 남자입니다.
		 * */
		
		char c = 'M'; // 문자형 변수
		System.out.println(c=='F'?"여성입니다":"남자입니다");
	}

}
