package edu.kh.io.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOService {
	
	public void output1() {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("/io_test/20250305/test.txt");
			
			String str = "안녕하세요!";
			
			fos.write(str.getBytes());
			
//			for(int i = 0; i < str.length(); i++) {
//				fos.write(str.charAt(i));
//				fos.write(str.getBytes());
//			}
			fos.flush();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		System.out.println("실행완료");
	}
}
