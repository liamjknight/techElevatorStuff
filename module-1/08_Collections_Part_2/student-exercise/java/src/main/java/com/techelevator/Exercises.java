package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> animalMap = new HashMap<String, String>();
		animalMap.put("rhino", "Crash");
		animalMap.put("giraffe", "Tower");
		animalMap.put("elephant", "Herd");
		animalMap.put("lion", "Pride");
		animalMap.put("crow", "Murder");
		animalMap.put("pigeon", "Kit");
		animalMap.put("flamingo", "Pat");
		animalMap.put("deer", "Herd");
		animalMap.put("dog", "Pack");
		animalMap.put("crocodile", "Float");
		
		if (animalName != null) {
			animalName = animalName.toLowerCase();
		}
		
		if (animalMap.containsKey(animalName)) {
			return animalMap.get(animalName);
		}else {
			return "unknown";
		}
	
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> onSaleMap = new HashMap<String, Double>();
		onSaleMap.put("KITCHEN4001", .20);
		onSaleMap.put("GARAGE1070", .15);
		onSaleMap.put("LIVINGROOM", .10);
		onSaleMap.put("KITCHEN6073", .40);
		onSaleMap.put("BEDROOM3434", .60);
		onSaleMap.put("BATH0073", .15);
		
		if (itemNumber != null) {
			itemNumber = itemNumber.toUpperCase();
		}
		if (onSaleMap.containsKey(itemNumber)) {
			return onSaleMap.get(itemNumber);
		}else {
			return 0.00;
		}
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		Map<String, Integer> pete2Paul = new HashMap<String, Integer>();
		
			if ((peterPaul.get("Paul")<1000)&&(peterPaul.get("Peter")>0)) {
				
				int peter = peterPaul.get("Peter");
				boolean peterCashOdd = (peter%2==1)?true:false;
				
				int peterHalf = (peterCashOdd)?peter-(peter/2):peter/2;
				
				int paul = peterPaul.get("Paul");
				
				paul = (peterCashOdd)?(paul+peterHalf)-1:paul+peterHalf;
				
				pete2Paul.put("Peter", peterHalf);
				pete2Paul.put("Paul", paul);
				
			}else {
				pete2Paul=peterPaul;
			}
		return pete2Paul;
	}
		//did not work
		/*System.out.println(peterPaul.get("Paul"));
		if (peterPaul.get("Paul")<1000) {
			System.out.println(peterPaul.get("Peter"));
			if (peterPaul.get("Peter")>0) {
				int halfPeter = peterPaul.get("Peter")/2;
				System.out.println(peterPaul.get("Paul")+halfPeter);
				peterPaul.put("Paul", peterPaul.get("Paul")+halfPeter);
				peterPaul.put("Peter", halfPeter);
			}
		}
		return peterPaul;*/
	
	

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		if (peterPaul.get("Peter")>=50) {
			if (peterPaul.get("Paul")>=100) {
//This is the one that I could not solve, would like to go over with you.
				int paulCash = peterPaul.get("Paul");//paul stuff
				System.out.println("paul "+paulCash);
				int paulInvest = paulCash/4;
				peterPaul.put("Paul", paulCash-paulInvest);
				System.out.println("Paul-invest "+paulCash);
				
				int peterCash = peterPaul.get("Peter");//peter stuff
				System.out.println("Peter "+peterCash);
				int peterInvest = peterCash/4;
				peterPaul.put("Peter", peterCash-peterInvest);
				System.out.println("Peter-invest "+peterCash);
				
				int combinedTotal = (paulInvest+peterInvest);
				System.out.println("Partner "+combinedTotal);
				peterPaul.put("PeterPaulPartnership", combinedTotal);
				System.out.println(peterPaul);
				System.out.println("------------------------------");
				return peterPaul;
			}
		}
		System.out.println(peterPaul);
		System.out.println("------------------------------");
		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> firstNLast = new HashMap<String, String>();
		
		for (String string : words) {
			firstNLast.put(string.substring(0, 1), string.substring(string.length()-1));
		}
		return firstNLast;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			
			}
			if (returnMap.containsKey(words[i])==false) {
				returnMap.put(words[i], count);
			}
		}
		return returnMap;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> returnMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < ints.length; i++) {
			int count = 1;
			for (int j = i+1; j < ints.length; j++) {
				if (ints[i]==ints[j]) {
					count++;
				}
			
			}
			if (returnMap.containsKey(ints[i])==false) {
				returnMap.put(ints[i], count);
			}
		}
		return returnMap;//copy, paste, change array name. That was a hard one!~
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> returnMap = new HashMap<String, Boolean>();
		
		for (String string : words) {
			returnMap.put(string, false);
		}
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					returnMap.put(words[i], true);
				}
			}
		}
		return returnMap;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		/*needs to loop through remote warehouse and see if each key is already included, if so
		 * add remote to main and put that new value back. if key doesnt exist, make new k/v
		 * pair in main using info from remote*/
		
		for (Map.Entry<String, Integer> entry : remoteWarehouse.entrySet()) {
			if (mainWarehouse.containsKey(entry.getKey())) {
				int mainCount = mainWarehouse.get(entry.getKey());
				int remoteCount = entry.getValue();
				int newCount = mainCount+remoteCount;
				mainWarehouse.put(entry.getKey(), newCount);
				
			}else {
				mainWarehouse.put(entry.getKey(), entry.getValue());
			}
		}
		return mainWarehouse;	
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> returnMap = new HashMap<String, Integer>();
		
		for (String compare:words) {//to loop through array of strings
			int count = 0;//count times last 2 substring is repeated
			for (int j = 0; j < compare.length()-2; j++) {//iterating through substring, minus two in order to stop before final index
				String compareEnd = compare.substring(compare.length()-2);//variable holding the final 2 chars of String compare
				String comparedString = compare.substring(j,j+2);//variable holding the current index and next to be compared
				if (compareEnd.equals(comparedString)) {//compare substrings
					count++;//increase count if compare is true
				}
			}
			returnMap.put(compare, count);//add string and it's count to map
		}
		return returnMap;
	}

}
