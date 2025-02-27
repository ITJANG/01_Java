package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	// 예외(Exception) : 소스코드 수정으로 해결 가능한 오류
	
	// 종류
	// 1. Unchecked Exception : 선택적 예외 처리(ex. Runtime)
	// 2. Checked Exception : 필수적 예외 처리(ex.IOException)
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 두 정수를 입력받아 나누기한 몫을 출력
		
		System.out.print("정수 1 : ");
		int input1 = sc.nextInt(); //InputMismatchException
		// int형이 아닌 다른 자료형을 대입 했을때
		
		System.out.print("정수 2 : ");
		int input2 = sc.nextInt();
		
		
		if(input2 !=0) {
			System.out.println("결과 : " + input1/input2);
			// ArithmeticException
			// 0이 들어왔을때 0으로 나눌 수 없음 : 산술 오류가 발생
			
		} else {
			System.out.println("무한");
		}
		
		try {
			// 예외 발생 예상 코드
			System.out.println("결과 : " + input1/input2);
		} catch(ArithmeticException e) {
			// try에서 던져진 예외를 catch문의 매개변수 e로 잡음
			// e를 사용하여 예외 추적 코드 작성 가능
			System.out.println("무한");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용 출력
			// 예외 발생 지점 추적 메서드
		}
		
			// 발생하는 ㅖ외
		
	}
	
	
	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		
		try {
			System.out.print("정수 1 : ");
			int input1 = sc.nextInt(); 
			
			System.out.print("정수 2 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1/input2);
			
			//	Exception
			// 		ㄴ RuntimeException
			// 					ㄴ InputMismatchException, ArithmeticException
			
			String str = null;
			System.out.println(str.charAt(0));
		} catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace();
		} catch (RuntimeException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식객체 참조
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면
			// 		다형성 업캐스팅에 의 모두 잡아서 처리 가능
			e.printStackTrace();
		}
	}

	public void ex3() {
		// finally 마지막에 무조건 수행
		
		try {
			System.out.print("정수 1 : ");
			int input1 = sc.nextInt(); 
			
			System.out.print("정수 2 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1/input2);
			
		} catch (ArithmeticException e) {
			System.out.println("산술적 예외 처리");
			
			// 매개변수 e : 예외 관련된 정보 + 예외 관련 기능
			System.out.println(e.getClass());
			
			System.out.println( e.getMessage());
		}
		finally {
			System.out.println("무조건 수행");
			sc.close();
		}
	}

	public void ex4() {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("던져진거 처리");
			
		}
		
		
	}
	
	public void methodA() throws IOException {
		methodB();
	}
	public void methodB() throws IOException {
		methodC();
	}
	public void methodC() throws IOException {
		// throw : 예외 강제 발생 구문
		throw new FileNotFoundException();
	}
	
	public void ex5() throws UserException {
		// 사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생시키기
		throw new UserException("사용자정의 예외 발생");
		
		
	}
}
