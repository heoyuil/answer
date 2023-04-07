package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		
		/* 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
		 * 
		 * ===== 출력 ======
		 * 양의 정수를 입력하세요 : 4
		 * 1 2 3 4
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int n = sc.nextInt();
		int cnt = 1;
		int[] arr= new int[n];
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = cnt++;
			System.out.print(arr[i]+ " ");
		}
	}
}
