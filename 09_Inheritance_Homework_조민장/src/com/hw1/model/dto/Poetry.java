package com.hw1.model.dto;

public class Poetry extends Book{
	
	private int numberOfPoems; // 시수

	// 생성자
	public Poetry() {
		// TODO Auto-generated constructor stub
	}
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}


	// 오버라이드
	@Override
	public void displayInfo() {
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %d\n",
				super.getTitle(), super.getAuthor(), numberOfPoems); 
		
	}

	// getter setter
	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
	
}
