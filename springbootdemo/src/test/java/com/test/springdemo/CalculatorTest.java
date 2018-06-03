package com.test.springdemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	public CalculatorTest() {
		System.out.println(" >>>> One Time >>>>>>>");
	}
	
	@Before
	public void setup() {
		calculator = new Calculator();
		System.out.println(" >>>>>>>>> Before >>>>>>>>>>>");
	}

	@Test
	public void testAddwithPositiveNumber() {
		assertEquals(11, calculator.add(5, 6));
	}
	
	@Test
	public void testAddwithNegNumber() {
		assertEquals(-11, calculator.add(-5, -6));
	}
	
	@Test
	public void testSubwithPositiveNumber() {
		assertEquals(-1, calculator.sub(5, 6));
	}
	
	@Test
	public void testSubwithNegNumber() {
		assertEquals(1, calculator.sub(-5, -6));
	}
	
	@After
	public void cleanUp() {
		calculator = null;
		System.out.println(" >>>>>>>>> After >>>>>>>>>>>");
	}
}
