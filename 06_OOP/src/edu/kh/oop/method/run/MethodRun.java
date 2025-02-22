package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;
import edu.kh.oop.method.model.vo.Member;

public class MethodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample methodEx= new MethodExample();
		
		//methodEx.method1();
		
		MemberService ms = new MemberService();
		
		ms.displayMenu();
	}

}
