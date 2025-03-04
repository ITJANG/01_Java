package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class Library {
	
	private List<Book> books = new ArrayList<Book>();
	
	public Library() {}
	Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		
		int input = 0;
		
		books.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		books.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		books.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		
		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input){
			case 1: bookAdd(); break;
			case 2: bookSelect(); break;
			case 3: bookUpdate(); break;
			case 4: bookDelete(); break;
			case 5: markAdd(); break;
			case 6: markDelete(); break;
			case 7: markSelect(); break;
			case 8: randomBook(); break;
			case 0: System.out.println("\n종료합니다\n"); break;
			default : System.out.println("잘못된 입력");
				
			}
			
			
		}while(input != 0);
	}
	
	// 도서 등록
	public void bookAdd() {
		System.out.println("=========도서 등록=========");
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 출판사 : ");
		String publish = sc.nextLine();
		
		books.add(new Book(bNo, title, author, price, publish));
		
		System.out.println("등록 완료");
	}
	
	// 도서 조회
	public void bookSelect(){
		for(Book bookss : books) {
			System.out.println(bookss);
		}
	}
	
	// 도서 수정
	public void bookUpdate() {
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int inputbNo = sc.nextInt();
		int input = 0;
		int indexB = 0;
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getbNo() == inputbNo)
				indexB = i;
				
			else {
				System.out.println("존재하지 않는 도서 번호");
				return;
			}
			
		}
		
		
		do {
			System.out.println("1. 도서명\n2. 도서저자\n3. 도서가격\n4. 도서출판사\n0. 종료");
			System.out.print("어떤 정보를 수정하시겠습니까 ?");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: 
				System.out.println("====도서명 수정====");
				System.out.print("수정할 도서명을 입력하세요 : ");
				String title = sc.nextLine();
				books.get(indexB).setTitle(title);
				break;
			case 2:
				System.out.println("====도서 저자 수정====");
				System.out.print("수정할 저자명을 입력하세요 : ");
				String author = sc.nextLine();
				books.get(indexB).setAuthor(author);
				break;
			case 3:
				System.out.println("====도서 가격 수정====");
				System.out.print("수정할 가격을 입력하세요 : ");
				int price = sc.nextInt();
				sc.nextLine();
				books.get(indexB).setPrice(price);
				break;
			case 4:
				System.out.println("====도서 출판사 수정====");
				System.out.print("수정할 출판사명을 입력하세요 : ");
				String publish = sc.nextLine();
				books.get(indexB).setPublish(publish);
				break;
			case 0:
				System.out.println("수정을 종료합니다");
				break;
			default :
				System.out.println("잘못 된 입력");
			}
			
		} while(input != 0);
		System.out.println("수정 완료");
	}
	
	// 도서 삭제
	public void bookDelete() {
		
	}
	
	// 즐겨찾기 추가
	public void markAdd() {
		
	}
	
	// 즐겨찾기 삭제
	public void markDelete() {
		
	}
	
	// 즐겨찾기 조회
	public void markSelect() {
		
	}
	
	// 추천도서 뽑기
	public void randomBook() {
		
	}
}
