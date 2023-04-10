package com.greedy.level03.hard.emp.model.dto;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		System.out.print("num = ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("dept = ");
		String dept = sc.nextLine();
		System.out.print("job = ");
		String job = sc.nextLine(); 
		System.out.print("age = ");
		int age = sc.nextInt();
		System.out.print("gender = ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("salary = ");
		int salary = sc.nextInt();
		System.out.print("bonusPoint = ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.print("phone = ");
		String phone = sc.nextLine();
		System.out.print("address = ");
		String address = sc.nextLine();
		employeeDTO.setAddress(address);
		employeeDTO.setAge(age);
		employeeDTO.setBonusPoint(bonusPoint);
		employeeDTO.setDept(dept);
		employeeDTO.setGender(gender);
		employeeDTO.setJob(job);
		employeeDTO.setName(name);
		employeeDTO.setNumber(number);
		employeeDTO.setPhone(phone);
		employeeDTO.setSalary(salary);
		System.out.println(employeeDTO.getNumber());
		System.out.println(employeeDTO.getName());
		System.out.println(employeeDTO.getDept());
		System.out.println(employeeDTO.getJob());
		System.out.println(employeeDTO.getAge());
		System.out.println(employeeDTO.getGender());
		System.out.println(employeeDTO.getSalary());
		System.out.println(employeeDTO.getBonusPoint());
		System.out.println(employeeDTO.getPhone());
		System.out.println(employeeDTO.getAddress());
	}

}
