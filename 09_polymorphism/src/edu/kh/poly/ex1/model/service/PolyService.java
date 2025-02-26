package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {
	
	// 다형성 확인예제
	public void ex1() {
		
		// Car 객체 생성
		Car car = new Car();
		// 부모타입 참조변수 = 부모객체 주소
		
		// Teslaf 객체 생성
		Tesla tesla = new Tesla();
		// 자식타입 참조변수 = 자식타입 참조변수
		
		// ********** 다형성 *********
		
		// 부모타입 참조변수 = 자식객체
		Car car2 = new Tesla();
		// Tesla 객체를 참조하면 변수의 타입이 Car(부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화함
		// -> 업캐스팅
		
		Car car3 = new Spark();
		// Spark 객체를 참조하는 변수의 타입이 Car
		// Spark 객체가 Car 대체로 변화함
		// -> 업캐스팅
		
		// 1) 자식 객체가 부모객체로 변했기 때문에
		//	  자식만의 고유한 필드, 메서드를 사용ㅎ할 수 없다
		
		
		// 1-1) car (부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발류");
		car.setWheel(4);
		
		// 1-2) tesla (자식 =자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		// Tesla 부모, 본인 메서드 모두 사용 가능
		
		// 1-3) car2 (부모 = 자식(Tesla))
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		// car2, car3는 부모타입 참조변수(Car)이기 때문에
		// Tesla, Spark와 같은 자식 객체의 고유 필드, 메서드 사용 불가
		
		// ------------------------------------------------------
		
		// 2) 다형성을 이용한 객체배열
		
		Car[] arr = new Car[3]; // 부모타입 참조변수 배열 선언 및 할당
		// 각 요소 Car 타입 참조변수
		
		arr[0] = car; // Car 주소
		arr[1] = car2; // Tesla 주소
		arr[2] = car3; // Spark 주소
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 엔진 : " + arr[i].getEngine());	
		}
		// 상속 + 다형성
		// 상속 특징 : Car 상속 클래스는 모두 getEngine()을 가지고 있다.
		// 다형성(업캐스팅) : 부모타입 참조변수 arr[i]로 자식 객체를 참조 할 수 있음
	}
	
	public void printCar(Car temp) {
		// Car temp = c(Car)
		// Car temp = t(Tesla)
		// Car temp = s(Spark)
		// 부모타입 참조변수 = 자식타입객체
		// -> 다형성의 업스캐팅 모양과 똑같음
		// -> temp라는 Car타입 매개변수에는 Car, Tesla, Spark의 주소가 참조되어도 된다
		System.out.printf("엔진 : %s / 연료 : %s / 바퀴갯수 : %d개\n", 
				temp.getEngine(), temp.getFuel(), temp.getWheel());
	}
	
	// 매개변수로 전달받은 정수값에 따라 Car, Tesla, Spark 객체를 만들어
	// 반환하는 메서드
	public Car createCar(int num) {
		
		Car result = null;
		
		switch(num) {
		case 1:
			result = new Car();
			break;
		case 2:
			result = new Tesla();
			break;
		case 3:
			result = new Spark();
			break;
		}
		
		return result;
		
	}
	
	// 다형성(업캐스팅)을 이용한 매개변수 사용법
	public void ex2() {
		
		Tesla t = new Tesla("전기모터", "전기", 4, 100000);
		
		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);
		
		Car c = new Car("경유엔진", "경유", 12);
		
		printCar(t);
		printCar(s);
		printCar(c);

		System.out.println("-------------------------------------------");
		
		// 다형성을 이용한 반환형 사용법
		
		// Car[] arr = { new Car(), new Tesla(), new Spark() }
		
		Car[] arr = {createCar(1), createCar(2), createCar(3)};
						// Car       Car(Tesla)		Car(Spark)
		
		// 객체가 어떤 타입(자료형)인지 검사
		// instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		// -> 참조하는 객체가 특정 자료형이거나 상속관계인지 확인
		System.out.println(arr[1] instanceof Tesla);
		System.out.println(arr[1] instanceof Car);
		
	}
	
	// 다형성 중 다운캐스팅 확인 예제
	public void ex3() {
		
		// 다운 캐스팅
		// 업캐스팅 된 객체에만 사용 가능
		// 부모타입을 자식타입으로 "강제 형변환" 해서
		// 자식객체의 본래 필드, 메서드를 사용할 수 있게 한다
		
		Car c1 = new Tesla("전기모터", "전기", 4, 50000);
		
		System.out.println(((Tesla)c1).getBatteryCapacity());
		
		Tesla t1 = (Tesla)c1;
		
		System.out.println(t1.getBatteryCapacity());
	}
	
	// 다운캐스팅 주의사항!!
	public void ex4() {
		
		Car c1 = new Tesla();
		
		// 다운캐스팅 잘못해도 컴파일 에러 발생X
		// 실행시 발생(런타임 에러)
		// ClassCastException : 형변환 예외
		
		// 해결법 : instanceof와 같이 사용
		
		// 예외처리
		if (c1 instanceof Spark) {
			
			Spark s1 = (Spark)c1;
			System.out.println("성공");
			
		} else {
			
			System.out.println("실패");
			
			
		}
		
	}
	
	
	// 바인딩 확인 예제
	public void ex5() {
		// 바인딩
		// 실제 실행할 메서드 코드와 호출하는 코드를 연결시키는 것
		
		Car c1 = new Car("경유엔진", "경유" , 8);
		
		System.out.println(c1.toString());
		// Car 객체에 있는 toString 메서드 호출
		// 프로그램 실행전
		// 컴파일러는 toString() 메서드가 Car에 있는걸로 인식해서
		// c1.toString 호출 체크와 toString() apthem zhem dusruf
		// -> 정적 바인딩
		
		
		// ** 다형성 적용 시 바인딩 **
		Car c2 = new Spark ("경차엔진", "휘발유", 4, 0.5);
		// 업캐스팅 적용 -> 부모 부분만 참조 가능 상태
		
		System.out.println(c2.toString());
		// 참조변수 c2가 Car 타입이므로
		// toString() 호출코드와 Car의 toString() 메소드 코드를 연결
		// -> 정적 바인딩
		
		// 자식(Spark)의 toString 이 호출됨
		// -> 컴파일 시에는 부모(Car)와 바인딩 == 정적 바인딩
		// ->실행 시에는 정적바인딩보다 자식(Spark)에서 오버라이딩된
		// toString 메서드가 우선시되어 Spark 메서드와 바인딩 == 동적 방인딩
		
		
		
	}
	
	
	
	
	
}



