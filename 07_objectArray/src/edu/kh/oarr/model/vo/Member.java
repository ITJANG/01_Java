package edu.kh.oarr.model.vo;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private String region; // 지역(서울, 경기, 충북 ...)
	private int memberAge;
	
	// 기능(메서드, 생성자)
	// 생성자
	// 기본생성자, 매개변수 생성자
	// 생성자 작성 규칙
	// 1. 생성자 이름은 클래스명과 같다
	// 2. 반환형이 없다
	// ** 기본생성자는 컴파일러가 자동 생성해준다 **
	// 생성자가 하나라도 있으면 자동 생성 안해줌
	// -> 매개변수생성자가 있다면, 기본생성자를 직접 만들어야한다
	
	// 메서드
	// getter/setter
	// 필드에 선언된 멤버변수들이 캡슐화 원칙에 의해서 private로 선언도미
	// private는 다른 클래스에서 직접 접근X
	// 간접 접근 방식으로 값을 세팅/얻어올 수 있도록 메서드를 만들어 제공
	// getter/setter의 접근제한자는 public 이어야 한다
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		  
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setUserName(String memberName) {
		this.memberName = memberName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	// 기본생성자 Ctrl + Space + Enter
	public Member() {};
	
	// 매개변수 생성자 Generate Constructor using Field
	// 오버로딩 : 같은 클래스 내 동일한 생서자명, 메서드명 등을 이용할 수 있는 기법
	// 오버로딩 성립조건 : 매개변수의 개수, 순서, 자료형 중 하나라도 달라야 함
	//                     + 이름이 같아야 함
	public Member(String memberId, String memberPw, String memberName, String region, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.region = region;
		this.memberAge = memberAge;
	}
	
	
}
