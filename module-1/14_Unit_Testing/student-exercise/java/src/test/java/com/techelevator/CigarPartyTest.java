package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {
	@Test
	public void testCigarsBelowLowEdge() {
		CigarParty test = new CigarParty();
		Assert.assertFalse(test.haveParty(39, false));
	}
	@Test
	public void testCigarsLowEdge() {
		CigarParty test = new CigarParty();
		Assert.assertTrue(test.haveParty(40, false));
	}
	@Test
	public void testAboveHighEdgeDuringWeekday() {
		CigarParty test = new CigarParty();
		Assert.assertFalse(test.haveParty(61, false));
	}
	@Test
	public void testAboveHighEdgeDuringWeekend() {
		CigarParty test = new CigarParty();
		Assert.assertTrue(test.haveParty(61, true));
	}
	@Test
	public void testAtHighEdgeDuringWeekday() {
		CigarParty test = new CigarParty();
		Assert.assertTrue(test.haveParty(60, true));
	}
}
