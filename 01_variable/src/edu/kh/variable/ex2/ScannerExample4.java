package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// nextInt() 사용 후 nextLine() 사용시 문제점
		System.out.print("nextInt 입력 : ");
		int intNum = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("nextLine 입력 : ");
		String word = sc.nextLine();
		
		
		
	}
}
