package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("가격을 입력하세요 : ");
		double buy = sc.nextDouble();
		sc.nextLine(); // int -> Line 오류 방지
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) :  ");
		String mem = sc.next();
		
		
		System.out.printf("할인을 포함한 최종금액 : %f", (mem == "true" ? (buy-(buy/10)) : (buy-(buy/5))));
		
	}
	
	public void practice2() {
		
		
		
	}
	
	public void practice3() {
		
		
		
	}
	
}
