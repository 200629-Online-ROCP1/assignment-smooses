package com.revature.pet;

public class Pet {
	
	String name;
	String color;
	int legs;
	int biteSize;
	
	public Pet() {
		
	}
	
	public Pet(String name, String color, int legs, int biteSize) {
		this.name = name;
		this.color = color;
		this.legs = legs;
		this.biteSize = biteSize;
	}
	
	public void call() {
		System.out.println("~Generic Animal Noise~");
	}
	
	public void eat(int food) {
		do {
			this.call();
			food-=this.biteSize;
		} while (food > 0);
	}

}
