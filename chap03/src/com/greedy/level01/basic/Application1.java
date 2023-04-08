package com.greedy.level01.basic;

public class Application1 {
	
	/* 실행용 메소드 */
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.checkMethod();
		
		System.out.println("10과 20의 합은" + 	cal.sumTwoNumber(10, 20) + "입니다");
		System.out.println("10과 20의 곱은" + 	cal.multiTowNumber(10, 20) + "입니다");
	}
}
