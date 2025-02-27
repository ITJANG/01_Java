package com.hw2.model.dto;

public class Prisoner extends Person{
	private String crime;
	
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return String.format("ID : %s, 이름 : %s , 죄명 : %s", 
				super.getId(), super.getName(), crime);
	}
	
	public String getCrime() {
		return crime;
	}
	public void setCrime(String crime) {
		this.crime = crime;
	}
	
	
}
