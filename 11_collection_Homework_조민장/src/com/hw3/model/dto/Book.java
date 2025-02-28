package com.hw3.model.dto;

public class Book {
	private int bNo;
	private String title;
	private String author;
	private int price;
	private String publish;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bNo, String title, String author, int price, String publish) {
		super();
		this.bNo = bNo;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publish = publish;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d번 도서 | [도서제목 : %s / 도서저자 : %s / 도서가격 : %d원 / 출판사 : %s]", 
				bNo, title, author, price, publish);
	}
	
	public void select() {
		
	}
	
	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}
	
	
}
