package com.revature.pet;

public class Cat extends Pet{

	int foodBowl;
	
	public Cat() {
		
	}
	
	public Cat(String name, String color, int legs, int biteSize, int foodBowl) {
		super(name, color, legs, biteSize);
		this.foodBowl = foodBowl;
	}
	
	public void call() {
		System.out.println("Meow!");
	}
	
	public void eat() {
		super.eat(foodBowl);
		foodBowl = 0;
	}
	
	public void fillBowl(int food) {
		if (foodBowl > 0) {
			System.out.println("The bowl is already full!");
		}
		else {
			foodBowl = food;
			System.out.println("The bowl now contains " + foodBowl + " units of food!");
		}
	}
}
