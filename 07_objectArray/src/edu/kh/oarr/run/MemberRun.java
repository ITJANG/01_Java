package edu.kh.oarr.run;

import java.nio.channels.MembershipKey;

import edu.kh.oarr.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService ms = new MemberService();
		
		ms.displayMenu();
		
	}

}
