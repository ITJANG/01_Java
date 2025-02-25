package edu.kh.Inheritance.model.dto;

// final 클래스 : 상속 불가 (부모 불가능)
// -> 제공되는 클래스 그대로 사용해야하는 경우
public /*final*/ class Employee extends Person {
	
	/*
	 * Object
	 * 		ㄴ Person
	 * 				ㄴ Employee
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}
	
	// Person으로부터 상속받은 메서드 중
	// move() 메서드를 Employee에 맞게 재정의(== 오버라이딩)
	
	// @Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을
	// 커파일러에게 알려주는 역할
	// -> 컴파일러에게 문법 체크를 하도록 알린다
	// -> 부모에게 해당 메서드가 있는지 체크
	// -> 이름, 매개변수(타입, 개수, 순서) 체크
	
	//@Override
	public void move() {
		// super 참조변수 : 상속관계에서 부모 객체를 가리키는 참조변수
		super.move();
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 일하고 빨리 퇴근");
	}
	
	
	//getter/setter
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		
		this.company = company;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + company;
	}
	/*
	 * final 메서드 -> 오버라이딩 불가
	 * - 메서드의 기능이 변하면 안되는 경우
	 */
	public final void onlyEmployee() {
		System.out.println("final 메서드");
	}
	
}
