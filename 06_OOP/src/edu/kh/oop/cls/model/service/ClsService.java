package edu.kh.oop.cls.model.service;

import java.util.Scanner;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

// ClsService와 Student/TestVO는 패키지가 다름
public class ClsService /*extends Student*/{
			// 부모로 Student 클래스를 상속 받음
			// ClsService(자식) Student(부모)
	public void ex1() {
		// 클래스 접근제한자 확인하기
		Student std = new Student();
		// public class인 Student는 import 가능
		
//		TestVO test new TestV();
		// defalt class인 TestVO는 import 불가
		
		// 필드 접근제한자 확인
		System.out.println(std.v1);
		// -> 전체에서 직접접근 가능한 public만 에러 발생 x
//		System.out.println(std.v2);
//		System.out.println(std.v3);
//		System.out.println(std.v4);
		
		// 상속관계에서 직접접근 가능 범위 테스트
		// *상속 받으면 부모것도 내꺼임
		// System.out.println(v1);
		// System.out.println(v2);
		// Student 클래스를 ClsService가 상속받았으므로
		// Student의 protected 변수인 v2는 직접접근 가능
		
		// v3 -> 다른 패키지라 x
		// v4 -> 다른 클래스 x
		
		
	}

	public void ex2() {
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println( std1.schoolName);
		System.out.println( std2.schoolName);
		// Static은 '클래스명.변수명' 으로 사용해야함
		
		System.out.println(Student.schoolName);
		
		Student.schoolName = "KH정보교육원";
		System.out.println( std1.schoolName);
		System.out.println( std2.schoolName);
		System.out.println( Student.schoolName);
		
		/*
		 * 공유 메모리 영역(또는 정적 메모리 영역)이라고 함
		 * 
		 * -> 프로그램 시작 시 static이 붙은 코드들이 모두
		 * static 영역에 생성되고,
		 * 프로그램이 종료될 때까지 사라지지 않음(정적)
		 * 그리고, static역역에 생성된 변수는 어디서든지 공유 가능(공유)
		 * 
		 */
		
	}

	public void ex3() {
		// 생성자 확인 테스트
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		User u2 = new User();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 문제점 : u1이 참조하고 있는 User 객체와
		// u2가 참조하고있는 User 객체의 필드값이 모두 동일함
		// 왜? 같은 기본 생성자로 User 객체를 생성했기 때문
		
		System.out.println("---------------------------");
		
		// 해결방법 1: setter를 이용해 새로운 값 재대입
		u2.setUserId("asd123");
		u2.setUserPw("12sdq12");
		u2.setUserName("김영희");
		u2.setUserAge(25);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 해결방법 2: 매개변수 생성자를 이용해
		// 객체가 생성될 때 부터 다른값으로 필드를 초기화
		User u3 = new User("test3", "pass123");
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		// 해결방법 3: 매개변수 생성자를 이용해
		// 객체가 생성될 때 부터 다른값으로 필드를 초기화
		User u4 = new User("user4", "qwe123", "유저4", 20, '남');
		
		System.out.println(u4.getUserId());
		System.out.println(u4.getUserPw());
		System.out.println(u4.getUserName());
		System.out.println(u4.getUserAge());
		System.out.println(u4.getUserGender());
	
		// -----------scanner--------
	
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비번 : ");
		String userPw = sc.nextLine();
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		System.out.print("나이 : ");
		int userAge = sc.nextInt();
		System.out.print("성별 : ");
		char userGender = sc.next().charAt(0);
		
		User u5 = new User(userId, userPw, userName, userAge, userGender);
		
		System.out.println(u5.getUserId());
		System.out.println(u5.getUserPw());
		System.out.println(u5.getUserName());
		System.out.println(u5.getUserAge());
		System.out.println(u5.getUserGender());
	}
	
	public void ex4() {
		
		User u1 = new User(); // 기본
		User u2 = new User("user02", "pass02"); // 매개변수 2개만 초기화
		User u3 = new User("user03", "pass03", "김길동", 
				30, '남');
		// 매개변수 5개 전부 초기화
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
				u1.getUserId(), u1.getUserPw(), u1.getUserName(),
				u1.getUserAge(), u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u2.getUserId(), u2.getUserPw(), u2.getUserName(),
				u2.getUserAge(), u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName(),
				u3.getUserAge(), u3.getUserGender());
		System.out.println(u1);
	}
}










