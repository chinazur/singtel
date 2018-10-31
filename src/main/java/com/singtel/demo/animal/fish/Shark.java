package com.singtel.demo.animal.fish;

public class Shark extends Fish {

	public Shark() {
		super("large", "grey");
	}

	public void eat(Fish fish) {
		System.out.println("Shark eats other fish");
	}

}
