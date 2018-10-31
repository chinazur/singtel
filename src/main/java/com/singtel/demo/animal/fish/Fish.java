package com.singtel.demo.animal.fish;

import com.singtel.demo.animal.Animal;
import com.singtel.demo.animal.interfaces.Swimmable;

public abstract class Fish extends Animal implements Swimmable {

	private String size;
	private String color;
	
	public Fish() {
		
	}
	
	public Fish(String size, String color) {
		this.setSize(size);
		this.setColor(color);
	}
	
	@Override
	public String swim() {
		return "Fish is swimming";
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
