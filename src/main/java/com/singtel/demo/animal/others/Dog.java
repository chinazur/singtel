package com.singtel.demo.animal.others;

import com.singtel.demo.animal.Animal;
import com.singtel.demo.animal.interfaces.Talkable;

public class Dog extends Animal implements Talkable {

	@Override
	public String talk() {
		return "Woof woof";
	}

}
