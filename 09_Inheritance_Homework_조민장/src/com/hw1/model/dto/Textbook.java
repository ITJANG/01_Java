package com.hw1.model.dto;

public class Textbook extends Book{
	
	private String subject; // 과목
	
	// 생성자
	public Textbook() {
		// TODO Auto-generated constructor stub
	}
	
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	

	// 오버라이드
	@Override
	public void displayInfo() {
		System.out.printf("[전문 서적] 제목 : %s / 저자 : %s / 과목 : %s\n",
				super.getTitle(), super.getAuthor(), subject); 
	}

	
	// getter setter
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
