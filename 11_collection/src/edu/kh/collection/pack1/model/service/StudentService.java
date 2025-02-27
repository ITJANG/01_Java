package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {
	
	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// * 인터페이스 객체 생성 X, 부모 참조변수 O
	
	// java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	
	// new ArrayList() : 기본생성자 -> 기본 크기 10짜리 리스트 생성
	// 하지만 리스트의 크기는 늘었다 줄었다 하기에 큰 의미 없음
	
	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>(); //검색(조회) 효율적
	//private List<Student> studentList = new LinkedList<>(); //추가, 수정, 삭제 효율적
	// 다형성 중 업캐스팅 적용
	// 부모타입(List) 참조변수(studentList) = 자식객체(ArrayList) 주소
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Object> testList = new ArrayList<Object>();
	public void ex() {  // List 테스트용 예제
		
		// List.add(Object e) : 리스트에 객체를 추가
		// 매개변수 타입 Object == 모든 객체 매개변수로 전달 할 수 있음
		
		testList.add("문자열");
		testList.add(new Student("홍길동", 25, "서울시 중구", 'M', 90));
		testList.add(sc);
		testList.add(new Object());
		
		// 컬렉션 특징 : 여ㅑ러 타입 데이터 저장 가능
		
		// Object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환
		// 반환형이 Object == 모든 객체를 반환할 수 있다
		
		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));
		
		// testList에 꺼내온 인덱스 요소가 Student 혹은 상속관계인지 검사
		// 만약 Student라면 이름을 꺼내오고 싶다
		for(Object e : testList) {
			
			if(e instanceof Student) {
				System.out.println(((Student)e).getName());
			}
			
		}
		
	}
	
	/**
	 * Alt + Shif + J : 메서드 설명용 주석
	 * 
	 * @author 조민장(email)
	 */
	
	public StudentService() {
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M', 100));
		studentList.add(new Student("고영희", 23, "경기도 안산시", 'F', 100));
		studentList.add(new Student("강아지", 30, "서울시 강남구", 'M', 80));
		studentList.add(new Student("오미나", 27, "충북 청주시", 'F', 90));
		studentList.add(new Student("박주희", 24, "서울시 서대문구", 'F', 70));
	}
	
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("\n=======학생 관리 프로그램=========");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); // Comparable 사용
			System.out.println("8. 이름순으로 정렬"); // Comparator 사용
			System.out.println("0. 프로그램 종료"); 
			
			System.out.println("메뉴 번호 선택 : ");
			
			
			
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine();
				switch(menuNum) {
				case 1: System.out.println(addStudent()); break;
				case 2: selectAll(); break;
				case 3: System.out.println(updateStudent()); break;
				case 4: System.out.println(removeStudent()); break;
				case 5: //searchName1(); break;
				case 6: //searchName2(); break;
				case 7: //sortByAger(); break;
				case 8: //sortByName(); break;
				case 0: System.out.println("프로그램 종료.."); break;
				default : System.out.println("메뉴에서 고르시오");
				}
			} catch(InputMismatchException e) {
				System.out.print("\nerror : 입력형식이 유효치 않습니다");
				
				sc.nextLine();
				
				menuNum = -1;// ? 첫 반복시 잘못입력하는 경우
				// menuNum
			}
			
			
		}	while(menuNum != 0 );
		


	}
		
		
		/**
		 * 1. 학생 정보 추가 메서드
		 * 
		 * @return 삽입 성공 시 "성공" 실패시 "실패" 문자열 반환
		 */
		public String addStudent(){
			System.out.println("=============학생 정보 추가=============");
			
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("사는 곳 : ");
			String region = sc.next();
			System.out.println("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			System.out.println("점수 : ");
			int score = sc.nextInt();
			
			// Student 새 객체 생성 후 studentList에 추가
			if(studentList.add(new Student(name, age, region, gender, score))) {
				return "성공";
			}else
				return "실패";
		}
		
		/**
		 * 2. 학생 전체 조회 메서드
		 * 
		 * - List가 비어있는 경우 "학생 정보가 없습니다" 출력
		 * - 있는 경우 전체 학생 출력
		 */
		public void selectAll() {
			System.out.println("=======학생 전체 조회=======");
			
			// studentList가 비어있는 지 확인
			// List에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
			
			// if(studentList.size() == 0 ){
			// boolean List.isEmpty() : 컬렉션이 비어있다면 ture 반환
			if(studentList.isEmpty()) {
				System.out.println("학생 정보 없음");
				return;
			}
			
			// 일반 for 문
			for(int i = 0; i < studentList.size(); i++) {
				System.out.println(studentList.get(i));
			}
			
			// 향상 for 문
			int index = 0;
			for(Student std : studentList) {
				System.out.println((index++) + "번 : ");
				System.out.println(std);
			}
		}
		
		/**
		 * 3. 학생 정보 수정 메서드
		 * 
		 * - 학생 정보가 studentList에 하나라도 있는지 검사,
		 *   없다면 "입력된 학생정보가 없습니다" 문자열 반환
		 *   
		 * - 인덱스 번호로 학생을 수정하려고하는데,
		 * 	 입력된 숫자가 0보다 작은지 검사,
		 * 	 작다면 "음수는 입력할 수 없슨디ㅏ" 반환
		 * 
		 * - studentList 범위 내 인덱스 번호인지 검사,
		 * 	 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 반환
		 * 
		 * - 수정할 때
		 *   1. index 번째에 저장된 학생정보
		 *   	수정 전 정보 출력
		 *   
		 * 	 2. 이름, 나이, 주소, 성별, 점수 수정 값 입력 받기
		 * 
		 * 	 3. 수정완료 시 "000의 정보가 변경되었습니다" 반환
		 * @return
		 */
		public String updateStudent() {
			
			System.out.println("=======학생 정보 수정=======");
			
			System.out.println("인덱스 번호 : ");
			int index = sc.nextInt();
			
			// 1) 학생 정보가 studentList에 하나라도 있는지 검사
			if(studentList.isEmpty()) {
				return "입력된 학생정보가 없습니다";
			// 2) 입력 수가 0보다 작은지
			} else if(index < 0) {
				return "음수 입력X";
			// 3) studentList 범위 내 인덱스 번호 인지
			} else if(index >= studentList.size()) {
				return "범위를 넘어선 값X";
			} else {
				// 수정 코드 작성
				// 1. index번째에 저장된 학생정보 출력
				System.out.println(index + "번째 저장된 학생 정보");
				System.out.println(studentList.get(index));
				
				// 2. 수정할 내용 입력 받기
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("사는 곳 : ");
				String region = sc.next();
				System.out.println("성별(M/F) : ");
				char gender = sc.next().charAt(0);
				System.out.println("점수 : ");
				int score = sc.nextInt();
				
				// 입력 받은 index번째에 수정할 학생정보를 세팅 -> 수정
				// index번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp에 저장
				Student temp = studentList.set(index, new Student(name, age, region, gender, score));
				
				return temp.getName() + "의 정보가 변경되었습니다";
			}
		}
			/** 4. 학생 정보 제거 메서드
			 *
			 * 수정과 같은 검사 후
			 * 삭제 시
			 * "정말 삭제하시겠습니까? (Y/N) : "
			 * Y를 입력하면 해당 인덱스에 있는 객체 삭제 후
			 * "000님의 정보가 제거되었습니다" 리턴
			 * N을 입력했다면 "취소" 리턴
			 *
			 * @return
			 */
			public String removeStudent() {
				// Student List.remove(int index);
				// 리스트에서 index번째 요소를 제거
				// 이 때 제거된 요소가 바환됨
				// * List 중간에 비어있는 인덱스가 없게하기 위해서
				// remove() 동작 시 뒤쪽 요소를 한칸씩 자동으로 당겨온다.
				System.out.println("=======학생 정보 제거=======");
				
				System.out.println("인덱스 번호 : ");
				int index = sc.nextInt();
				
				// 1) 학생 정보가 studentList에 하나라도 있는지 검사
				if(studentList.isEmpty())
					return "입력된 학생정보가 없습니다";
				// 2) 입력 수가 0보다 작은지
				if(index < 0) 
					return "음수 입력X";
				// 3) studentList 범위 내 인덱스 번호 인지
				if(index >= studentList.size()) 
					return "범위를 넘어선 값X";
					
				// 4) 삭제
				System.out.print("정말 삭제 하시겠습니까? (Y/N) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				if(ch == 'Y') {
					Student temp = studentList.remove(index);	
					return temp.getName() + "의 정보가 제거되었습니다";
				}

				return "취소";
				
			}

}
