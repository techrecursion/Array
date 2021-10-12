package com.te.arrayprograms;

public class ArrayCopy {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40 };
		int array1[] = new int[array.length];
		System.out.println("First array:");
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		for (int i = 0; i < array.length; i++) {
			array1[i] = array[i];
		}
		System.out.println("Second Array:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}

}
