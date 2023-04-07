package com.greedy.section01.array.level01.basic;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
		 * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
		 * */
		Scanner sc =new Scanner(System.in);
		int[] iarr = new int[10];
		for(int i = 0 ; i <iarr.length;i++) {
			System.out.print(i+1+"번째 숫자를 입력하세요 : ");
			iarr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 10;i++) {
			System.out.print(iarr[i]+ " ");
		}
	}

}
