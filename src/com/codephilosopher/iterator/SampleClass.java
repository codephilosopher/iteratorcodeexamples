package com.codephilosopher.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleClass {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.displayMessage();
		Iterator<Object> it = s.iterator();
		while (it.hasNext()) {
			Object s1 = it.next();
			System.out.println(s1);
		}
	}

}


class Sample {
	ArrayList<Object> al = new ArrayList<>(); // List > Iterable
	public void displayMessage( ) {
		al.add("Hi");
		al.add(1);
	}
	
	
	public Iterator<Object> iterator() {
		return al.iterator();
	}
}
