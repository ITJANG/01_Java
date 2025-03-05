package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {
	private Set<Toy> toy = new LinkedHashSet<>(); 
	private Map<Integer, String> materials = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	// 메인 페이지
	String display = "<<플레이타임 공장>>\n1. 전체 장난감 조회\n2. 새로운 장난감 만들기\n3. 장난감 삭제하기\n4. 장난감 제조일 순으로 조회하기\n5. 연령별 사용 가능한 장난감 리스트 조회하기\n6. 재료 추가\n7. 재려 제거\n0. 종료\n선택 : ";
	
	public void toyDisplay() {
		
		boolean flag = true; // 메인페이지 반복문 탈출용
		Set<String> set = new LinkedHashSet<String>();
		
		materials.put(1, "면직물");
		materials.put(2, "플라스틱");
		materials.put(3, "유리");
		materials.put(4, "고무");
		
		set.add("면직물");
		set.add("플라스틱");
		toy.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", set));
		toy.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", set));
		set.clear();
		set.add("고무");
		set.add("면직물");
		set.add("플라스틱");
		toy.add(new Toy("파피", 12, 57000, "빨간색", "19931225", set));
		set.remove("고무");
		toy.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", set));
		set.clear();
		set.add("고무");
		set.add("면직물");
		toy.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", set));
		
		while(flag) {
			System.out.print(display); // 메인페이지 출력
			int input = sc.nextInt(); 
			sc.nextLine(); // 개행문자 제거
			
			switch(input) {
				case 1:
					selectToy();
					break;
				case 2:
					addToy();
					break;
				case 3:
					removeToy();
					break;
				case 4:
					selectDate();
					break;
				case 5:
					selectUseAge();
					break;
				case 6:
					addMaterials();
					break;
				case 7:
					removeMaterials();
					break;
				case 8:
					System.out.println("프로그램을 종료합니다");
					flag = false;
					break;
				default :
					System.out.println("잘못된 입력");
			}
		}
	}
	
	public void selectToy() {
		List<Toy> toylist = new ArrayList<>(toy);
		for(int i = 0; i < toy.size(); i++) {
			System.out.println((i+1) + ". " + toylist.get(i));
		}
	}
	
	public void addToy() {
		String input = "";
		Set<String> mater = new LinkedHashSet<>();
		
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String toyName = sc.nextLine();
		
		System.out.print("사용 가능 연령 : ");
		int useAge = sc.nextInt();
		
		System.out.print("가격 : ");
		int toyPrice = sc.nextInt();
		sc.nextLine(); // 개행문자 제거
		
		System.out.print("색상 : ");
		String toyColor = sc.nextLine();
		
		System.out.print("제조일(YYYYMMDD) : ");
		String toyDate = sc.nextLine();
		
		while(!input.equals("q")) {
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
			input = sc.nextLine();
			if(materials.containsValue(input)) {
				mater.add(input);
			} else if(!input.equals("q"))
				System.out.println("존재하지 않는 재료입니다");
		}
		toy.add(new Toy(toyName, useAge, toyPrice, toyColor, toyDate , mater));
		System.out.println("새로운 장난감이 추가되었습니다");
	}
	
	public void removeToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String input = sc.nextLine();
		boolean flagRemove = true;
		Iterator<Toy> iterator = toy.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getToyName().equals(input)) {
				iterator.remove();
				System.out.println("장난감이 삭제되었습니다");
				flagRemove = false;
			}
		}
		if(flagRemove)
			System.out.println("존재하지 않는 장난감입니다");
	}
	
	public void selectDate() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		List<Toy> sort = new ArrayList<>(toy); // 정렬을 위해 Set->List
		sort.sort(new DateComparator() {}); // 정렬
		for(int i = 0; i < sort.size(); i++) {
			System.out.println((i+1) + ". " + sort.get(i));
		}
	}
	
	public void selectUseAge() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		int age = 0; // [연령 : age세]
		int count = 1; // 1. 2.
		List<Toy> sort = new ArrayList<>(toy); // 정렬을 위해 Set->List
		sort.sort(new AgeComparator() {}); // 정렬
		for(int i = 0; i < sort.size(); i++) { 
			if(age < sort.get(i).getUseAge()) { // 새로운 연령일 경우 [] 출력
				age = sort.get(i).getUseAge();
				count=1;
				System.out.println("[연령 : " + age + "세]");
			}
			System.out.print(count + ". " + sort.get(i));
			count++;
		}
	}
	
	public void addMaterials() {
		System.out.println("<재료 추가>");
		System.out.println("===현재 등록된 재료===");
		for(int i = 1; i <= materials.size(); i++) {
			System.out.println(i + " : " + materials.get(i));
		}
		
		System.out.println("===============");
		System.out.print("재료 고유번호(Key) 입력 : ");
		int key = sc.nextInt();
		sc.nextLine(); //개행문자 제거
		
		System.out.print("재료명 입력 : ");
		String name = sc.nextLine();
		
		if(!materials.containsKey(key)) {
			materials.put(key, name);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다");
		}else {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다");
			System.out.print("덮어쓰시겠습니까? (Y/N) : ");
			char input = sc.next().charAt(0);
			input = Character.toUpperCase(input);
			if(input == 'Y') {
				materials.put(key, name);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다");
			}else
				System.out.println("취소되었습니다");
		}
	}
	
	public void removeMaterials() {
		System.out.println("<재료 삭제>");
		System.out.println("===현재 등록된 재료===");
		for(int i = 1; i <= materials.size(); i++) {
			System.out.println(i + " : " + materials.get(i));
		}
		System.out.println("===============");
		System.out.print("삭제할 재료명 입력 : ");
		String input = sc.nextLine();
		
		if(materials.containsValue(input)) {
			for(Map.Entry<Integer, String> re : materials.entrySet()) {				
				if(re.getValue().equals(input)) {
					materials.remove(re.getKey());
					System.out.println("재료 " + re.getValue() + "가 성공적으로 삭제되었습니다");
				}
			}
		} else {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
	}
}


// 정렬
abstract class DateComparator implements Comparator<Toy>{ // 제조일 순 정렬
	@Override
	public int compare(Toy o1, Toy o2) {
		return o1.getToyDate().compareTo(o2.getToyDate());
	}
}

abstract class AgeComparator implements Comparator<Toy>{ // 사용가능 연령 순 정렬
	@Override
	public int compare(Toy o1, Toy o2) {
		return o1.getUseAge() - o2.getUseAge();
	}
}
