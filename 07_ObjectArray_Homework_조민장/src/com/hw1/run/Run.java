package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee();
		empArr[1] = new Employee("홍길동", "01022223333", "서울 잠실",
				'M', 1, 19);
		empArr[2] = new Employee("강말순", "교육부", "강사", 
				"01011112222", "서울 마곡", 'F', 
				2, 1000000, 20, 0.01);
		for(int i = 0; i < empArr.length; i++) {
			System.out.printf("emp[%d] : %s\n",
					i, empArr[i].information());
		}
		System.out.println("=======================================================================");
		empArr[0].setEmpNo(0);
		empArr[0].setEmpName("김말똥");
		empArr[0].setDept("영업부");
		empArr[0].setJob("팀장");
		empArr[0].setAge(30);
		empArr[0].setGender('M');
		empArr[0].setSalary(3000000);
		empArr[0].setBonusPoint(0.2);
		empArr[0].setPhone("01055559999");
		empArr[0].setAddress("전라도 광주");

		empArr[1].setDept("기획부");
		empArr[1].setJob("부장");
		empArr[1].setSalary(4000000);
		empArr[1].setBonusPoint(0.3);
		
		for(int i = 0; i < empArr.length-1; i++) {
			System.out.printf("emp[%d] : %s\n",
					i, empArr[i].information());
		}
		System.out.println("=======================================================================");
		
		int sum = 0;
		for(int i = 0; i < empArr.length; i++) {
			int sal = (int)((empArr[i].getSalary() + 
					(empArr[i].getSalary() * empArr[i].getBonusPoint()))*12);
			System.out.printf("%s의 연봉 : %d원\n", empArr[i].getEmpName(), sal);
			sum += sal;
		}
		System.out.printf("직원들의 연봉 평균 : %d원", sum/3);
		
	}

}
