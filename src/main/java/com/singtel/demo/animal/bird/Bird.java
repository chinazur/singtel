package com.singtel.demo.animal.bird;

import com.singtel.demo.animal.Animal;
import com.singtel.demo.animal.interfaces.Singable;

public class Bird extends Animal implements Singable {

	@Override
	public String sing() {
		return "Bird is singing";
	}

}
