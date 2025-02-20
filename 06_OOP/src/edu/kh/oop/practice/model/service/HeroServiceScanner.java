package edu.kh.oop.practice.model.service;

import java.util.Scanner;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroServiceScanner {
	public void practice() {
		
		Scanner sc = new Scanner(System.in);
		String nickname = "", job = ""; 
		int level = 1;
		double exp = 0;
		boolean flag = true, flag2 = true;
		int input = 0, input2 = 0;
		
		do {
			System.out.println("============Hero============");
			System.out.println("1. 게임 시작");
			System.out.println("2. 종료");
			input = sc.nextInt();
			sc.nextLine();
			if(input == 1) {
				System.out.print("닉네임 : ");
				nickname = sc.nextLine();
				System.out.print("직업 : ");
				job = sc.nextLine();
				int hp = (int)(Math.random()*200+1);
				int mp = (int)(Math.random()*200+1);
				Hero h2 = new Hero(nickname, job, hp, mp,
						level, exp);
				do {
					System.out.println("\n====행동을 정하시오====");
					System.out.println("1. 공격");
					System.out.println("2. 대쉬");
					System.out.println("3. 종료");
					input = sc.nextInt();
					sc.nextLine();
					if(input == 1) {
						double exp2=(int)(Math.random()*200+1);
						h2.attack(exp2);
					} else if (input == 2) {
						h2.dash();
					} else
						flag2 = false;
				}while(flag2);
			}else
				flag = false;
		} while(flag);
		System.out.println("게임이 종료되었습니다");
	}
}
