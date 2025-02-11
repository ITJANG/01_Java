package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		/*
		 * 기본 자료형 8가지
		 * 논리형 : boolean (1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte)
		 * 참조형 : String
		 */
		 
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것
		// 변수 값 대입 : 변수에 값을 집어 넣는 것
		
		boolean booleanData; //선언
		// 메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
		// 할당된 공간의 이름을 booleanData 라고 정하겠다
		booleanData = true; // booleanData 변수에 true 논리값 대입
		
		System.out.println("booleanData : " + booleanData);
		
		byte byteNumber = 127; //128 대입 시 에러 (값의 범위 -128~127)
		// 메모리에 정수값을 저장 할 수 있는 1byte를 할당하고
		// 할당된 공간을 byteNumber라고 정하고 
		// 초기값으로 127의 정수를 대입
		
		short shortNumber = 32767;
		// 정수 자료형 기본형 int (short, byte는 옛날 코드 잔재)
		int intNumber = 2147483647;
		
		long longNumber = 10000000000l;
		// 100억 이라는 값은 int로 인식하고 int의 범위에 벗어남
		// long의 리터널 표기법은 100억 뒤에 L을 붙여줘야 함
		
		float floatNumber = 1.2345f;
		// 1.2345는 double로 인식하기 때문에 뒤에 f를 붙여줘야함
		
		double doubleNumber = 3.141592;
		// double이 실수형 중에서 기본형
		// 리터널 표기법이 없으면 자동으로 실수는 double로 인식
		
		// 문자형(char) 리터럴 표기법 : ''(홑따옴표)
		// -> 문자 하나
		char ch = 'A';
		char ch2 = 66;
		System.out.println("ch = " + ch + " ch2 = " + (int)ch2);
		System.out.println(ch + "" + ch2);
		System.out.println(ch2 + "" + ch);
		System.out.println(ch + ch2);
		System.out.println(ch + "" + (int)ch2);
		System.out.println(ch + (int)ch2);
		
		/*
		 * char 자료형에 숫자가 대입되는 이유
		 * - 컴퓨터에는 문자표가 존재
		 *   숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 *   'B' 문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 *   -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는것도
		 *   가능함
		 */
		
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 X
		int abcdefG123456; //G다름
		int abcdefg123456;
		
		// 2. 예약어 사용 X
		//double final;
		
		// 3. 숫자 시작 X
		//char 1abc;
		
		// 4. 특수문자 $, _만 사용 가능 (하지만 안씀)
		int $intNumber; // 문제X
		int int_Number; // 자바는 카멜표기법 사용 하기에 필요X
		                // _ 작성 표기법은 DB, 자바 상수에서 사용
		                //   ㄴ 대소문자 구분을 안하기 때문
		
		// 5. 카멜표기법(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않는다 (하지만 안씀)
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		final double PI_VALUE = 3.14;
		//PI_VALUE = 2.33; 재대입 불가
		
		/*
		 * 상수 (항상 같은 수)
		 * - 변수 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입 할 수 없음
		 * - 자료형 앞에 final 키워드 작성
		 * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성시 _사용
		 * 
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 
		 */
		
		final int MIN_AGE = 1;
		final int MAX_AGE = 130;
		final int lEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
	}
}
