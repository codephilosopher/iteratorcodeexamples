package com.codephilosopher.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleClass1 {
	public static void main(String[] args) {
		IterableClass it = new IterableClass();
		Iterator<String> itr= it.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}
	}
}

class IteratorInterfaceClass implements Iterator<String> {
	
	ArrayList<String> ar = new ArrayList<>();
	private int currentPosition = 0;
	
	public IteratorInterfaceClass() {
		ar.add("hello");
		ar.add("There");
		ar.add("how");
		ar.add("are");
		ar.add("you");
		ar.add("doing");
	}
	

	@Override
	public boolean hasNext() {
		return currentPosition < ar.size();
	}

	@Override
	public String next() {
		return ar.get(currentPosition++);
	}
	
}

class IterableClass implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		return new IteratorInterfaceClass();
	}
	
}
