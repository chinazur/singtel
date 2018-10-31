package com.singtel.demo.animal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.singtel.demo.animal.bird.Bird;
import com.singtel.demo.animal.bird.Chicken;
import com.singtel.demo.animal.bird.Duck;
import com.singtel.demo.animal.bird.Parrot;
import com.singtel.demo.animal.bird.Rooster;
import com.singtel.demo.animal.others.Cat;

public class AnimalTest {
	@Rule
    public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testBirdSing() {
		assertEquals("Bird is singing", new Bird().sing());
	}
	
	@Test
	public void testDuckSwim() {
		assertEquals("Duck is swimming", new Duck().swim());
	}

	@Test
	public void testChickenCannotFly() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Chicken cannot fly");
        new Chicken().fly();
	}
	
	@Test
	public void testRoosterSing() {
		assertEquals("Cock-a-doodle-doo", new Rooster().sing());
	}
	
	@Test
	public void testParrotLivingWithCatTalk() {
		assertEquals("Meow", new Parrot(new Cat()).talk());
	}
}
