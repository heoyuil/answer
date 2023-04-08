package com.greedy.level01.basic;

public class Calculator {

	// 반환값 : x
	// 메소드명 : checkMethod
	// 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드
	
	// 반환값 : String
	// 메소드명 : sumTwoNumber
	// 두개의 전달인자를 받아 두수의 합을 반환
	// 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
	// 출력하는 기능
	
	// 반환값 : String
	// 메소드명 : multiTwoNumber
	// 두개의 전달인자를 받아 두수의 곱을 반환
	// 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
	// 출력하는 기능
	
	public void checkMethod() {
		System.out.println("메소드 호출 확인");
	}
	
	/**<pre>
	 * 매개변수로 받은 정수 2개를 더한후 결과값을 문자열로 반환하는 메소드
	 * </pre>
	 * @param a
	 * @param b
	 * @return
	 */
	public String sumTwoNumber(int a,int b) {
		int sum = a + b;
		return ""+ sum;
	}
	
	/**<pre>
	 * 매개변수로 받은 정수 2개를 곱한후 결과값을 문자열로 반환하는 메소드
	 * </pre>
	 * @param a
	 * @param b
	 * @return
	 */
	public String multiTowNumber(int a,int b) {
		int mult = a * b;
		return "" + mult;
	}
	
}
