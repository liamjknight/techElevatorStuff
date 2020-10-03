package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SameFirstLastTest {
	
	SameFirstLast test = new SameFirstLast();//I don't quite get what @Before is... for
	
	@Test
	public void test0_1_0True() {
		Assert.assertTrue("The array [0, 1, 0] did not return \'true\'",
				test.isItTheSame(new int[] {0, 1, 0}));
	}
	@Test
	public void test1_1True() {
		Assert.assertTrue("The array [1, 1] did not return \'true\'",
				test.isItTheSame(new int[] {1, 1}));
	}
	@Test
	public void testNullFalse() {
		Assert.assertFalse("The array \'null\' did not return \'false\'",
				test.isItTheSame(new int[] {}));
	}
	@Test
	public void test1_2_3False() {
		Assert.assertFalse("The array [1, 2, 3] did not return \'false\'",
				test.isItTheSame(new int[] {1, 2, 3}));
	}
	@Test
	public void test0True() {
		Assert.assertTrue("The array [0] did not return \'true\'",
				test.isItTheSame(new int[] {0}));
	}
	@Test
	public void test0_1_2_1_0True() {
		Assert.assertTrue("The array [0, 1, 2, 1, 0] did not return \'true\'",
				test.isItTheSame(new int[] {0, 1, 2, 1, 0}));
	}
}
