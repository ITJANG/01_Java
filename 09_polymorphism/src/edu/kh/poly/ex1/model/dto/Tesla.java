package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{
	
	private int batteryCapacity;//배터리
	//기능
	//생성자
	public Tesla() {
		// TODO Auto-generated constructor stub
	}

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	//메서드
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("/ %d", batteryCapacity);
	}

	
	//getter/setter
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
}
