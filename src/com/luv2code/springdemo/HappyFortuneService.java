package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	// Create an array of Strings	
	
		private String[] data = {
				"Today is your lucky day!",
				"Do something you have never done!",
				"Your lucky number is 5!"
		};
	
	// create Random number generator
		private Random myRandom = new Random();
		
	
	@Override
		public String getFortune() {
	// Random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return  theFortune;
		

		
		
		
	}

}
