package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	
	public static void main(String[] args) {
		
		// 문자열(String) 입력
		// 문자열을 3번 입력받아 한줄로 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		// sc.next() 	 : 다음 입력된 한 단어를 읽어옴
		//					공백(스페이스, 탭 등) 만나면 입력 중단
		// sc.nextLine() : 다음 입력된 한 줄을 읽어옴
		//					공백과 함께 입력된 모든 내용을 입력받음
		
		
		String str1 = "";
		String str2 = "";
		String str3 = "";
		String str4 = "";
		String str5 = "";
		
		System.out.print("문자열 입력 1 : ");
		str1 = sc.nextLine();
		System.out.print("문자열 입력 2 : ");
		str2 = sc.nextLine();
		System.out.print("문자열 입력 3 : ");
		str3 = sc.nextLine();
		System.out.print("문자열 입력 4 : ");
		str4 = sc.nextLine();
		System.out.print("문자열 입력 5 : ");
		str5 = sc.nextLine();
		
		System.out.printf("%s%s%s%s%s\n", str1, str2, str3, str4, str5);
		System.out.printf("%s\n%s\n%s\n%s\n%s\n", str1, str2, str3, str4, str5);
		
		
	}
}
