package com.codephilosopher.iterator;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Hello", 2);
		hm.put("How", 1);
		hm.put("are", 4);
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("word "+key+" and its count is "+val);
		}
	}

}
