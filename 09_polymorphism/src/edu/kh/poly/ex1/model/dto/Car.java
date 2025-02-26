package edu.kh.poly.ex1.model.dto;

public class Car {
	
	//속성
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴
	
	//기능
	//생성자
	public Car() {}

	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	//메서드
	//Object.toString() 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s / %s / %d", engine, fuel, wheel);
	}
	
	//getter/setter
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
}
