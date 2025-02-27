package edu.kh.generics;

public class Run {
	public static void main(String[] args) {
		
		// String 타입으로 Box 객체 생성
		Box<String> stringBox = new Box<>();
		// T가 String 대체됨
		// -> 필드도 String 타입, getter/setter에서 사용되는 타입도 String
		stringBox.setItem("안녕 제네릭");
		System.out.println(stringBox.getItem());
		
		Box<Integer> intBox = new Box<>();
		
		intBox.setItem(123);
		System.out.println(intBox.getItem());
		
		// 제네릭은 객체(Reference Type)만 허용
		// -> 제네릭은 기본자료형(pribitive type)인 int, double, char 같은 타입 사용X
		// -> 대신 Wrapper 클래스를 사용
		
		
	}
}
