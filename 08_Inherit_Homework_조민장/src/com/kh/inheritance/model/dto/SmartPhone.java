package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {
	private String operatingSystem;
	private int storageCapacity;
	
	
	//생성자
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String model, int
			year, int price, String operatingSystem, int
			storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	

	@Override
	public void printInfo() {
		System.out.print("Brand : " + super.getBrand() + "\nModel : " + super.getModel() 
				+ "\nYear : " + super.getYear() + "\nPrice : " + super.getPrice() + 
				"\nOperating System : " + operatingSystem + "\nStorage Capacity : " + storageCapacity);
	}
	
	// getter/setter
	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
}