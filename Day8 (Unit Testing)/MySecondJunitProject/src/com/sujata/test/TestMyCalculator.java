package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.MyCalculator;
import com.sujata.exception.NegativeNumberException;

class TestMyCalculator {

	private MyCalculator myCalculator;
	
	@BeforeEach
	void setUp() throws Exception {
		myCalculator=new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator=null;
	}

	@Test
	void t001() throws NegativeNumberException {
		assertEquals(5, myCalculator.divide(20, 4));
	}

	@Test
	void t002()throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(20, -4));
	}
	
	@Test
	void t003()throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-20, 4));
	}
	
	@Test
	void t004()throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-20, -4));
	}
	
	@Test
	void t005()throws NegativeNumberException {
		assertThrows(ArithmeticException.class, ()->myCalculator.divide(20, 0));
	}
	
	@Test
	void t006()throws NegativeNumberException {
		assertEquals(0, myCalculator.divide(0, 4));
	}
	
	@Test
	void t007()throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, ()->myCalculator.divide(-20, 0));
	}
}
