package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FrontTimesTest {
	FrontTimes test = new FrontTimes();
	@Test
	public void testCoCo2() {
		Assert.assertTrue("Did not return \"CoCCoC\"", test.generateString("CoCo", 2).equals("CoCCoC"));
	}
	@Test 
	public void testNull() {
		Assert.assertTrue("Did not return \"\"", test.generateString("", 2).equals(""));
	}
	@Test
	public void testStrLengthLessThan3() {
		Assert.assertTrue("Did not return \"CoCoCo\"", test.generateString("Co", 3).equals("CoCoCo"));
	}
}
