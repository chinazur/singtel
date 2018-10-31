package com.singtel.demo.animal.fish;

import com.singtel.demo.animal.Animal;
import com.singtel.demo.animal.interfaces.Swimmable;

public class Dolphin extends Animal implements Swimmable {

	@Override
	public String swim() {
		return "Dolphin is swimming";
	}

}
