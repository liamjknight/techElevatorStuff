package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFashionTest {
	@Test
	public void testEdgesOfMaybe() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(1, test.getATable(3, 7));
	}
	@Test
	public void testDateAs8() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(2, test.getATable(5, 8));
	}
	@Test
	public void testDateAs10() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(2, test.getATable(5, 10));
	}
	@Test
	public void testDateAs2() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(0, test.getATable(5, 2));
	}
	@Test
	public void testDateAs0() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(0, test.getATable(5, 0));
	}
	@Test
	public void testYouAs8() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(2, test.getATable(8, 5));
	}
	@Test
	public void testYouAs10() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(2, test.getATable(10, 5));
	}
	@Test
	public void testYouAs2() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(0, test.getATable(2, 5));
	}
	@Test
	public void testYouAs0() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(0, test.getATable(0, 5));
	}
	@Test
	public void testBadMoreImportantThanGood() {
		DateFashion test = new DateFashion();
		Assert.assertEquals(0, test.getATable(2, 8));
	}
}
