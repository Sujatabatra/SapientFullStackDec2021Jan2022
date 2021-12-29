package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.sujata.demo.MyCalculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("Test Different functions of MyCalculator Class")
class TestMyCalculator {

	private MyCalculator myCalculator;

	
		@BeforeEach
		void setUp() throws Exception {
			myCalculator = new MyCalculator();
		}

		@AfterEach
		void tearDown() throws Exception {
			myCalculator = null;
		}

		@Nested
		@DisplayName("Testing divide() method of MyCalculator Class")
		class TestingDivide {
		@DisplayName("for values 20,4")
		@Test
		void t001() throws NegativeNumberException {
			assertEquals(5, myCalculator.divide(20, 4));
		}

		@DisplayName("for values 20,-4")
		@Test
		void t002() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(20, -4));
		}

		@DisplayName("for values -20,4")
		@Test
		void t003() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-20, 4));
		}

		@DisplayName("for values -20,-4")
		@Test
		void t004() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-20, -4));
		}

		@DisplayName("for values 20,0")
		@Test
		void t005() throws NegativeNumberException {
			assertThrows(ArithmeticException.class, () -> myCalculator.divide(20, 0));
		}

		@DisplayName("for values 0,4")
		@Test
		void t006() throws NegativeNumberException {
			assertEquals(0, myCalculator.divide(0, 4));
		}

		@DisplayName("for values -20,0")
		@Test
		void t007() throws NegativeNumberException {
			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-20, 0));
		}
	}

	@DisplayName("Testing add() method of MyCalculator Class")
	@Nested
	class TestingAdd {
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
}
