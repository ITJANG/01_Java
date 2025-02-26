package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre; // 장르
	
	//생성자
	public Novel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	// 오버라이드
	@Override
	public void displayInfo() {
		System.out.printf("[소설] 제목 : %s / 저자 : %s / 장르 : %s\n",
				super.getTitle(), super.getAuthor(), genre); 
	}


	
	// getter setter
	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
