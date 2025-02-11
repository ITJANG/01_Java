package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main(String[] args) {
		
		/*
		 * 강제 형변환
		 * - 기존 자료형을 원하는 자료형으로 강제 변환
		 * 1) 값의 범위가 큰 자료형을 작은 자료형으로 변환할 때
		 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을 때
		 * 
		 * 방법
		 * - 자료형을 변환 시키고 싶은 값 또는 변수 앞에 (자료형) 붙이기
		 */
		
		double temp = 3.64;
		int num = (int)temp;
		
		System.out.println(temp);
		System.out.println(num);
		
		int num1 = 330;
	    byte num2 = (byte)num1;
	    System.out.println(num1);
	    System.out.println(num2);
	    
	    char ch2 = 'A';
	    System.out.println((int)ch2);
	    
	    int money = 44085;
	    System.out.println((char)money);
	    char moneyCr = (char)money;
	    System.out.println(moneyCr);
	    
	    //오버플로우 현상은 컴퓨터가 미리 예측할 수 없다
	    // 개발자가 예측해야 함
	    int i6 = 2147483647;
	    int result2 = i6 + 1;
	    System.out.println(result2);
	    
	    
	    
	}
}
