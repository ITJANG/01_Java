package edu.kh.variable.ex1;

public class VariableExample3 {
	public static void main(String[] args) {
		
		// 형변환(Casting) : 값의 자료형을 변환하는 것 (단, boolean 제외)
		/*
		 * 필요한 이유
		 * - 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능
		 * 다른 자료형과 연산 시 오류 발생
		 * --> 이런 상황을 해결하기 위해서 필요한 기술이 형변환
		 * 
		 * 자동 / 강제 형변환 존재
		 * 
		 */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1 + num2));
		System.out.println("자동 형변환 결과 : " + num1 + num2);
		
		// int -> long
		int i2= 2_100_000_000;
		long l2 = 10_000_000_000l;
		
		long result = i2 + l2;
		
		System.out.println(result);
		
		char ch3 ='v';
		int i3 = ch3;
		System.out.println(i3); //86
		char ch4 = '각';
		int i4 = ch4;
		System.out.println(i4);
		
	}
}
