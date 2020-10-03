package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Less20Test {
	@Test
	public void test15() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(15));
	}
	@Test
	public void test17() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(17));
	}
	@Test
	public void test18() {
		Less20 test = new Less20();
		Assert.assertTrue(test.isLessThanMultipleOf20(18));
	}
	@Test
	public void test19() {
		Less20 test = new Less20();
		Assert.assertTrue(test.isLessThanMultipleOf20(19));
	}
	@Test
	public void test20() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(20));
	}
	@Test
	public void test21() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(21));
	}
	@Test
	public void test35() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(35));
	}
	@Test
	public void test37() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(37));
	}
	@Test
	public void test38() {
		Less20 test = new Less20();
		Assert.assertTrue(test.isLessThanMultipleOf20(38));
	}
	@Test
	public void test39() {
		Less20 test = new Less20();
		Assert.assertTrue(test.isLessThanMultipleOf20(39));
	}
	@Test
	public void test40() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(40));
	}
	@Test
	public void test41() {
		Less20 test = new Less20();
		Assert.assertFalse(test.isLessThanMultipleOf20(41));
	}
}
