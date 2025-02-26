package edu.kh.poly.ex2.model.service;

public class CHJCalculator implements Calculator {

	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
	// (부)클 - 자(클) : extends
	// (부)인 - 자(인) : extends
	// (부)인 - 자(클) : implements
	// (부)클 - 자(인) : 불가능

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
