package edu.kh.oop.cls.model.vo;

public class User {
	
	// 속성 (필드)
	// 아이디, 비번, 이름, 나이, 성별
	// 데이터 직접접근 불가 원칙 -> 필드는 기본적으로 모두 private(캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	
	// 기본 생성자(매개변수 X)
	public User() {
		// 기능
		System.out.println("기본 생성자로 User 객체 생성");
		
		// 필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
	}
	
	// 매개변수 생성자
	// 변수 : 매개변수, 오버로딩, this
	// 매개변수 생성자 자동완성
	// Generate Constructor using Fields
	// ** 매개변수 : 생성자나 메서드 호출시 () 안에 작성되어
	//		전달되어지는 값을 저장하고 있는 변수
	// -> 전달받은 값을 저장하고 있는 매개체 역할의 변수
	public User(String userId, String userPw) {
		// 기능
		System.out.println("매개변수 생성자로 User 객체 생성");
		
		// 필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		
		// this 참조변수
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
	}
	
	public User(String userId, String userPw, String userName, 
			int userAge, char userGender) {
		// 기능
		// this() 생성자
		// 같은 클래스의 다른 생성자를 호출할때 사용
		// 주의 : 생성자 내에서 반드시 첫번째 줄에 작성해야 함
		// 장점 : 중복코드 제거, 코드 길이 감소, 재사용성 증가
		// 단점 : 가독성 감소
		this(userId, userPw);
		
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	
	// 오버로딩(Overloading)
	// - 클래스 내에 동일한 이름의 메서드를 여러개 작성하는 기법
	
	// 오버로딩 조건
	// 1) 메서드의 이름이 동일
	// 2) 매개변수의 개수, 자료형, 순서 중 1개라도 달라야함
	public User(String userId) {}// 매개변수의 개수가 같은 생성자 없음
	// - > 성립
	public User(int userAge) {} // 매개변수의 개수는 같지만 타입이 다름
	
	public User(String userID, int userAge) {}
	// 매개변수의 개수와 동일한 것이 있으나, 하나의 타입이 다름
	
	public User(int userAge, String userId) {}
	
	// 기능 (생성자 + 메서드)
	private char userGender;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	//@Override : 메서드가 부모 클래스의 메서드를 정확히 오버라이딩 검사
	// 1. 만약 오타가 있거나, 부모 클래스에 없는 메서드를 잘못 작성했을 경우 컴파일 오류
	// 2. 이 메서드가 부모 클래스를 재정의 했다는 것을 한눈에 알 수 있음
	@Override // @(어노테이션) : 컴파일러 인식용 주석
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + 
				", userName=" + userName + ", userGender=" + userGender + "]";
	}
	// toString() 메서드 : Object 최상위 클래스 이미 만들어져있는 메서드
	// 객체가 문자열로 변환될 때 호출되는 메서드
	// -> 보통 객체의 필드값을 출력하는 용도로 오버라이딩해서 사용
	
	/*
	 * 생성자(Constructor)
	 * 
	 * - new 연산자를 통해서 객체를 생성할 때
	 * 생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
	 * 
	 * - 생성자 작성 규칙
	 * 1) 생성자의 이름은 반드시 클래스 명과 같아야 한다.
	 * 2) 반환형이 존재하지 않는다.
	 * 
	 * - 생성자 종류
	 * 1) 기본 생성자
	 * 2) 매개변수 생성자
	 */
}
