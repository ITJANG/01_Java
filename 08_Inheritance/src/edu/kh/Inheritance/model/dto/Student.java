package edu.kh.Inheritance.model.dto;

/*
 * Object
 * 		ㄴ Person
 * 				ㄴ Student
 */

// 상속 방법 : 자식 exdens  부모
public class Student extends Person{
	// Student 클래스에 Person 클래스 내용을 확장한다
	// == Student 클래스에 person 클래스 필드, 메서드
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String name, int age, String nationality, int grade, int classRoom) {
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
	}



	// 속성(필드)
//	private String name;
//	private int age;
//	private String nationaliy;
	private int grade;
	private int classRoom;
	
	// 기능
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getNationaliy() {
//		return nationaliy;
//	}
//	public void setNationaliy(String nationaliy) {
//		this.nationaliy = nationaliy;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	
}
