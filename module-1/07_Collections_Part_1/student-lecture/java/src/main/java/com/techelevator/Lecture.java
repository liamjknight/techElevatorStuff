package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.events.Namespace;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> firstList = new ArrayList<String>();
		firstList.add("Bob");
		firstList.add("Mary");
		firstList.add("Frank");
		firstList.add("Jen");
		System.out.println(firstList.size());

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (String name : firstList)
			System.out.println(name);
		
		Collections.sort(firstList);
		
		for (String name : firstList)
			System.out.println(name);
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		firstList.add("Bob");
		for (String name : firstList)
			System.out.println(name);

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		firstList.add(2, "Fran");
		
		Collections.sort(firstList);
		for (String name : firstList)
			System.out.println(name);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		firstList.remove(1);
		for (String name : firstList)
			System.out.println(name);
		

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println(firstList.contains("Bob"));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		System.out.println(firstList.indexOf("Frank"));

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] listArray = firstList.toArray(new String[0]);
		System.out.println(firstList.size());
		System.out.println(listArray.length);
		
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		for (String name : firstList)
			System.out.println(name);
		
		System.out.println("------------------");

		Collections.reverse(firstList);
		
		for (String name : firstList)
			System.out.println(name);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();


	}
}
