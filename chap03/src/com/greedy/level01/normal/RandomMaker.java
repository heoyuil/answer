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
	/**<pre>
	 * 스태틱 메소드로 호출시 가위,바위,보를 랜덤하게 반환
	 * </pre>
	 * @return
	 */
	public static String rockPaperScissors(){
		int ran = (int)(Math.random() * 3);				//0~2까지에 난수 생성
		String str = ran==0 ? "가위" :(ran==1? "바위" : "보");	//0이면 가위 1이면 바위 그외의 수면 보를 문자열 변수에 초기화
		return str;
	}
	
	public static String tossCoin() {
		int ran = (int)(Math.random()*2);				//0~1까지에 난수 생성
		String str = ran==0 ? "앞면" : "뒷면";					//0이면 앞면 그외의 수면 뒷면을 문자열 변수에 초기화
		return str;
	}
}
