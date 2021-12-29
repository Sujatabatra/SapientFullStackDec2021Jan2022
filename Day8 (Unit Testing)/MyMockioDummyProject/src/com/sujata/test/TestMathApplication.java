package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.sujata.client.MathApplication;
import com.sujata.service.CalculatorService;

class TestMathApplication {

	private MathApplication mathApplication;
	private CalculatorService calculatorService;
	
	@BeforeEach
	void setUp() throws Exception {
		mathApplication=new MathApplication();
		
		calculatorService=Mockito.mock(CalculatorService.class);

		mathApplication.setCalculatorService(calculatorService);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//adding behaviour to mocked /mimiced services
		when(calculatorService.add(10, 20)).thenReturn(30);
				
		Assert.assertEquals(30, mathApplication.sum(10, 20));

	}

}
