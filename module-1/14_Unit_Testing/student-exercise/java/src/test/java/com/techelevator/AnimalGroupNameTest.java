package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTest {
	@Test
	public void testGiraffe() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Giraffe").equals("Tower"));
	}
	@Test
	public void testRhino() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Rhino").equals("Crash"));
	}
	@Test
	public void testElephant() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Elephant").equals("Herd"));
	}
	@Test
	public void testLion() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Lion").equals("Pride"));
	}
	@Test
	public void testCrow() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Crow").equals("Murder"));
	}
	@Test
	public void testPigeon() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Pigeon").equals("Kit"));
	}
	@Test
	public void testFlamingo() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Flamingo").equals("Pat"));
	}
	@Test
	public void testDeer() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Deer").equals("Herd"));
	}
	@Test
	public void testDog() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Dog").equals("Pack"));
	}
	@Test
	public void testCrocodile() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("Crocodile").equals("Float"));
	}
	@Test
	public void testCrocodileWeirdCaps() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("crOCodIle").equals("Float"));
	}
	@Test
	public void testEmptyInput() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("").equals("unknown"));
	}
	@Test
	public void testRandomText() {
		AnimalGroupName test = new AnimalGroupName();
		Assert.assertTrue(test.getHerd("asd.kf").equals("unknown"));
	}
}
