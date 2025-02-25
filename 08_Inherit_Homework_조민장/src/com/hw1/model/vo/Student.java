package com.hw1.model.vo;

public class Student extends Person {
	private int grade;
	private String major;
	
	// 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, double height, double weight, 
			int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	
	// 메서드
	@Override
	public String information() {
		return super.information() +  String.format(" / 학년 : %d / 전공 : %s", grade, major);
	}
	
	
	// getter/setter
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
