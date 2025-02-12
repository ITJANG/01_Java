package edu.kh.op.practice;

import java.util.Scanner;

// 기능 클래스

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		// 인원수, 사탕개수 스캔
		// 사탕개수 / 인원수, 사탕개수 % 인원수 출력
		
		
		int person = 0;
		int cendy = 0;
		
		System.out.print("인원 수를 입력해주세요 : ");
		person = sc.nextInt();
		System.out.print("사탕 개수를 입력해주세요 : ");
		cendy = sc.nextInt();
		
		System.out.printf("인원 수 : %d\n사탕 개수 : %d\n\n1인당 사탕 개수 : %d\n남는 사탕 개수 : %d "
				, person, cendy, cendy/person, cendy%person );
		
	}
	
	public void practice2() {
		// 입력 받은 값들 변수에 기록, 변수 값 화면에 출력
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(정수만) : ");
		int age = sc.nextInt();
		System.out.print("반(정수만) : ");
		int c1ass = sc.nextInt();
		System.out.print("번호(정수만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(남학생/여학생) : ");
		String sex = sc.nextLine();
		System.out.print("성적(정수만) : ");
		double grade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다."
				, age, c1ass, number, name, sex, grade);
	}
	
	public void practice3() {
		// 국어, 영어, 수학 점수 스캔
		// 총합 점수와 평균 구하기 %.1f
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.println();
		
		System.out.printf("합계 : %d\n평균 : %.1f"
				, kor + eng + math, (kor + eng + math)/3.0);
		
	}
	
}
