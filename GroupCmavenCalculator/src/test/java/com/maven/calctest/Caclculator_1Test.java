package com.maven.calctest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.maven.calc1.Calculator_1;

import junit.framework.Assert;

public class Caclculator_1Test {

	Calculator_1 c = new Calculator_1();
	
	@Test
	public void addTest() {
		Assert.assertEquals(8, c.addition(4,4));
		
	}
	
	@Test
	public void subTest() {
		Assert.assertEquals(15, c.subtraction(30, 15));
		
	}
	@Test
	public void mulTest() {
		Assert.assertEquals(8, c.multiplication(4, 2));
	}
	
	@Test
	public void divTest() {
		Assert.assertEquals(4.0, c.division(40, 10));
	}
}
