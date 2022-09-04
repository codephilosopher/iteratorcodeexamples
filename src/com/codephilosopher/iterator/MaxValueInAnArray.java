package com.codephilosopher.iterator;

public class MaxValueInAnArray {
	static int maxValue;
	public static void main(String[] args) {
		MaxValueInAnArray.printMax(new int[] {1,2,3,4,5,6,5,8,3});
	}
	
	static void printMax(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println("The max value is: "+ maxValue);
	}
}
