package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
		 * 성별 자리 이후부터 *로 가려서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 주민등록번호를 입력하세요 : 990101-1234567
		 * 
		 * -- 출력 예시 --
		 * 990101-1******
		 */
		String str;		// 입력받은 문자열 저장할 변수
		char[] carr;	// 문자열을 문자 배열로 저장할 배열
		
		Scanner sc =new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 : ");
		str = sc.nextLine();
		
		carr = new char[str.length()];	//문자열 길이만큼 할당
		
		for(int i = 0 ; i < str.length();i++) {
			carr[i] = str.charAt(i);
			if(i>7) {					//인덱스 8반째부터는 *로 표시
				System.out.print("*");
				continue;
			}
		System.out.print(carr[i]);
		}
		
		

		
	}

}
