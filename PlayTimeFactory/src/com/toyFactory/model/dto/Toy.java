package com.toyFactory.model.dto;

import java.util.LinkedHashSet;
import java.util.Set;

public class Toy {
	private String toyName;
	private int useAge;
	private int toyPrice;
	private String toyColor;
	private String toyDate;
	private Set <String> toyMeterials = new LinkedHashSet<String>();
	
	
	// 생성자
	public Toy() {
		// TODO Auto-generated constructor stub
	}
	
	public Toy(String toyName, int useAge, int toyPrice, String toyColor, 
			String toyDate, Set<String> toyMeterials) {
		super();
		this.toyName = toyName;
		this.useAge = useAge;
		this.toyPrice = toyPrice;
		this.toyColor = toyColor;
		this.toyDate = toyDate;
		for(String meterials : toyMeterials)
			this.toyMeterials.add(meterials);
	}
	

	
	// 메서드
	@Override
	public String toString() {
		String printmeterial = "";
		for(String meterial : toyMeterials) {
			if(!meterial.equals("")) {
				if (printmeterial.equals(""))
					printmeterial += meterial;
				else
					printmeterial += ", " + meterial;
			}
		}
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 : %s / 재료 : %s\n"
				, toyName, toyPrice, toyColor, useAge, toyDate, printmeterial);
	}

	// getter setter
	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getUseAge() {
		return useAge;
	}

	public void setUseAge(int useAge) {
		this.useAge = useAge;
	}

	public int getToyPrice() {
		return toyPrice;
	}

	public void setToyPrice(int toyPrice) {
		this.toyPrice = toyPrice;
	}

	public String getToyColor() {
		return toyColor;
	}

	public void setToyColor(String toyColor) {
		this.toyColor = toyColor;
	}

	public String getToyDate() {
		return toyDate;
	}

	public void setToyDate(String toyDate) {
		this.toyDate = toyDate;
	}

}
