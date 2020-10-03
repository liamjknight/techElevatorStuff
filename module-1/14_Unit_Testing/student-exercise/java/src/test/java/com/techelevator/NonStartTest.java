package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonStartTest {
	@Test
	public void testBothEmpty() {//not checked for in code, corrected
		NonStart test = new NonStart();
		Assert.assertTrue(test.getPartialString("", "").equals(""));
	}
	@Test
	public void testFirstStringEmpty() {
		NonStart test = new NonStart();
		Assert.assertTrue(test.getPartialString("", "Here").equals("ere"));
	}
	@Test
	public void testSecondStringEmpty() {
		NonStart test = new NonStart();
		Assert.assertTrue(test.getPartialString("There", "").equals("here"));
	}
	@Test
	public void testNormalCase() {
		NonStart test = new NonStart();
		Assert.assertTrue(test.getPartialString("There", "Here").equals("hereere"));
	}
}
