package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String region;
	private char gender;
	private int score;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String region, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("이름 : %s / 나이 : %d / 주소 : %s / 성별 : %c / 점수 : %d", 
				name, age, region, gender, score);
	}
	
	@Override
	public int compareTo(Student other) {
		// compareTo() : 두 객체를 비교하고 순서를 결정
		// 반환값 : 0(같음), 양수(왼쪽이 더 큼), 음수(왼쪽이 더 작음)
		
		// 현재객체 나이 - 다른객체 나이
		// -> 양수 : 현재객체가 더 큼
		// -> 음수 : 현재객체가 더 작음
		return this.age - other.age; // 나이 기준 오름차순 정렬 (작 -> 큰)
		// 위치 바꾸면 큰 -> 작
	}
	
	
}
