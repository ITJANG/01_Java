package edu.kh.oarr.model.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	
	//속성
	private Scanner sc = new Scanner(System.in);
	
	// 회원 가입 한 사람의 정보 저장 변수
	// Member 5칸짜리 객체 배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;
	
	public MemberService() {
		// memberArr 배열 0, 1, 2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", "서울", 30);
		memberArr[1] = new Member("user02", "pass02", "계보린", "경기", 25);
		memberArr[2] = new Member("user03", "pass03", "고길동", "강원", 45);
	}
	
	public void ex() {
		System.out.println(Arrays.toString(memberArr));
	}
	
	// 기능
	// 메뉴 출력용 메서드
	public void displayMenu() {

		int menuNum = 0;
		do {
			System.out.println("===회원 정보 관리 프로그램 v2===");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1:
				System.out.println(signUp());
				break;
			case 2:
				System.out.println(login());
				break;
			case 3:
				System.out.println(selectMember());
				break;
			case 4:// 로그인X : -1, 비번X : 0, 비번O : 1
				switch(updateMember()) {
				case 0:
					System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
					break;
				case 1:
					System.out.println("회원 정보가 수정되었습니다");
					break;
				default :
					System.out.println("로그인을 먼저 해주세요");
				}
				break;
			case 5:
				searchRegion();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			default: 
				System.out.println("잘못 입력하셨습니다");
			}
		} while(menuNum != 0);
	}

	public int emptyIndex() {
		
		for(int i = 0; i < memberArr.length; i++){
			if(memberArr[i] ==  null) 
				return i;
				// 현재 메서드 종료하고 호출 위치러 i값 가지고 돌아감
		}

		return -1;
	}
	// for문을 실행했지만 return X 인 경우 해당 위치 코드 수행
	// ->
	
	
	// 회원가입 메서드
	public String signUp() {
		System.out.println("\n=======회원가입=======");
		
		
		// memberArr 배열에 빈자리가 있는지 확인
		// 객체배열 memberARrr 배열에 빈자리 확인
		int index = emptyIndex(); // memberArr배열에서 비어있는 인덱스 반환 받음
								// 없다면 -1 반환
		if(index == -1) {
			return "회원가입 불가(인원 수 초과)";
		}
		else {
			System.out.print("아이디 : ");
			String memberId = sc.next();
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			System.out.print("비밀번호 확인 : ");
			String memberPw2 = sc.next();
			System.out.print("이름 : ");
			String memberName = sc.next();
			System.out.print("나이 : ");
			int memberAge = sc.nextInt();
			System.out.print("주소 : ");
			String region = sc.next();
			
			if(memberPw.equals(memberPw2)) {
				// 새로운 Member 객체 생성해서 할당된 주소를
				// memberArr의 비어있는 인덱스에 대입
				memberArr[index] = new Member(memberId, memberPw, memberName, region, memberAge);
				
				return "회원가입 성공";
			}
			else {
				return "비밀번호가 다릅니다";
			}
		}
			
	}
	
	public String login() {
		System.out.println("\n=======로그인=======");
		
		// 1) 아이디, 비밀번호 입력 받기
		System.out.print("아이디 : ");
		String inputId = sc.next();
		System.out.print("비밀번호 : ");
		String inputPw = sc.next();
		
		// 2) memberArr 배열 내 요소를 순서대로 접근하여
		for(int i = 0; i < memberArr.length; i++) {
			
			// 2-1) 현재 접근한 요소가 null이 아닌지 확인
			//      -> 회원정보의 아이디, 비밀번호와
			//       입력받은 (로그인)아이디, 비밀번호가 같은지 비교
			if(memberArr[i] != null) {
				if(memberArr[i].getMemberId().equals(inputId)
						&&memberArr[i].getMemberPw().equals(inputPw)) {
					// 2-3) 같다면 로그인 회원 정보 객체를 참조할 변수 loginMember에
					//      현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
					loginMember = memberArr[i];
					return loginMember.getMemberName()+"님 환영합니다!";
				} 
			}
		}
		// 3)   로그인 성공/실패 여부에 따라 결과 값 반환
		//      -> 로그인 성공 : 홍길동님 환영합니다!
		//      -> 로그인 실패 : 아이디 또는 비밀번호가 일치하지 않습니다.
		return "아이디 또는 비밀번호가 일치하지 않습니다.";
	}

	public String selectMember() {
		System.out.println("\n=======회원 정보 조회========");
		if(loginMember != null) {
			return "아이디 : " + loginMember.getMemberId() + 
					"\n비밀번호 : " + loginMember.getMemberPw() +
					"\n이름 : " + loginMember.getMemberName() +
					"\n나이 : " + loginMember.getMemberAge() + 
					"\n주소 : " +loginMember.getRegion();
		} else {
			return "로그인을 먼저 해주세요";
		}
	}

	public int updateMember() {
		// 로그인X : -1, 비번X : 0, 비번O : 1
		System.out.println("\n=======회원 정보 수정========");
		if(loginMember != null) {
			System.out.print("수정할 이름 입력 : ");
			String inputName = sc.next();
			System.out.print("수정할 나이 입력 : ");
			int inputAge = sc.nextInt();
			sc.nextLine();
			System.out.print("수정할 지역 입력 : ");
			String inputRegion = sc.next();
			System.out.print("비밀 번호 입력 : ");
			String inputPw = sc.next();
			
			if(loginMember.getMemberPw().equals(inputPw)) {
				loginMember.setUserName(inputName);
				loginMember.setMemberAge(inputAge);
				loginMember.setRegion(inputRegion);
				return 1;
			}
			else
				return 0;
		} else {
			return -1;
		}
	}
	
	public void searchRegion() {
		System.out.println("\n=======회원 검색(지역)=======");
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		boolean flag = true;
		
		// 1) memberArr 배열의 모든 요소 순차 접근
		for(int i = 0; i < memberArr.length; i++) {
			// 2) memberArr[i] 요소가 null인 경우 종료
			if(memberArr[i] == null) 
				break;
				// 3) memberArr[i] 요소가 null이 아니라면
				// memberArr[i] 요소에 저장된 지역이
				// 입력받은 지역과 같을 경우
				// memberArr[i] 요소에 저장된 객체의
				// 회원의 아이디, 이름을 출력
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s\n",
						memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false;
			}
		}
		// 4) 입력한 지역과 일치하는 회원이 없다면
		//    일치하는 검색결과가 없습니다! 출력
		if(flag)
			System.out.println("일치하는 검색결과가 없습니다");
	}
	
}