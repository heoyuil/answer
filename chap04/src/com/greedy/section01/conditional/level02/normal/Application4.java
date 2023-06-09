package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		   합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		   (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		   합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		   불합격인 경우에는 “불합격입니다.”를 출력하세요.
		   
		   -- 출력 예시
	   		ex 1.			ex 2.
			국어점수 : 88		국어점수 : 88
			수학점수 : 50		수학점수 : 50
			영어점수 : 40		영어점수 : 45
			불합격입니다.		국어 : 88
							수학 : 50
							영어 : 45
							합계 : 183
							평균 : 61.0
							축하합니다, 합격입니다!

		 * */
		Scanner sc= new Scanner(System.in);
		System.out.print("국어점수 : ");
		int a = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int b = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int c = sc.nextInt();
		
		int sum  = a+b+c; 							// 합계 계산
		double avg = (double)sum / 3;				// 합계를 double 형변환후 / 3 해서 평균계산
		
		if(avg<60||a<40 || b<40 || c<40){			// 평균이 60아래거나 각 과목이 40미만이면 불합격을 출력
			System.out.println("불합격입니다");
		}else {
			System.out.println("국어점수 : " + a);
			System.out.println("수학점수 : " + b);
			System.out.println("영어점수 : " + c);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다");
		}
	}
}
