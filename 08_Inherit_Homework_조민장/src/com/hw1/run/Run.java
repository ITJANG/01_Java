package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int arr = 0;
		Student s[] = new Student[3];
		Employee e[] = new Employee[10];
		
		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		for(int i = 0; i < s.length; i++)
			System.out.println(s[i].information());
		System.out.println("================================================"
				+ "=============================================");
		
		while(flag) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept = sc.next();
			
			e[arr] = new Employee(name, age, height, weight, salary, dept);
			arr++;
			
			System.out.print("계속 추가할래? (y/n) : ");
			String input = sc.next().toUpperCase();
			
			if(input.equals("Y"))
				flag = true;
			else if(input.equals("N"))
				flag = false;
		}
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) 
				System.out.println(e[i].information());
			else
				break;
		}
	}

}
