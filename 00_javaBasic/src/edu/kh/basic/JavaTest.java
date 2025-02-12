package edu.kh.basic;

// git 테스트
// git 테스트 2

//한줄
/*
 
	ctrl + n : 새 파일
	ctrl + space : 자동 완성
	ㄴ syso : print
	ctrl + f11 : 실행
	ctrl + alt + ↑ or ↓ : 방향키 방향으로 해당 줄 복사

*/

// class : 자바 코드가 작성되는 영역
public class JavaTest {
	
	/* main 작성하고 ctrl+space -> 자동완성 가능
	   main 메서드 : 자바 애플리케이션(프로그램)을 실행하기 위해서
	                 반드시 필요한 구문 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("저녁 뭐먹을까");
		System.out.println("12345");
		System.out.println("syso + ctrl + space");
		
		// 숫자 연산
		System.out.println("1 + 2");
		System.out.println(1 + 2);
		// ""안에 작성된 코드는 문자열, 밖은 숫자와 변수로 인식
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(327 / 3);
		System.out.println(12 % 2);
		
		System.out.println("14 x 19 = " + 266);
		System.out.println("14 x 19 = " + 14 * 19);
		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65));
		// 자바는 사칙 연산의 우선 순위를 그대로 따른다
		// -> 우선 계산을 원하면 () 괄호 사용
		// -> 문자열 + 숫자 or
		//    문자열 + 문자열 --> 이어쓰기
		
	}
	
	
}
