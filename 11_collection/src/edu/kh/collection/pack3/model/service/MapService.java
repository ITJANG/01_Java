package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	// Key : Value -> Entry라고 부름
	
	// - Key 를 모아두면 Set의 특징(중복x)
	// - Value 를 모아두면 List의 특징(중복o)
	
	public void ex1() {
		// HashMap<K, V> : Map의 자식 클래스 중 가장 되표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value) : 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		// key 중복 테스트
		map.put(1, "조민장"); // 중복 x -> value 덮어쓰기 -> 사실상 set
		
		// value 중복 테스트
		map.put(7, "최길동"); // 중복 O
		
		System.out.println(map); // map.toString() 오버라이딩 되어있음
		
		
		
		
	}

	public void ex2() {
		
		// Map 사용 예제
		// VO/DTO (값 저장용 객체)는 특정 데이터 묶음의 재사용이 많을 경우 사용
		// -> 재사용 적으면 코드낭비
		// -> Map 이용해서 1회용으로 쓰면됨
		
		// 1) VO 버전
		Member member = new Member();
		
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(30);
		
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		// 2) Map 버전
		Map<String, Object> map = new HashMap<String, Object>();
		// Object = 어떤 객체든 value에 들어감
		
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 24);
		
		//출력
		// Object(Value) Map.get(String key)
		// : 매개변수로 전달받은 key와 대응되는 value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("----------------------------------");
		
		
		// ** Map에 저장된 데이터 순차 접근
		// Map에서 Key만 모아두면 Set의 특징을 가짐
		// -> 이를 활용해서 Map에서  keySet() 메서드 제공
		// -> Key만 모아서 Stet으로 변환 
		//

		Set<String> set = map.keySet(); // set 변환
		
		System.out.println(set);
		
		// for each
		for(String key : set) {
			System.out.println(map.get(key));
		}
		
		// map에 저장된 데이터가 많거나(반복 필요)
		// 어떤 key가 있는지 불분명할때(for each)
		// 또는 Map에 저장된 모든 데이터에 접근해야 할 때
		// keySet() + 향상된 for문 사용
		
		
		
		
	
	}

	public void ex3() {
		// List에 Map 여러개 추가하기
		
		List<Map<String, Object>> list = new ArrayList<>();
		// List 객체만 생성, Map만 들어오게 제한
		// -> Map아직 생성 안함
		
		
		for(int i=0; i<10; i++) {
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);
			
			list.add(map);
			// HashMap은 순서 보장 X
			// 순서 유지 하고 싶으면 LinkedHashMap 사용
		}
		
		System.out.println(list);
		// 향상 for문 이용하여 key "id"에 대응되는 value값 전부 출력
		
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
	}

}
