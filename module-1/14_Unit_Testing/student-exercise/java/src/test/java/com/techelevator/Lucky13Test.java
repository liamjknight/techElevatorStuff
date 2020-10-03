package com.techelevator;

import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.Assert;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lucky13Test {
	@Test
	public void array0_2_4IsTrue() {
		int array[] = new int[] {0, 2, 4};
		Lucky13 test = new Lucky13();
		Assert.assertTrue(test.getLucky(array));
	}
	@Test
	public void array1_2_3IsFalse() {
		int array[] = new int[] {1, 2, 3};
		Lucky13 test = new Lucky13();
		Assert.assertFalse(test.getLucky(array));	
	}
	@Test
	public void array1_2_4IsFalse() {
		int array[] = new int[] {1, 2, 4};
		Lucky13 test = new Lucky13();
		Assert.assertFalse(test.getLucky(array));
	}
	@Test
	public void array0_1_3IsFalse() {
		int array[] = new int[] {0, 1, 3};
		Lucky13 test = new Lucky13();
		Assert.assertFalse(test.getLucky(array));
	}
	@Test
	public void arrayNullIsTrue() {
		int array[] = null;
		Lucky13 test = new Lucky13();
		Assert.assertTrue(test.getLucky(array));
	}
}
