package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int arr[] = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int j = 0; j < arr.length; j += 2) {
			sum += arr[j];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {

		int arr[] = new int[9];
		int j = 9, sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = j;
			j--;
		}
		for (int k = 1; k < arr.length; k += 2) {
			sum += arr[k];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}

	public void practice3() {
		int input = 0;

		System.out.print("양의 정수 : ");
		input = sc.nextInt();

		int arr[] = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		// System.out.println(Arrays.toString(arr));

	}

	// ?
	public void practice4() {

		int input = 0, index = 6;
		int arr[] = new int[5];

		System.out.print("입력 0 : ");
		arr[0] = sc.nextInt();
		System.out.print("입력 1 : ");
		arr[1] = sc.nextInt();
		System.out.print("입력 2 : ");
		arr[2] = sc.nextInt();
		System.out.print("입력 3 : ");
		arr[3] = sc.nextInt();
		System.out.print("입력 4 : ");
		arr[4] = sc.nextInt();
		System.out.print("검색할 값 : ");
		input = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				index = i;
				break;
			}
		}
		if (index >= 0 && index <= 4)
			System.out.println("인덱스 : " + index);
		else
			System.out.println("일치하는 값이 존재하지 않습니다");
	}

	// !
	public void practice5() {

		int sum = 0;
		String index = "";

		System.out.print("문자열 : ");
		String input = sc.nextLine();
		char inputString[] = new char[input.length()];

		for (int i = 0; i < input.length(); i++)
			inputString[i] = input.charAt(i);

		System.out.print("문자 : ");
		char inputChar = sc.next().charAt(0);

		for (int x = 0; x < inputString.length; x++) {
			if (inputString[x] == inputChar) {
				index += x + " ";
				sum++;
			}
		}
		if (index.equals("") || sum == 0)
			System.out.println("존재하지 않는 문자");
		else
			System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n%c 개수 : %d", input, inputChar, index, inputChar, sum);

	}

	public void practice6() {

		System.out.print("정수 : ");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을값 : ", i);
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
			System.out.print(arr[j] + " ");
		}
		System.out.println("\n총합 : " + sum);
	}

	public void practice7() {

		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		char num[] = new char[input.length()];

		for (int i = 0; i < input.length(); i++)
			num[i] = input.charAt(i);

		for (int x = 8; x < num.length; x++)
			num[x] = '*';

		for (int j = 0; j < num.length; j++)
			System.out.print(num[j]);

	}

	public void practice8() {
		int input = 0, mid = 0, j = 0;
		boolean flag = true;

		do {
			if (!flag)
				System.out.println("다시 입력하세요");
			System.out.print("정수 : ");
			input = sc.nextInt();
			flag = false;

		} while (input < 3 || input % 2 == 0);

		int arr[] = new int[input];
		mid = input / 2;

		for (int i = 0; i < arr.length; i++) {
			if (i <= mid) {
				j++;
				arr[i] = j;
			} else {
				j--;
				arr[i] = j;
			}
		}
		for (int k = 0; k < arr.length; k++)
			System.out.print(arr[k] + ", ");

	}

	public void practice9() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

	public void practice10() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

		/*
		 * int max = arr[0], min = arr[0];
		 * 
		 * for(int k = 0; k < arr.length; k++) { if (max < arr[k]) max = arr[k]; else if
		 * (min > arr[k]) min = arr[k];
		 * 
		 * }
		 */
		int max, min;
		Arrays.sort(arr);

		min = arr[0];
		max = arr[arr.length - 1];

		System.out.printf("\n최대값 : %d\n최소값 : %d", min, max);
	}

	public void practice11() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;

			for (int x = 0; x < i; x++) {
				if (arr[x] == random) {
					i--;
					break;
				}
			}
		}
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");

	}

	public void practice12() {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 40 + 1);
			arr[i] = random;

			for (int x = 0; x < i; x++) {
				if (arr[x] == random) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(arr);

		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");

	}

	public void practice13() {

		int count = 0;

		System.out.print("문자열 : ");
		String input = sc.nextLine();

		char arr[] = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			count++;
		}
		System.out.print("문자열에 있는 문자 : ");
		for (int j = 0; j < arr.length; j++) {
			if (j == arr.length - 1)
				System.out.println(arr[j]);
			else
				System.out.print(arr[j] + ", ");
		}
		System.out.println("문자 개수 : " + count);
	}

	public void practice14() {

		boolean flag = true, flag2 = true;
		int count = 0, inputCount = 0;
		char inputMore = ' ';

		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		String arrStr[] = new String[input];

		sc.nextLine();

		while (flag) {
			for (; count < arrStr.length; count++) {
				System.out.printf("%d번째 문자열 : ", count + 1);
				arrStr[count] = sc.nextLine();
				for(int i = 0; i < count; i++) {
					if(arrStr[i].equals(arrStr[count])) {
						System.out.println("! 중복 !");
						count--;
						break;
					}
				}
			}
			
			do {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				inputMore = sc.next().charAt(0);

				if (inputMore == 'Y' | inputMore == 'y') {
					flag = true;
					flag2 = false;
					System.out.print("더 입력하고 싶은 개수 : ");
					inputCount = sc.nextInt();
					input += inputCount;
					arrStr = Arrays.copyOf(arrStr, input);
					sc.nextLine();
				} else if (inputMore == 'N' | inputMore == 'n') {
					flag = false;
					flag2 = false;
				} else {
					System.out.println("! 잘못 입력하셨습니다 !");
					flag2 = true;
				}
			} while (flag2);
		}
		System.out.println(Arrays.toString(arrStr));

	}
}
