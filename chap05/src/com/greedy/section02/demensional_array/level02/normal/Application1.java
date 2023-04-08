package com.greedy.section02.demensional_array.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 가로와 세로 길이를 정수형으로 입력 받아
		 * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
		 * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
		 * 
		 * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
		 * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
		 * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
		 * 
		 * -- 입력 예시 --
		 * 가로 행의 수를 입력하세요 : 5
		 * 세로 열의 수를 입력하세요 : 4
		 * 
		 * -- 출력 예시 --
		 * F H Z G 
         * W F O T 
         * O R X V 
         * W H J X 
         * W S S J 
		 * */
		int a,b;	//가로 세로 저장할 변수
		char[][] carr; //가로 세로길이를 이용할 2차원 배열
		Scanner sc = new Scanner(System.in);
		
		do {		//1~10까지 가로 세로 받을 반복문
		System.out.print("가로 행의 수를 입력하세요 : ");
		a = sc.nextInt();
		
		System.out.print("세로 열의 수를 입력하세요 : ");
		b = sc.nextInt();
		
		if ((a<1||a>10)||(b<1||b>10)) System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
		}while((a<1||a>10)||(b<1||b>10));
		
		carr = new char[a][b];	//할당
		
		for(int i = 0 ; i < carr.length;i++) { //알파벳을 저장
			for(int j = 0; j<carr[i].length;j++) {
				carr[i][j] = (char)((int)(Math.random()*26)+65); //알파벳만들기
				System.out.print(carr[i][j]+" ");	//저장후 바로 출력
			}
			System.out.println();
		}
	}
}
