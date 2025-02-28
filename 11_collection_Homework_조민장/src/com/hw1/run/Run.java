package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw1.model.dto.Friend;


public class Run {
	public static void main(String[] args) {
	
		List<Friend> friend = new ArrayList<>();
		
		friend.add(new Friend("짱구"));
		friend.add(new Friend("철수"));
		friend.add(new Friend("유리"));
		friend.add(new Friend("훈이"));
		friend.add(new Friend("맹구"));
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. 실행");
			System.out.println("2. 종료");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				int random = (int)(Math.random() * 5);
				friend.get(random).pickLeader();
				break;
			case 2:
				System.out.println("종료합니다");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
}
