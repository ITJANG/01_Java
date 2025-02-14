package edu.kh.control.loop;

import java.util.Scanner;

// 기능

public class ForExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
			//초기		조건	증감
		for(int i = 1; i <= 10; i++)
			System.out.println(i);
		
	}
	
	public void ex2() {
		for(int i = 'A'; i <= 'Z'; i++) 
			System.out.print((char)i);
		System.out.println();
		System.out.println("=========================");
		for(char i = 'A'; i <= 'Z'; i++)
			System.out.print(i);
		System.out.println();
		System.out.println("=========================");
		for(char i = 'A'; i <= 'Z'; i++) {
			char j;
			j = (char)i;
			System.out.print(i);
		}
			
	}

	public void ex3() {
		
		int num;
		
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; num >= i; i++) {
			System.out.print(i);
		}
		
	}
	
	public void ex4() {
		// 정수 5개를 입력 받아서 합계 구하기
		
		int sum=0;
		
		for (int i=1; i<=5; i++) {
			System.out.print("입력 " + i + ": ");
			int input = sc.nextInt();
			sum += input;
		} 
		
		System.out.printf("합계 : %d", sum);
	}

	public void ex5() {
		// 1부터 20까지 1씩 증가 출력
		// 단, 입력 받은 수의 배수는 양쪽에 ()표시
		
		System.out.print("괄호를 표시할 배수 : ");
		int numSpecial = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			if (i % numSpecial == 0) // 배수 O
				System.out.print("("+i+") ");
			else // 배수 X
				System.out.print(i + " ");
		}
			
	}
	
	public void ex6( ) {
		//[구구단 출력]
		// 2~9 사이 수를 하나 입력 받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2~9사이 숫자가 아니면 
		// "잘못 입력하셨습니다" 출력
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if (dan < 2 || dan > 9)
			System.out.println("잘못 입력하셨습니다");
		else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
		}
			
		
	}
	
	public void ex7() {
		
		// 숫자 세기 count
		// 1부터 20까지 1씩 증가하면서
		// 입력 받은 수의 배수의 총 개수 출력
		// 입력 받은 수의 배수의 합계 출력
		int count = 0, sum = 0;
		String result = "";
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		// 1~20 중 input의 배수만 진입
		// result에 배수인 i를 문자열로 추가
		// sum에 배수인 i를 더하기
		for(int i = 1; i <= 20; i++) {
			if (i % input == 0) {
				result += i + " ";
				count++;
				sum += i;
			}
		}
		 /*
		 //1~20과 input 곱한 값 중 input의 배수만 진입
		 //result에 input과 i의 곱한 값을 문자열로 추가
		 //sum에 input과 i의 곱한 값을 더하기
		 for (int i = 1; i * input <= 20; i++) {
			result += input*i+" ";
			count++; // 갯수 세기
			sum += (input * i); // 누적
		}*/
		
		System.out.printf("%s : %d개\n%d의 배수 합계 : %d", result, count, input, sum);
	}

	public void ex8() {
		
		//구구단 모두 출력

		for(int dan = 2; dan <= 9; dan++) {
			for(int num = 1; num <= 9; num++) {
					System.out.printf("%d x %d = %-2d ", dan, num, dan*num);
			}
			System.out.println();
			
		}
	}

	public void ex9() {
		//구구단 역순 모두 출력

				for(int dan = 9; dan >= 2; dan--) {
					for(int num = 1; num <= 9; num++) {
							System.out.printf("%d x %d = %2d  ", dan, num, dan*num);
					}
					System.out.println();
					
				}
			}
	
	public void ex10() {
		for (int num = 1; num <= 5; num++) {
			for(int dan = 1; dan <= 5; dan++) {
				System.out.printf("%d x %d = %2d  ", dan, num, dan*num);
				for (int num2 = 6; num <= 9; num++) {
					for(int dan2 = 6; dan <= 9; dan++) {
						System.out.printf("%d x %d = %2d  ", dan, num, dan*num);
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}

