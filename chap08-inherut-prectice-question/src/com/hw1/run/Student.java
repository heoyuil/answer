package com.hw1.run;

import com.hw1.model.dto.Person;

public class Student extends Person{
	private int grade;
	private String major;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name,int age, double height, double weight,int grade,String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}

	public String information() {
		return "이름 =" + getName() + ", 나이 =" + getAge() + ", 신장 =" + getHeight()
				+ "몸무게 =" + getWeight() + ", 학년 =" + grade + ", 전공 =" + major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
