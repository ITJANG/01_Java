package edu.kh.control.practice;

import java.util.Scanner;

public class Run1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ConditionPractice cp = new ConditionPractice();
		for(int i=0; i<2 ;) {
		System.out.println("실행할 프로그램을 선택하세요");
		System.out.println("1. 양수\n2. 성적1\n3. 월일\n4. BMI\n5.성적2\n6.쇼핑\n");
		int p = sc.nextInt();
		
			switch (p) {
			case 1:
				cp.practice1(); break;
			case 2:
				cp.practice2(); break;
			case 3:
				cp.practice3(); break;
			case 4:
				cp.practice4(); break;
			case 5:
				cp.practice5(); break;
			case 6:
				cp.practice6(); break;
			default :
				System.out.println("잘못 된 입력");
			}
			
			System.out.println("\n1. 재시도 / 2. 종료");
			int r = sc.nextInt();
			
			if(r == 1)
				i = 1;
			else if (r == 2)
				i = 2;
			else
				i = 3;
				System.out.println("잘못 된 입력 종료");
		}
	}

}
