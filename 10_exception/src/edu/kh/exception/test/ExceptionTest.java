package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {

		// 컴파일 에러 => 개발자가 코드 잘못 쓴 경우
		// 자료형이 맞지 않아 연산 불가하여 컴파일 에러가 발생(코드 틀림)
		// int a = 99.9;
		int a = (int)99.9;
		
		//런타임에러 => 프로그램 수행 중 발생하는 에러
		//				주로 if문으로 처리 가능
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] = 40;
		// java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		if ( 3 >= arr.length) {
			System.out.println("범위 초과");
		} else {
			arr[3] = 40;
			System.out.println("범위 안정");
		}
		
	}

}
