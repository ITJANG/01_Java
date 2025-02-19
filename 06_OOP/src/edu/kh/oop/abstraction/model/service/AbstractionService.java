package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지

public class AbstractionService {
	
	//속성
	//기능
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(참조변수)
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형처럼 사용된다 *
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다
		/*
		 * p1.name = "홍길동"; 
		 * p1.gender = '남'; 
		 * p1.pNo = "123456-1234567"; 
		 * p1.address = "서울시 중구 남대문로 120"; 
		 * p1.phone = "010-2134-1234"; 
		 * p1.age = 20;
		 * 
		 * p1.tax(); p1.vote();
		 * 
		 * System.out.println("p1의 name : " + p1.name);
		 * System.out.println("p1의 gender : " + p1.gender);
		 * System.out.println("p1의 pNo : " + p1.pNo);
		 * System.out.println("p1의 address : " + p1.address);
		 * System.out.println("p1의 phone : " + p1.phone);
		 * System.out.println("p1의 age : " + p1.age);
		 */
		
		// 전달하는 값(인자) : 전달인자
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		
	}
	public void ex2() {
		// 본인 객체
		// People 클래스 이용하여 본인 이름 객체 생성
		// 본인의 정보 setter 값 대입
		// getter 이용해서 콘솔창 출력까지
//		* p1.name = "홍길동"; 
//		 * p1.gender = '남'; 
//		 * p1.pNo = "123456-1234567"; 
//		 * p1.address = "서울시 중구 남대문로 120"; 
//		 * p1.phone = "010-2134-1234"; 
//		 * p1.age = 20;
		
		
//		My my = new My();
		People my = new People();
		
		my.setName("조민장");
		my.setGender('남');
		my.setpNo("001213-1231234");
		my.setAddress("경기도 의정부시");
		my.setPhone("010-8794-8442");
		my.setAge(26);
		
		System.out.println(my.getName());
		System.out.println(my.getGender());
		System.out.println(my.getpNo());
		System.out.println(my.getAddress());
		System.out.println(my.getPhone());
		System.out.println(my.getAge());
		
		
	}
}
