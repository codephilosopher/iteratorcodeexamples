package com.codephilosopher.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleClass2 {

	public static void main(String[] args) {
		SampleClass3 s3 = new SampleClass3();
		//Iterator<String> it = s3.iterator();
		
		for (String string : s3) {
			System.out.println(string);
		}
	}
}

class SampleClass3 implements Iterable<String>{
	ArrayList<String> ar = new ArrayList<>();
	public SampleClass3( ) {
		ar.add("Hello");
		ar.add("There!");
	}
	
	@Override
	public Iterator<String> iterator() {
		return ar.iterator();
	}
	
	public int someMethod() {
		return 3;
	}
}
