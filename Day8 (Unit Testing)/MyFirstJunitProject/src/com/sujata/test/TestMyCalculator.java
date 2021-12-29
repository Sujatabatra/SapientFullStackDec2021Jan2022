package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMyCalculator {

	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
	static void veryFirstMethod() throws Exception {
		System.out.println("Hi I am setup Before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Hi I am TearDown After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hi I am setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hi I am tearDown");
		System.out.println("====================");
	}

	@Test
	void testDivide1() {
		System.out.println("Test Case 1");
	}

	@Test
	void testDivide2() {
		System.out.println("Test Case 2");
	}
}
