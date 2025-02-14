package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() { // 입력 숫자까지의 정수

		int num = 0;

		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num >= 1) {
			for (int i = 1; i <= num; i++)
				System.out.printf("%d ", i);
		}
		else
			System.out.println("1이상의 숫자를 입력하세요");
		

	}

	public void practice2() { //입력 숫자까지의 정수 거꾸로

		int num = 0;

		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		if(num >= 1) {
			for (int i = num; i > 0; i--)
			System.out.printf("%d ", i);
		}
		else
			System.out.println("1이상의 숫자를 입력하세요");
		

	}

	public void practice3() { // 입력 숫자까지의 정수의 합
		int num = 0, sum = 0;
		String numStr = "";

		System.out.print("정수를 하나 입력하세요 : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num == i)
				numStr += i + " = ";
			else
				numStr += i + " + ";
			sum += i;
		}

		System.out.print(numStr + sum);
	}

	public void practice4() { // 두 숫자 사이의 정수

		int firstNum = 0, secondNum = 0, start = 0, end = 0;
		String numStr = "";

		System.out.print("첫 번째 숫자 : ");
		firstNum = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		secondNum = sc.nextInt();

		if (firstNum >= 1 && secondNum >= 1) {
			if (firstNum < secondNum) {
				start = firstNum;
				end = secondNum;
			} else {
				start = secondNum;
				end = firstNum;
			}
			for (int i = start; i <= end; i++) {
				numStr += i + " ";
			}
			System.out.print(numStr);
		} else
			System.out.println("1 이상의 숫자를 입력해주세요");

	}

	public void practice5() { // 입력 숫자의 구구단
		int dan;

		System.out.print("숫자 : ");
		dan = sc.nextInt();
		System.out.printf("==== %d단 ====\n", dan);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, i * dan);
		}

	}

	public void practice6() { // 입력 숫자 ~ 9의 구구단
		int dan, input;

		System.out.print("숫자 : ");
		input = sc.nextInt();

		if (input > 1 && input < 9) {
			for (dan = input; dan <= 9; dan++) {
				System.out.printf("==== %d단 ====\n", dan);
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d\n", dan, i, dan * i);
				}
			}
		} else
			System.out.println("2~9 사이 숫자만 입력해주세요");

	}

	public void practice7() { // 별찍기 계단
		int input;
		String star = "*";

		System.out.print("정수 입력 : ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

	public void practice8() { // 별찍기 계단 거꾸로
		int input;
		String star = "*";

		System.out.print("정수 입력 : ");
		input = sc.nextInt();

		for (int i = input; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

	public void practice9() { // 별찍기 계단 반대로
		int input;
		String star = "*";

		System.out.print("정수 입력 : ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					for (int k = 1; k <= input - i; k++)
						System.out.print(" ");
				}
				System.out.print(star);
			}
			System.out.println();
		}
	}

	public void practice10() { // 별찍기 피라미드(벽)
		int input;
		String star = "*";

		System.out.print("정수 입력 : ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		for (int i = input - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

	public void practice11() { // 별찍기 피라미드
		int input;
		String star = "*";

		System.out.print("정수 입력 : ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					for (int k = 1; k <= input - i; k++)
						System.out.print(" ");
				}
				System.out.print(star);
			}
			if (i > 1) {
				for (int l = 1; l <= i - 1; l++)
					System.out.print(star);
			}
			System.out.println();
		}
	}

	public void practice12() { // 별찍기 상자
		int input;
		String star = "*";

		System.out.print("정수 입력 : ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (i == 1 || i == input) {
				for (int j = 1; j <= input; j++) {
					System.out.print(star);
				}
			} else {
				for (int k = 1; k <= 2; k++) {
					if (k == 2) {
						for (int l = 1; l <= input - 2; l++) {
							System.out.print(" ");
						}
					}
					System.out.print(star);
				}
			}
			System.out.println();
		}
	}

	public void practice13() { // 배수와 공배수
		int input = 0, xCount = 0;
		String x = "";

		System.out.print("자연수 하나를 입력하세요 : ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				x += i + " ";
			if (i % 2 == 0 && i % 3 == 0)
				xCount++;
		}
		System.out.println(x);
		System.out.printf("count : %d", xCount);

	}
}
