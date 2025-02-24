package com.hw1.model.vo;

public class Employee {
	/*
	- empName : String
	- dept : String
	- job : String
	- phone : String
	- address : String
	- gender : char // 성별
 	- empNo : int // 사번
	- salary : int // 급여
	- age : int // 나이
	- bonusPoint : double // 보너스포인트
	 */
	private String empName; // 사원명
	private String dept; // 소속부서
	private String job; // 직급
	private String phone; // 전화번호
	private String address; // 주소
	private char gender; // 성별
	private int empNo; // 사번
	private int salary; // 급여
	private int age; // 나이
	private double bonusPoint; // 보너스포인트
	
	
	// 기본 생성자
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	// (매개변수 생성자)
	public Employee(String empName, String phone, String address,
			char gender, int empNo, int age) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.empNo = empNo;
		this.age = age;
	}
	
	// (매개변수 생성자)
	public Employee(String empName, String dept, String job, 
			String phone, String address, char gender, 
			int empNo, int salary, int age, double bonusPoint) {
		super();
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.empNo = empNo;
		this.salary = salary;
		this.age = age;
		this.bonusPoint = bonusPoint;
	}
	
	// 사원 정보
	public String information() {
		return this.empNo + ", " + this.empName + ", " + this.dept + ", " +
				this.job + ", "+ this.age + ", " + this.gender + ", " + 
				this.salary + ", " + this.bonusPoint + ", " + this.bonusPoint 
				+ ", " + this.address  ;
	}
	
	
	// getter/setter
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
}
