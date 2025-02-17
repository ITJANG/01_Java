package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력
		// 5 출력시 종료

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

			if (i == 5)
				break;

		}
	}

	public void ex2() {
		// 입력받은 모든 문자열 누적
		// "exit@" 입력시 문자열 누적 종료하고 결과 출력
		String input = "", str = "";
		while (true) {
			System.out.print("문자열 입력 : ");
			input = sc.nextLine();

			// 자바에서 문자열(String) 비교는 == 연산자 사용 불가
			// 비교연산자(==)는 보통 기본자료형끼리의 연산에서만 가능
			// String은 참조형
			// 문자열1.equals(문자열2)

			if (input.equals("exit@"))
				break;

			str += input + "\n";

		}
		System.out.println(str);

	}

	public void ex3() {

		// continue : 다음 반복으로 넘어감
		// 1~10 까지 1씩 증가하며 출력
		// 단 3의 배수 제외
		// 1 2 4 5 7 8 10

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0)
				continue;

			System.out.println(i + " ");

		}

	}

	public void ex4() {

		// 1~100 까지 1씩 증가하며 출력
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을때 반복 멈춤

		for (int i = 1; i <= 100; i++) {

			if(i == 40)
				break;
			if(i % 5 == 0)
				continue;
			System.out.println(i + " ");
		}

	}

	public void RSPGame() {
		// 가위바위보 게임
		// 몇 판할지 입력
		// 입력 수 만큼 판 수 반복
		// 컴 : Math.random() : 0.0 ~ 1.0 사이 난수 생성
		// 1~3 사이 난수 생성
		// 1이면 가위, 2이면 바위, 3이면 보
		// 승패 판별
		// 플레이어 승 / 졌습니다 / 비겼습니다
		// 매판마다 - 현재 기록 : 2승 1무 0패
		// switch로 random 값을 문자열로 바꾸기
		String com = null;
		// null : 아무것도 참조하고 있지 않음
		
		int round = 0; //판수
		int win = 0, draw = 0, lose = 0; //승패
		String input = "";
		boolean win1 = input.equals("가위") && com.equals("보");
		boolean win2 = input.equals("바위") && com.equals("가위");
		boolean win3 = input.equals("보") && com.equals("바위");
		
		System.out.println("가위 바위 보 게임");
		System.out.print("판 수 입력 : ");
		round = sc.nextInt();
		
		for(int i = 1; i <= round; i++) { // 입력받은 판 수 만큼 반복
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			input = sc.next();
			
			int random = (int)(Math.random() * 3 + 1);
			// Math.random() : 0.0 ~ 1.0 사이
			// 0.0 <= x < 1.0
			// 0.0 <= x * 3 < 3.0
			// 1.0 <= x * 3 + 1 < 4.0
			// 1 <= (int)(x * 3 + 1) < 4
			// 1 <= x < 4 
			// -> 1 이상 4미만 정수 -> 1 2 3
			
			
			
			switch(random) {
			case 1:
				com = "가위"; break;
			case 2:
				com = "바위"; break;
			case 3:
				com = "보"; break;
			
			}
			System.out.printf("컴퓨터는 %s를 선택했습니다\n",com);
			// 판별
			if(input.equals(com)) {
				System.out.println("비겼습니다");
				draw++; //무승부 기록
			} else {
				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				} else {
					System.out.println("졌습니다");
					lose++;
				}
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
			
				
		}
		
		
	}

	public void RSPGame2() {
		// 가위바위보 게임
		// 몇 판할지 입력
		// 입력 수 만큼 판 수 반복
		// 컴 : Math.random() : 0.0 ~ 1.0 사이 난수 생성
		// 1~3 사이 난수 생성
		// 1이면 가위, 2이면 바위, 3이면 보
		// 승패 판별
		// 플레이어 승 / 졌습니다 / 비겼습니다
		// 매판마다 - 현재 기록 : 2승 1무 0패
		int round = 0, win = 0, draw = 0, lose = 0, random = 0;
		String input = "";
		String com = "";
		
		
		System.out.println("가위바위보 게임");
		System.out.print("판 수 : ");
		round = sc.nextInt();
		
		for(int i = 1; i <= round; i++) {
			System.out.println(i + "번째 게임");
			System.out.print("가위/바위/보 중에 하나 입력 : ");
			input = sc.next();
			
			random = (int)(Math.random() * 3 + 1);//0.0~1.0
			
			switch (random) {
			case 1:
				com = "가위"; break;
			case 2:
				com = "바위"; break;
			case 3:
				com = "보"; break;
			}
			
			if(input.equals(com)) {
				draw++;
			}
			
		}
		
	}
}
