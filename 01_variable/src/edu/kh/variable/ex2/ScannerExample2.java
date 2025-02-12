package edu.kh.variable.ex2;

import java.util.Scanner;

// ctrl + shift + o : 현재 파일에서 import 되지 않은 클래스 모두 import 단축키

public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input1=0;
		double input2=0;
		
		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 둘째 자리까지만 표현
		
		System.out.println("첫번째 숫자를 입력해주세요");
		input1 = sc.nextDouble();
		System.out.println("두번째 숫자를 입력해주세요");
		input2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1+input2);
		System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1-input2);
		System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1*input2);
		System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1/input2);
		
		System.out.printf("덧셈: %.2f, 뺄셈: %.2f, 곱셈: %.2f, 나눗셈: %.2f\n"
				, input1+input2, input1-input2, input1*input2, input1/input2);
		
	}
}
