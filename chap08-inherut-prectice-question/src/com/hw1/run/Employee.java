package com.hw1.run;

import com.hw1.model.dto.Person;

public class Employee extends Person {
	private int salsry;
	private String dept;
	public Employee() {
	}
	public Employee(String name,int age,double height,double weight,int salsry, String dept) {
		super(age,height,weight);
		super.name = name;
		this.salsry = salsry;
		this.dept = dept;
	}


	public String information() {
		return "이름=" + getName() + ", 나이=" + getAge() + ", 신장=" + getHeight()
				+ ", 몸무게=" + getWeight() + ", 급여=" + salsry + ", 부서=" + dept;
	}
	public int getSalsry() {
		return salsry;
	}
	public void setSalsry(int salsry) {
		this.salsry = salsry;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
