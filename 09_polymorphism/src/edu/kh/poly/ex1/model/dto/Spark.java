package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{
	
	private double discountOffer; // 할인혜택
	
	public Spark() {
		// TODO Auto-generated constructor stub
	}

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("/ %f", discountOffer);
	}
	
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
}
