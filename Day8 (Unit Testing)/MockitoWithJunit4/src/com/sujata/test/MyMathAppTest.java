package com.sujata.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import com.sujata.client.MathApplication;
import com.sujata.service.CalculatorService;


@RunWith(MockitoJUnitRunner.class)
public class MyMathAppTest {

	@InjectMocks
	MathApplication mathApplication = new MathApplication();

	// Mimic service
	@Mock
	CalculatorService calculatorService;

	@Test
	public void testAdd(){
		//adding behaviour to mocked /mimiced services
		when(calculatorService.add(10, 20)).thenReturn(30);
		
		Assert.assertEquals(30, mathApplication.sum(10, 20));


}
}