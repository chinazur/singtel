package com.singtel.demo.animal.bird;

import com.singtel.demo.animal.interfaces.Swimmable;

public class Duck extends Bird implements Swimmable{
	
	public String sing() {
		return "Quack, quack";
	}

	@Override
	public String swim() {
		return "Duck is swimming";
	}

}
