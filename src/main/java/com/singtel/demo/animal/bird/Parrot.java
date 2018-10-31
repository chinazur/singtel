package com.singtel.demo.animal.bird;

import com.singtel.demo.animal.Animal;
import com.singtel.demo.animal.interfaces.Talkable;

public class Parrot extends Bird {
	
	private Animal livesWith;
	
	public Parrot(Animal animal) {
		this.livesWith = animal;
	}

	@Override
	public String talk() {
		
		if(livesWith instanceof Talkable) {
			return ((Talkable) livesWith).talk();
		}
		
		return "Parrot is talking";
	}
	
}
