package com.ohgiraffers.hw2.run;

import java.util.Scanner;

import com.ohgiraffers.hw2.model.dto.StudentDTO;
public class Application {
	public static void main(String[] args) {
		StudentDTO[] stu = new StudentDTO[10];
		Scanner sc = new Scanner(System.in);
		int grade;
		int classroom;
		String name;
		int kor;
		int eng;
		int math;
		int kSum = 0;
		int eSum = 0;
		int mSum = 0;
		int cnt = 0;
		while(true) {
			System.out.print("학년 : ");
			grade = sc.nextInt();
			System.out.print("반 : ");
			classroom = sc.nextInt();
			System.out.print("이름 : ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("국어점수 : ");
			kor = sc.nextInt();
			kSum += kor;
			System.out.print("영어점수 : ");
			eng = sc.nextInt();
			eSum += eng;
			System.out.print("수학점수 : ");
			math = sc.nextInt();
			mSum += math;
			stu[cnt++] = new StudentDTO(grade,classroom,name,kor,eng,math);
			sc.nextLine();
			System.out.print("계속 추가할 가냐 ?");
			
			char ch = sc.nextLine().charAt(0);
			if(ch=='y'||ch=='Y')
				continue;
			else
				break;
		}
		double kAvg = (double)kSum / cnt;
		double eAvg = (double)eSum / cnt;
		double mAvg = (double)mSum / cnt;
		System.out.println("국어 평균 : " + kAvg);
		System.out.println("영어 평균 : " + eAvg);
		System.out.println("수학 평균 : " + mAvg);
		
		for(int i = 0; i < cnt;i++) {
			System.out.println(stu[i].information());
		}
	}
}
