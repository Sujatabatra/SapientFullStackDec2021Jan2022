package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.params.provider.Arguments.*;

import com.sujata.demo.MyCalculator;
import com.sujata.exception.NegativeNumberException;

@DisplayName("Testing divide() method of MyCalculator Class")
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

	static Stream<Arguments> inputForValuesAndExceptionClasses() {
		return Stream.of(arguments(-20, 0, NegativeNumberException.class), 
				arguments(20, 0, ArithmeticException.class),
				arguments(-20, -4, NegativeNumberException.class), 
				arguments(20, -4, NegativeNumberException.class),
				arguments(-20, 4, NegativeNumberException.class));
	}

	@DisplayName("for values 20,4")
	@Test
	void t001() throws NegativeNumberException {
		assertEquals(5, myCalculator.divide(20, 4));
	}

	@ParameterizedTest
	@MethodSource("inputForValuesAndExceptionClasses")
	void t00x(int number1, int number2, Class cls) {
		assertThrows(cls, () -> myCalculator.divide(number1, number2));
	}

//		@DisplayName("for values 20,-4")
//		@Test
//		void t002() throws NegativeNumberException {
//			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(20, -4));
//		}

//		@DisplayName("for values -20,4")
//		@Test
//		void t003() throws NegativeNumberException {
//			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-20, 4));
//		}

//		@DisplayName("for values -20,-4")
//		@Test
//		void t004() throws NegativeNumberException {
//			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-20, -4));
//		}

//		@DisplayName("for values 20,0")
//		@Test
//		void t005() throws NegativeNumberException {
//			assertThrows(ArithmeticException.class, () -> myCalculator.divide(20, 0));
//		}

	@DisplayName("for values 0,4")
	@Test
	void t006() throws NegativeNumberException {
		assertEquals(0, myCalculator.divide(0, 4));
	}

//		@DisplayName("for values -20,0")
//		@Test
//		void t007() throws NegativeNumberException {
//			assertThrows(NegativeNumberException.class, () -> myCalculator.divide(-20, 0));
//		}

	
}
