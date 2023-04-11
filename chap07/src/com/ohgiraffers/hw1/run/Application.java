package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
public class Application {
	public static void main(String[] args) {
		
	int avg = 0;
	int sum = 0;
	
	EmployeeDTO[] emp = new EmployeeDTO[3];
	emp[0] = new EmployeeDTO();
	emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
	emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
	
	for(int i = 0; i<emp.length;i++) {
		System.out.println("emp["+i+"] : " + emp[i].information());
		}
	System.out.println("=============================");
	
	emp[0] = new EmployeeDTO(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
	emp[1] = new EmployeeDTO(1, "홍길동","기획부", "부장",19, 'M',4000000,0.3, "01022223333", "서울 잠실");
	for(int i = 0; i<emp.length-1;i++) {
		System.out.println("emp["+i+"] : " + emp[i].information());
		}
	String s1 = emp[0].information();
	String s2 = emp[1].information();
	String s3 = emp[2].information();
	int salary1 = Integer.parseInt(s1.substring(24, 31));
	int salary2 = Integer.parseInt(s2.substring(24, 31));
	int salary3 = Integer.parseInt(s3.substring(24, 31));

	double bonusPoint1 = Double.parseDouble(s1.substring(33, 36));
	double bonusPoint2 = Double.parseDouble(s2.substring(33, 36));
	double bonusPoint3 = Double.parseDouble(s3.substring(33, 37));
	salary1 = (salary1+(int)(salary1*bonusPoint1))*12;
	salary2 = (salary2+(int)(salary2*bonusPoint2))*12;
	salary3 = (salary3+(int)(salary3*bonusPoint3))*12;
	System.out.println("=============================");
	System.out.println("김말똥의 연봉 : "+ salary1+"원");
	System.out.println("홍길동의 연봉 : "+ salary2+"원");
	System.out.println("강말순의 연봉 : "+ salary3+"원");
	sum = salary1 + salary2 + salary3;
	avg = sum / 3;
	System.out.println("=============================");
	System.out.println("직원들의 연봉의 평균 : " + avg+"원");
	}
}
