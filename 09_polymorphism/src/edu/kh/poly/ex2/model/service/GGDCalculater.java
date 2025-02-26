package edu.kh.poly.ex2.model.service;

public class GGDCalculater implements Calculator, TestInterface {

	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
	
	// 다중상속 중인 인터페이스들에 같은 디폴트 메서드가 겹치면 오류발생!
	// -> 구현 클래스에서 오버라이딩 반드시 해야함
	@Override
	public void display() {
		// TODO Auto-generated method stub
		TestInterface.super.display();
	}
	
}
