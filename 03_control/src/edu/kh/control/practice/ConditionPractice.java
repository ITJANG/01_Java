package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int num;
		String result;
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = sc.nextInt();
		
		if (num <= 0)
			result = "양수만 입력해주세요";
		else {
			switch (num % 2) {
			case 0:
				result = "짝수"; break;
			default:
				result = "홀수"; break;
			}
		}
		
		System.out.println(result + "입니다");
	}
	
	public void practice2( ) {
		// 국어 영어 수학
		// 과락 40 평균 60
		// 불합격입니다 / 축하합니다, 합격입니다!
		
		int kor;
		int math;
		int eng;
		int total;
		double avg;
		String result;
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		total = kor + math + eng;
		avg = total / 3;
		
		if(kor < 40 || math < 40 || eng < 40 || avg < 60) {
			result = "불합격입니다";
			System.out.printf("합계 : %d\n", total);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println(result);
		}
		else {
			result = "축하합니다, 합격입니다!";
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", total);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.print(result);
		}
			
		
		
	}
	
	public void practice3( ) {
		int month;
		int day;
		
		System.out.print("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();
		
		switch (month) {
		case 4, 6, 9, 11:
			day = 30;
			System.out.printf("%d월은 %d일까지 있습니다", month, day);
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			day = 31;
			System.out.printf("%d월은 %d일까지 있습니다", month, day);
			break;
		case 2:
			day = 28;
			System.out.printf("%d월은 %d일까지 있습니다", month, day);
			break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다", month);
		}
	}
	
	public void practice4( ) {
		// double height, weight, bmi = weight / (height * height)
		// bmi 18.5 미만 저체중 / 18.5~22 정상
		// 	   23~24 과체중 / 25~29 비만 / 30 이상 고도 비만
		
		double height, weight, bmi;
		String result;
		
		System.out.print("키(m)를 입력해 주세요 : ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		bmi = weight / (height * height);
		
		if(bmi >= 30) 
			result = "고도 비만";
		else if (bmi >= 25)
			result = "비만";
		else if (bmi >= 23)
			result = "과체중";
		else if (bmi >= 18.5)
			result = "정상체중";
		else
			result = "저체중";
		
		System.out.printf("BIM 지수 : %f\n%s", bmi, result);
	}
	
	public void practice5( ) {
		//중간 0.2, 기말 0.3, 과제 0.3, 출
		double testFirst, testSecond, testProject, check, total;
		String result, r="================= 결과 =================";
		
		System.out.print("중간 고사 점수 : ");
		testFirst = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		testSecond = sc.nextDouble();
		System.out.print("과제 점수 : ");
		testProject = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		check = sc.nextDouble();
		
		testFirst *= 0.2;
		testSecond *= 0.3;
		testProject *= 0.3;
		total = testFirst + testSecond + testProject + check;
		if (14 >= check)
			result = "Fail [출석 횟수 부족 (10/20)]";
		else {
			if(total < 70)
				result = "Fail [점수 미달]";
			else
				result = "Pass";
			System.out.println(r);
			System.out.printf("중간 고사 점수(20) : %.1f\n", testFirst);
			System.out.printf("기말 고사 점수(30) : %.1f\n", testSecond);
			System.out.printf("과제 점수     (30) : %.1f\n", testProject );
			System.out.printf("출석 점수     (20) : %.1f\n", check);
			System.out.printf("총점 : %.1f\n", total);
		}
		
		System.out.print(result);
		
	}
	public void practice6() {
		String product1 = "사과";
		int price1 = 1000;
		String product2 = "참외";
		int price2 = 2000;
		String product3 = "수박";
		int price3 = 3000;
		String product4 = "바나나";
		int price4 = 4000;
		int choice;
		String cartProduct = "";
		int cartPrice = 0;
		
		System.out.println("상품을 골라주세요");
		System.out.printf("1. %s / 2. %s\n3. %s / 4. %s", product1, product2, product3, product4);
		choice = sc.nextInt();
		
		if (choice < 1 || choice > 4) 
			System.out.println("존재하지 않는 상품");
		else
			switch (choice) {
			case 1:
				cartProduct = product1;
				cartPrice = price1;
				break;
			case 2:
				cartProduct = product2;
				cartPrice = price2;
				break;
			case 3:
				cartProduct = product3;
				cartPrice = price3;
				break;
			default:
				cartProduct = product4;
				cartPrice = price4;
			}
			
			System.out.printf("선택한 상품 : %s\n", cartProduct);
			System.out.printf("가격 : %d\n", cartPrice);
			
	}
}
