package com.ss.prrolifics.mavendemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testcalculator {
	Calculator c = null;
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void testisEven(boolean expVal,int actVal)
	{
		assertEquals(expVal,c.age(19));
	}

}
