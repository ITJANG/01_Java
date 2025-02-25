package edu.kh.Inheritance.model.dto;

// DTO(Data Transfer Object) : 비즈니스 계층과 데이터 교환을 위해 사용하는 객체
public class Person {
	
	// Object 클래스
	// 모든 클래스의 최상위 부모
    // 상속 받고 있는 클래스가 없다면 기본적으로 상속 받음(생략되어있음)
	// 컴파일러가 extends Object 구문을 자동으로 추가해줌
	
	// 속성(필드)
	private String name;		//이름
	private int age;			// 나이
	private String nationality; // 국적
	
	// 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String nationality) {
		super(); // 부모의 생성자(Object 클래스의 기본 생성자)
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	// 기능(메서드)
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다");
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다");
	}
	
	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
	}
	
}
