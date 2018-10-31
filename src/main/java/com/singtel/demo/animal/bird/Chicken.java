package com.singtel.demo.animal.bird;

import com.singtel.demo.animal.interfaces.Singable;

public class Chicken extends Bird implements Singable{
	
	public void fly() throws Exception {
		throw new Exception("Chicken cannot fly");
	}
	
	public String sing() {
		return "Cluck, cluck";
	}

}
