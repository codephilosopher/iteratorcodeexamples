package com.codephilosopher.iterator;

public class MakePalindrome {

	public static void main(String[] args) {
		MakePalindrome.palindrome("pradeek");
	}
	static void palindrome(String arr) {
		for (int i = arr.length()-1; i >= 0; i--) {
			System.out.print(arr.charAt(i));
		}
	}
}
