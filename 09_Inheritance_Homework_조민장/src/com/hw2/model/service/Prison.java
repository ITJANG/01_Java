package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners;
	private int prisonerCount = 0;
	
	public Prison(int size) {
		Prisoner[] prisoners = new Prisoner[size];
	}

	
	@Override
	public void addPerson(Person person) {
		for(int i = 0; i < prisoners.length; i++) {
			if(prisoners[i] == null) {
				pri
				break;
			}
		}
		
	}

	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}

	
	
	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	
	
}
