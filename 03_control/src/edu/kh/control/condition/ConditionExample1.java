package edu.kh.control.condition;

import java.util.Scanner;

// 기능

public class ConditionExample1 {
	
	Scanner sc = new Scanner(System.in); //필드
	
	//생성자
	
	//메서드
	public void ex1() {
		
		// if 문
		// 조건식이 true 일때만 내부 코드 수행
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if(input > 0) {
			System.out.println("양수입니다");
			
		}
		if(input < 0) {
			System.out.println("음수입니다");
		}
		
	}
	
	public void ex2() {
		// if - else 문
		// 조건식 결과가 true면 if문
		// false면 else 구문이 수행
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 != 0) {
			System.out.println("홀수입니다");
			
		}
		else {
			if(input == 0)
				System.out.println("0 입니다");
			else
				System.out.println("짝수입니다");
		}
		
	}
		
	public void ex3() {
		// if(조건식) - else if(조건식) -else
		// 양수, 음수, 0 판별
		
		System.out.print(" 정수 입력 : ");
		int input = sc.nextInt();
		if (input > 0) {
			System.out.println("양수입니다");
		}
		else if (input == 0) {
			System.out.println("양수입니다");
		}
		else
			System.out.println("0입니다");
			
	}
	
	public void ex4() {
		
		// 달(month) 을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15도 이하 : "한파 경보" / -12도 이하 : "한파 주의보
		// 3~5 범
		// 6~8 여름 (35도 이상 : "폭염 경보" / 33도 이상 "폭염 주의보")
		// 9~11 가을
		// 1~12 사이가 아니면 "해당 계절이 없다" 출력	
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과 저장 변수
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			
			if (temperature <= -15) {
				// 겨울 한파 경보
				season += " 한파 경보";
			} 
			else if (temperature <= -12) {
				season += " 한파 주의보";
			}
			
		}
		else if (month >= 3 && month <= 5) {
			season = "봄";
		}
		else if (month >= 6 && month <= 8) {
			season = "여름";
			
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			
			if (temperature >= 35) {
				// 겨울 한파 경보
				season += " 폭염 경보";
			} 
			else if (temperature >= 33) {
				season += " 폭염 주의보";
			}
		}
		else if (month >= 9 && month <= 11) {
			season = "가을";
		}
		else 
			System.out.println("해당 계절이 없다");
		
	}

	public void ex5() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다"
		// 13세 초과 19세 이하면 "청소년 입니다"
		// 19세 초과 시 "성인 입니다"
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다");
		}
		else if (age > 19){
			System.out.println("성인 입니다");
			
		}
		else {
			System.out.println("청소년 입니다");
		}
	}
	
	public void ex6() {
		// 점수(100점 만점)을 입력받아
		// 90~100 : A
		// 80~90 : B
		// 70~80 : C
		// 60~70 : D
		// 0~60 : F
		// 그외 : "잘못 입력하셨습니다"
		
		System.out.print("점수 입력 : ");
		int i = sc.nextInt();
		String str = "";
		
		if (i > 100) {
			str = "잘못 입력";
		}
		else if (i >= 90) {
			str = "A";
		}
		else if (i >= 80) {
			str = "B";
		}
		else if (i >= 70) {
			str = "C";
		}
		else if (i >= 60) {
			str = "D";
		}
		else if (i > 0) {
			str = "F";
		}
		else if (i < 0)
			str = "잘못 입력";
	
		System.out.println(str);
	}
	
	public void ex6a() {
		System.out.print("점수 입력 : ");
		int i = sc.nextInt();
		String str = "";
		
		if (i>100 || i<0){
			str = "잘못 입력";
		}
		else if (i >= 0){
			str="F";
			if (i >= 60) {
				str="D";
				if (i >= 70) {
					str="C";
					if (i >= 80) {
						str="B";
						if(i >= 90) {
							str="A";
						}
					}
				}
			}
		}
		System.out.println(str);
	}

	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0 이상일 경우에만 "탑승가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다"
		// 키가 140.0 미만 : "적정 키가 아닙니다"
		// 나이가 0세 미만, 100세 초과 시 : "잘못 입력하셨습니다"
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		String result = "";
		if(age < 0 || age > 100)
			result = "잘못 입력하셨습니다";
		else {
			System.out.print("키 입력 : ");
			double k = sc.nextDouble();
			if(k < 0) 
				result = "잘못 입력하셨습니다";
			else {
				if (age < 12 && k < 140.0) {
					result = "적정 연령과 키가 아닙니다";
				}
				else if(age < 12)
					result = "적정 연령이 아닙니다";
				else if(k < 140.0)
					result = "적정 키가 아닙니다";
				else
					result = "탑승가능";
			}
		}
		System.out.println(result);
		
	}

	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"
		int age = 0;
		double height = 0;
		boolean hresult = false;
		boolean aresult = false;
		String result;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age < 0 || age > 100)
			result = "나이를 잘못 입력하셨습니다";
		
		else {     // 나이 문제 없음
			
			System.out.print("키 입력 : ");
			height = sc.nextDouble();
			
			if(height < 0 || height > 250.0) 
				result = "키를 잘못 입력하셨습니다";
			
			else { // 키 문제 없음
				
				if (height < 140.0) 
					hresult = false;
				else
					hresult = true;
				if(age < 12)
					aresult = false;
				else
					aresult = true;
				
				if ((hresult == true) && (aresult == true))
					result = "탑승 가능";
				else if ((hresult == true) && (aresult == false))
					result = "키는 적절하나, 나이는 적절치 않음";
				else if ((hresult == false) && (aresult == true))
					result = "나이는 적절하나, 키가 적절치 않음";
				else 
					result = "나이와 키 모두 적절치 않음";
			}
		} // 조건문 종료
		
		System.out.println(result);
	}

	public void ex9() {
		
		// switch 문
		// 여러 case 중 하나를 선택하여 수행하는 조건문
		
		// 요일 번호 입력 (1 ~ 7) : 3
		// -> 수요일
		int day = 0;
		String week;
		
		System.out.print("요일 번호 입력 : ");
		day = sc.nextInt();
		
		switch(day) {
		case 1:
			week = "월요일"; break;
		case 2:
			week = "화요일"; break;
		case 3:
			week = "수요일"; break;
		case 4:
			week = "목요일"; break;
		case 5:
			week = "금요일"; break;
		case 6:
			week = "토요일"; break;
		case 7:
			week = "일요일"; break;
		default:
			week = "잘못된 입력";
		}
		
		System.out.println(week);
		
	}
	
	public void ex10() {
		
		// 점수 입력 (0~100) : 85
		// 학점 B
		
		System.out.print("점수입력(0~100) : ");
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10:
		case 9: System.out.println("학점 : A"); break;
		case 8: System.out.println("학점 : B"); break;
		case 7: System.out.println("학점 : C"); break;
		case 6: System.out.println("학점 : D"); break;
		default: System.out.println("학점 : F");
		
		}
		
	}
	

}
