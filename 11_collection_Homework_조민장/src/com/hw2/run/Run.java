package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Zoo zoo = new Zoo();

		zoo.addAnimal(new Tiger("호랑이"));
		zoo.addAnimal(new Monkey("원숭이"));
		
		boolean flag = true;
		
		while(flag) {
			zoo.displayMenu();
			int input = sc.nextInt();
			
			if(input == 1) {
				zoo.showAnimals();
			}
			else if(input == 2) {
				System.out.println("프로그램을 종료합니다");
				flag = false;
			}
			else
				System.out.println("잘못된 입력");
		}
		
	}
}
