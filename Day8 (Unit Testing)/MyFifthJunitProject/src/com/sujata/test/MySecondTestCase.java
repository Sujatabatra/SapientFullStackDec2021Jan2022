package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.sujata.demo.MyCalculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("Testing add() method of MyCalculator Class")
class MySecondTestCase {

	private MyCalculator myCalculator;

	@BeforeEach
	void setUp() throws Exception {
		myCalculator = new MyCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		myCalculator = null;
	}

	@DisplayName("for values 10,20")
	@Test
	void t008() throws NegativeNumberException {
		assertEquals(30, myCalculator.add(10, 20));
	}

	@DisplayName("for values -10,20")
	@Test
	void t009() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, () -> myCalculator.add(-10, 20));
	}

	@DisplayName("for values 10,-20")
	@Test
	void t010() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, () -> myCalculator.add(10, -20));
	}

	@DisplayName("for values -10,-20")
	@Test
	void t011() throws NegativeNumberException {
		assertThrows(NegativeNumberException.class, () -> myCalculator.add(-10, -20));
	}

}
