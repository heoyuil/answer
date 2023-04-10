package com.greedy.level02.normal.student.model.dto;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("학년 : ");
	int grade = sc.nextInt();
	System.out.print("반 : ");
	int classroom = sc.nextInt();
	System.out.print("이름 : ");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.print("키 : ");
	double height = sc.nextDouble();
	sc.nextLine();
	System.out.print("성별 : ");
	char gender = sc.nextLine().charAt(0);
	
	
	StudentVO student = new StudentVO(grade,classroom,name,height,gender);
	student.printForMation();

	}
}