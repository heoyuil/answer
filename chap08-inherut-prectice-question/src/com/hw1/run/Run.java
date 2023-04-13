package com.hw1.run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Student[] stu = new Student[3];
	stu[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
	stu[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
	stu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
	for(Student s : stu) {
		System.out.println(s.information());
	}
	 String name;
	 int age;
	 double height;
	 double weight;
	 int salsry;
	 String dept;
	 int cnt = 0;
	Employee[] em = new Employee[10];
	while(true) {
		System.out.print("이름 : ");
		name= sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("신장 : ");
		height = sc.nextDouble();
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		System.out.print("급여 : ");
		salsry = sc.nextInt();
		sc.nextLine();
		System.out.print("부서 : ");
		dept = sc.nextLine();
		em[cnt++] = new Employee(name, age, height, weight, salsry, dept);
		System.out.print("계속 추가 하실 겁니까?(Y or y이면 계속 함)");
		char c = sc.nextLine().charAt(0);
		if(c=='y'||c=='Y') continue;
		else break;
	}
	for(int i = 0 ; i < cnt;i++) {
		System.out.println(em[i].information());
	}
	
	}
}
