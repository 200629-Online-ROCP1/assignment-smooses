package com.revature.pet.driver;

import com.revature.pet.*;

public class Driver {

	public static void main(String[] args) {

		Cat fluffy = new Cat("Fluffy", "Tabby", 3, 2, 0);
		
		fluffy.fillBowl(15);
		fluffy.fillBowl(5);
		fluffy.eat();

	}

}
