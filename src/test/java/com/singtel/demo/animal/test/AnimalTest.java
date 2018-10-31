package com.singtel.demo.animal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.demo.animal.bird.Bird;

public class AnimalTest {
	@Test
	public void testBirdSing() {
		assertEquals("Bird is singing", new Bird().sing());
	}

}
