package edu.kh.Inheritance.model.service;

import java.rmi.StubNotFoundException;
import java.util.EmptyStackException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import edu.kh.Inheritance.model.dto.Employee;
import edu.kh.Inheritance.model.dto.Person;
import edu.kh.Inheritance.model.dto.Student;

public class InheritanceService {
	// 상속확인 예제
	public void ex1() {
	
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		// Person을 상속받은 Student가 
		// 정말로 Person의 필드, 메서드를 사용할 수 있는가
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student 만의 고유 멤버
		std.setGrade(3);
		std.setClassRoom(5);
		
		// 상속받은 멤버
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("한국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		System.out.println(std.getNationality());
		
		System.out.println("===========================");
		
		Employee emp = new Employee();
		
		emp.setCompany("KH 정보교육원");
		emp.setName("조미현");
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		p.breath();
		p.move();
		
		std.breath();
		std.move();
		
		emp.breath();
		emp.move();
		
		// 특징 : 코드길이 감소, 중복 제거 효과
	}
	
	// super() 생성자 이용해보기
	public void ex2() {
		
		// Student 객체생성
		Student std = new Student("홍길동", 17, "한국", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		// Employee 객체 생성
		// 매개변수생성자 이용 (이름, 나이, 국적, 회사)
		// 참조변수명 emp ("김노동", 30, "한국", "KH정보교육원")
		Employee emp = new Employee("김노동", 30, "한국", "KH정보교육원");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
	}
	
	public void ex3() {
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); // 오버라이딩 X - > 부모의 메서드 수행
		// 사람은 움직일 수 있다
		
		emp.move(); // 오버라이딩 O -> Employee에서 재정의한 메서드 수행
		// 오버라이딩된 move 수행
	}
	
	public void ex4() {
		Person p = new Person("김철수", 17, "한국");
		System.out.println(p.toString());
		System.out.println(p);
		
		// print 구문 수행시 참조변수명 작성하면
		// 자동으로 to string() 메서드를 해철해서 출력
		
		System.out.println("----------------------------");
		Student std = new Student ("강호동" , 18, "미국", 2, 16);
		
		System.out.println(std.toString());
		
		Employee emp = new Employee("김노동", 36, "한국", "kh");
		System.out.println(emp);
	}
}










