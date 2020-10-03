package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringBitsTest {
	StringBits test = new StringBits();
	@Test
	public void testNormalCase() {
		Assert.assertEquals("Hello", test.getBits("H ellolto"));
	}
	@Test
	public void testLowerEdge() {
		Assert.assertEquals("H", test.getBits("H"));
	}
	@Test
	public void testNull() {
		Assert.assertEquals("", test.getBits(""));
	}
}
