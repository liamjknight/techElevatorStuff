package com.techelevator;

public class forLoops {

	public static void main(String[] args) {
		int[] array = new int[6];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println(array[i]+1);
//		}
//		System.out.println("---new function---");
//		int j = 0;
//		while (j < 5) {
//			j++;
//			System.out.println(array[j]);
//		}
//		System.out.println("---new function---");
//		int k = 0;
//		do {
//			System.out.println(array[k]+1);
//			k++;
//		} while (k < 5);
	}

}
