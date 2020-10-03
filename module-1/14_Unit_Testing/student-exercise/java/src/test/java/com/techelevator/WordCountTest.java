package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WordCountTest {
	WordCount test = new WordCount();
	
	@Test
	public void testInOrderRepetiton() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("ba", 2);
		expected.put("black", 1);
		expected.put("sheep", 1);
		Assert.assertEquals(expected, 
				test.getCount(new String[] {"ba", "ba", "black", "sheep"}));
	}
	@Test
	public void testOutOfOrderRepetiton() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("a", 2);
		expected.put("b", 2);
		expected.put("c", 1);
		Assert.assertEquals(expected, 
				test.getCount(new String[] {"a", "b", "a", "c", "b"}));
	}
	@Test
	public void testNoRepetition() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("a", 1);
		expected.put("b", 1);
		expected.put("c", 1);
		Assert.assertEquals(expected, test.getCount(new String[] {"a", "b", "c"}));
	}
	@Test
	public void testNull() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		Assert.assertEquals(expected, 
				test.getCount(new String[] {}));
	}
	@Test
	public void testA_A_A_A_A_ARepetition() {
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("a", 6);
		Assert.assertEquals(expected, 
				test.getCount(new String[] {"a", "a", "a", "a", "a", "a"}));
	}
}
