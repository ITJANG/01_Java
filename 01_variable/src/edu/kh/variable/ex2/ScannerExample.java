package edu.kh.variable.ex2;

import java.util.Scanner;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
// import java.util.Scanner : java.util 패키지에서 Scanner Class(설계도) 수입


public class ScannerExample {
	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행중 키보드 입력을 받을 수 있게 하는 역할
		
		// Scanner 객체 생성
		// -> 내 프로그램 안에 Scanner 라는 기계를 만드는 것
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); //정수를 입력받는 것
		// 스캐너를 통해 입력받은 정수를 input1변수에 대입
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
	
		System.out.printf("%d +%d = %d\n ", input1, input2, input1 + input2);
	}
}
