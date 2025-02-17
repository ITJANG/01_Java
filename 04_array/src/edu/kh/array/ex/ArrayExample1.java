package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);
	/*
	 * 배열(Array)
	 * 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것. - 묶여진 변수들은 하나의 배열명으로 불러지고 구분은 index를 이용함
	 * (index는 0부터 시작하는 정수)
	 * 
	 */

	public void ex1() {
		// 변수 vs 배열

		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// num 이라는 이름을 부여.

		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수공간에 10이라는 정수 값 대입

		// 변수 사용
		System.out.println(num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력

		// ----------------------

		// 배열 선언
		int arr[];
		// stack 영역에 int 자료형 공간을 4byte 할당하고
		// arr이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다 **

		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며
		// Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당

		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열

		// new int[3] : heap 영역에 int 형 변수 3칸짜리 int[]을 생성

		// arr = new
		// int[] int[] -> 같은 자료형 == 연산 가능
		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// -> Heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// -> JVM 기본값이 들어가있다
		// boolean : false
		// 나머지 : 0
		// 참조형 : null

		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// 배열 사용

		// [10, 50, 100] 실제로 arr 배열이 가진 모든 요소의 값을 알고 싶을때
		// Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));

	}

	public void ex2() {

		// 배열 선언 및 할당

		int arr[] = new int[4];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		// arr[4] = 5000;
		// java.lang.ArrayIndexOutOfBoundsException : 배열범위 벗어남

		// 코드에서 빨간줄 에러 : 컴파일 에러
		// 실행 했을때 발생하는 에러 : 런타임 에러

		// 배열과 for문
		System.out.println("배열의 길이 : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			// i -> 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
			// 선언과 동시에 초기화
			int arr2[] = { 1, 2, 3, 4, 5 };
			// stack 영역에 int[] 자료형 공간을 4byte 할당하고
			// 그 공간에 arr2라는 이름 부여
			// Heap 메모리 영역에 int 5칸짜리 int[]을 생성하고
			// 0번 인덱스부터 각 요소에 1~5까지 초기화함(대입)
			// int[] 주소값을 arr2 참조변수가 참조함

			System.out.println(Arrays.toString(arr2));
		}

	}

	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 163.7
		// ..
		// 5번 키 입력 : 167.2
		// 평균 : 177.02cm
		
		double avg = 0, sum = 0;
		double height[] = new double[5];
		// double[] 자료형 참조변수 height를 stack 영역에 생성
		// height에 heap 영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입
		
		for(int i = 0; i <= 4; i++) {
			System.out.printf("%d번 키 입력 : ", i+1);
			height[i] = sc.nextDouble();
		}
		for(int i = 0; i < height.length; i++)
			sum += height[i];
		avg = sum / height.length;
			
		System.out.printf("평균 : %.2fcm", avg);
		
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		int people = 0, sum = 0, max = 0, min = 0;
		double avg = 0;
		
		System.out.print("입력 받을 인원 수 : ");
		people = sc.nextInt();
		int test[] = new int[people];
		
		for(int i = 0; i < test.length; i++) {
			System.out.printf("%d번 점수 입력 : ", i+1);
			test[i] = sc.nextInt();
			sum += test[i];
			if(i == 0) {
				max = test[0];
				min = test[0];
			}
				
			if(test[i] < min)
				min = test[i];
			if (test[i] > max)
				max = test[i];
		}
		avg = (double)sum / test.length;
		System.out.println();
		System.out.printf("합계 : %d\n평균 : %.2f\n최고점 : %d\n최저점 : %d\n"
				, sum, avg, max, min);
		
		
	}

	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String arr[] = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면"};
		System.out.println("오늘 점심 메뉴 : " + arr[(int)(Math.random()*6)]);
	}

	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 있는지 출력
		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 존재
		
		// 정수 입력 : 5
		// 존재하지 않음
		
		int arr[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		boolean flag = false; // 검사전에는 없다고 가정
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.printf("%d번째 인덱스에 존재", i);
				flag = true;
			}
		}
		
		if( !flag ) {
			System.out.println("존재하지 않음");
		}
		
	}

	public void ex7() {
		// 입력받은 값과 일치하는 값이 있으면 인덱스번호 출력
		// 없으면 "존재하지 않음" 출력
		
		String arr[] = {"사과", "딸기", "바나나", "키워", "멜론", "아보카도"};
		
		/*
		 * 과일 입력 : 아보카도
		 * 5번 인덱스에 존재
		 * 
		 * 과일 입력 : 수박
		 * 존재하지 않음
		 */
		boolean flag = true;
		System.out.print("과일 입력 : ");
		String input = sc.next();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i + "번 인덱스에 존재");
				flag = false;
			}
			
		}
		if(flag)
			System.out.println("존재하지 않음");
		
	}

	public void ex8() {
		
		// String 참조형

		String str = "가나다"; // String Constant Pool 저장
		String str2 = new String("가나다"); // Heap 새 객체 저장
		
		System.out.println(str); // 주소값?
		System.out.println(str2);
		System.out.println(str.toString());
		
		// String 클래스의 toString() 메서드가 존재
		// toString() 메서드는 자기 자신을 그대로 반환
		
		// System.out.println(str); 을 실행하면
		// str.toString() 이 자동으로 호출됨
		// 대입해둔 문자열 값 자체가 반환됨
		
		// 주소값 (객체의 해시코드)을 확인하고 싶다면 아래처럼 사용
		System.out.println(System.identityHashCode(str));
	}

	public void ex9() {
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		// 3. 단, 일치하는 문자 없을 경우 "존재하지 않습니다" 출력
		
		/*
		 * ex)
		 * 문자열 입력 : hello
		 * [h, e, l, l, o]
		 * 검색할 문자 입력 : l
		 * 2개 있음 / 존재하지 않습니다
		 * 
		 */
		
		// 1) 배열 검색, 
		
		// 2) 문자열의 길이 구하기 : String.length()
		// ex) "hello".length() -> 5
		
		// 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		// ex) "hello".charAt(1) -> 'e'
		
		// 4) count (숫자세기)
		
		int count = 0;
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		char arr[] = new char[input.length()];
		
		for(int i=0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("검색할 문자 : ");
		char ch = sc.next().charAt(0);
		// sc.next() -> String형
		// String.chatAt(0) -> String의 0번째 인덱스 문자 하나를 추출해서 char 형태로 반환
		// "h" -> 'h'
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == (ch)) {
				count++;
			}
		}
		if(count > 0)
			System.out.println(count + "개 있음");
		else
			System.out.println("존재 하지 않습니다.");
	}
	
	
}














