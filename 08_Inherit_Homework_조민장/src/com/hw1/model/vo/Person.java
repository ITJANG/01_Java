package com.hw1.model.vo;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	
	// 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	
	// 메서드
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f",
				name, age, height, weight);
	}

	
	
	
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
