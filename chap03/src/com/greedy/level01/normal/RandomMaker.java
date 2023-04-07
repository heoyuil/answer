package com.greedy.level01.normal;

public class RandomMaker {

	/* 
	 * static 메소드로 생성
	 * 반환형 : String
	 * 메소드명 : rockPaperScissors
	 * 
	 * 가위,바위,보 중에 하나를 출력
	 * (가위,바위,보 는 난수를 이용하여 구현)
	 * 
	 * -- 출력 --
	 * 가위
	 * */
	
	/* 
	 * static 메소드로 생성
	 * 반환형 : String
	 * 메소드명 : tossCoin
	 * 
	 * 동전 앞/뒤 중에 하나를 출력
	 * (앞면,뒷면은 난수를 이용하여 구현)
	 * 
	 * -- 출력 --
	 * 앞면
	 * 
	 * */
	public static String rockPaperScissors(){
		int ran = (int)(Math.random()*3);
		String str = ran==0?"가위":(ran==1?"바위":"보");
		return str;
	}
	
	public static String tossCoin() {
		int ran = (int)(Math.random()*2);
		String str = ran==0?"앞면":"뒷면";
		return str;
	}
}
