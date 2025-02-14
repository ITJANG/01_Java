package edu.kh.control.practice;

import java.util.Scanner;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		LoopPractice lp = new LoopPractice();

		for (int i = 0; i < 2;) {
			System.out.println("실행할 프로그램을 선택하세요");
			System.out.println("1. 입력 숫자까지의 정수\n2. 입력 숫자까지의 정수 거꾸로\n"
					+ "3. 입력 숫자까지의 정수의 합\n4. 두 숫자 사이의 정수\n"
					+ "5. 입력 숫자의 구구단\n6. 입력 숫자 ~ 9의 구구단\n"
					+ "7. 별찍기 계단\n8. 별찍기 계단 거꾸로\n"
					+ "9. 별찍기 계단 반대로\n10. 별찍기 피라미드(벽)\n"
					+ "11. 별찍기 피라미드\n12. 별찍기 상자\n13. 배수와 공배수\n");
			int p = sc.nextInt();
			switch (p) {
			case 1:
				lp.practice1();
				break;
			case 2:
				lp.practice2();
				break;
			case 3:
				lp.practice3();
				break;
			case 4:
				lp.practice4();
				break;
			case 5:
				lp.practice5();
				break;
			case 6:
				lp.practice6();
				break;
			case 7:
				lp.practice7();
				break;
			case 8:
				lp.practice8();
				break;
			case 9:
				lp.practice9();
				break;
			case 10:
				lp.practice10();
				break;
			case 11:
				lp.practice11();
				break;
			case 12:
				lp.practice12();
				break;
			case 13:
				lp.practice13();
				break;
			default:
				System.out.println("잘못 된 입력");
			}

			System.out.println("\n1. 재시도 / 2. 종료");
			int r = sc.nextInt();

			if (r == 1)
				i = 1;
			else if (r == 2)
				i = 2;
			else {
				i = 3;
				System.out.println("잘못 된 입력 종료");
			}
		}
	}

}
