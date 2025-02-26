package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal {

	
	
	// 생성자
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}
	
	// getter / setter
	
	
	
	
	// 오버라이드
	@Override
	public void eat() {
		System.out.println("입을 버끔거리며 먹는다");
	}


	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다");
	}

	@Override
	public void move() {
		System.out.println("꼬리로 헤엄치며 움직인다");
	}
	
	@Override
	public String toString() {
		return "Fish : " + super.toString();
	}
	
}
