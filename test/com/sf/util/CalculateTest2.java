package com.sf.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculateTest2 {

	@Test
	public void testAdd() {
		assertEquals(5, Calculate.add(3, 3));
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		assertEquals(3, Calculate.divide(3, 0));
	}

}
