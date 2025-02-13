package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("가격을 입력하세요 : ");
		double buy = sc.nextDouble();
		//sc.nextLine(); // int -> Line 오류 방지
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) :  ");
		boolean mem = sc.nextBoolean();
		double discountMem = 0.10;
		double discount = 0.05;
		double totaldiscount = mem ? buy * discountMem : buy * discount;
		double totalPrice = buy -  totaldiscount;
		
		System.out.printf("할인을 포함한 최종금액 : %.1f", totalPrice);
		
	}
	
	public void practice2() {
		
		System.out.print("출금할 금액 입력 : ");
		int money = sc.nextInt();
		int i = 50000; int j = 10000; int k = 5000; int l = 1000;
		int count50 = money/i;
		money %= i;
		int count10 = money/j;
		money %= j;
		int count5 = money/k;
		money %= k;
		int count1 = money/l;
		money %= l;
		
		
		System.out.printf("50000원: %d\n", count50);
		System.out.printf("10000원: %d\n", count10);
		System.out.printf("5000원: %d\n", count5);
		System.out.printf("1000원: %d\n", count1);
		
	}
	
	public void practice3() {
		
		System.out.print("첫 번째 수 : ");
		int f = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int t = sc.nextInt();
		String result = (f % t == 0)? "배수입니다":"배수가 아닙니다";
		
		System.out.printf("%s", result);
		
		
	}
	
}
