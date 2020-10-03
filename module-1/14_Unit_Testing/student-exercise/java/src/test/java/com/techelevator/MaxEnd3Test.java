package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaxEnd3Test {
	MaxEnd3 test = new MaxEnd3();
	@Test
	public void testFirstBigger() {
		Assert.assertArrayEquals(new int[] {3, 3, 3}, test.makeArray(new int[] {3, 2, 1}));
	}
	@Test
	public void testLastBigger() {
		Assert.assertArrayEquals(new int[] {3, 3, 3}, test.makeArray(new int[] {1, 2, 3}));
	}
	@Test
	public void testMiddleBigger() {
		Assert.assertArrayEquals(new int[] {1, 1, 1}, test.makeArray(new int[] {1, 2, 1}));
	}
	@Test
	public void testTooManyInts() {
		Assert.assertArrayEquals(new int[] {4, 4, 4, 4}, test.makeArray(new int[] {1, 3, 2, 4}));
	}
}
