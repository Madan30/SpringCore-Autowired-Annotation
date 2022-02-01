package com.NepalCode.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private int numberofHeart;
	
	private Heart heart;

	
	
	// how to inject those object variable: use setter and constructor injection
	
	public Human() {
		
	}
	
	
	public Human(int numberofHeart, Heart heart) {
		this.numberofHeart = numberofHeart;
		this.heart = heart;
	}
	

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	
	public void setNumberofHeart(int numberofHeart) {
		this.numberofHeart = numberofHeart;
	}


	public void startPumping() {
	 if(heart != null) {
		 heart.pump();
		 System.out.println("name of the animals is: " + heart.getNameOfAnimal() + " "
		 		+ " no of heart present is: " + heart.getNoOfHeart());
	 }
	 else {
		 System.out.println("you have no life");
	 }
	}
	
	
}
