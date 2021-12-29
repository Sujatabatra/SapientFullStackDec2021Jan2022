package com.sujata.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TestFactorial {

	private Factorial factObj;
	@BeforeEach
	void setUp() throws Exception {
		factObj=new Factorial();
	}

	@AfterEach
	void tearDown() throws Exception {
		factObj=null;
	}

	@Test
	void testCalculate1() {
		factObj.setNumber(4);
		factObj.calculate();
		assertEquals(24, factObj.getFactorial());
	}
	
	@Test
	void testCalculate2() {
		factObj.setNumber(0);
		factObj.calculate();
		assertEquals(1, factObj.getFactorial());
	}
	
//	@RepeatedTest(3)
	@Test
	void testCalculate3() {
		assertThrows(NegativeNumberException.class, ()->factObj.setNumber(-4));
	}

}
