package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
	// [접근 제한자] [예약어] class 클래스명
	
	// 접근제한자 public : 같은 프로젝트 내의 어떤 class든 import 가능
	
	// 1. 필드(field) : 객체의 속성을 작성하는 클래스 내부 영역
	// == 멤버변수
	
	// 인스턴스 변수 : 필드에 작성되는 일반 변수
	// ex) private int age;
	
	// 클래스 변수(== static 변수) : 필드에 static 예약어가 작성된 변수
	// ex) public static String schoolName;
	
	// 필드 접근제한자 예제
	// 필드의 접근제한자 뜻 : 직접 접근 가능 범위
	public int v1 = 10;		// 전체에서 접근 가능
	protected int v2 = 20;	// 후손 클래스내까지 가능
	int v3 = 30;			// 같은 패키지내까지 가능
	private int v4 = 40;	// 해당 클래스내만 가능
	
	// static 예약어
	public static String schoolName = "KH고";
	
	// final 예약어
	private final int TEMP1 = 100;
	// final(상수)는 재대입이 불가능 하기에 getter/setter 중 getter만 만들어짐
	
	
	// 2. 생성자
	
	


	// 3. 메서드
	public int getTEMP1() {
		return TEMP1;
	}
	
	public void ex() {
		//클래스 접근제한자 확인
		TestVO test = new TestVO();
		// 같은 패키지에서만 사용 가능	
		
		// 필드 접근제한자 확인
		// v1~v4 까지 전부 student 클래스 내부에서 생성된 변수이기 때문에
		// 같은 클래스 내부인 이곳에서 직접 접근 가능
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
	
	
}
