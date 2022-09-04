package com.codephilosopher.iterator;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 2);
		hm.put(2, 3);
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key "+key+" and its count is "+val);
			
		}
	}
}