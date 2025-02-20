package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;
import edu.kh.oop.practice.model.service.HeroServiceScanner;

public class PracticeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bs = new BookService();
		
		//bs.practice();
		
		HeroService hs = new HeroService();
		
		//hs.practice();
		
		HeroServiceScanner hss = new HeroServiceScanner();
		
		hss.practice();
	}

}
