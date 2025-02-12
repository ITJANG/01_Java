package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void  practice4() {
		
// 나이(int) 스캔 -> 
// 20 "저는 성인 입니다", "저는 미성년자 입니다"
// 13 ~ 19 "청소년입니까? true", "청소년입니까? false"
// 65up or 12down "노인이거나 어린이 입니까? true"
		
		System.out.print("당신의 나이는 ? : ");
		int age = sc.nextInt();
		System.out.printf("%s", (age >= 20 ? "저는 성인 입니다\n" : "저는 미성년자 입니다\n") );
		System.out.printf("%s", (age >= 13 && age <= 19 ? "청소년입니까? true\n" : "청소년입니까? false\n") );
		System.out.printf("%s", (age >= 65 || age <= 12 ? "노인이거나 어린이 입니까 true\n" : "노인이거나 어린이 입니까? false\n") );
		
	}
	
}
