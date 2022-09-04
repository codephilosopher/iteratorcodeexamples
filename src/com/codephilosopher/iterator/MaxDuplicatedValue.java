package com.codephilosopher.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MaxDuplicatedValue {
	static Map<String, Integer> hm;
	public static void main(String[] args) {
		String[] arr = {"hi", "how", "how", "are", "hi", "hi", "how", "how", "how"};
		MaxDuplicatedValue.getDuplicatedElementsCount(arr);
		MaxDuplicatedValue.printTheMaxValueAndElement();
		
	}
	
	static void getDuplicatedElementsCount(String[] arr) {
		hm = new HashMap<String, Integer>();
		for (String string : arr) {
			if (hm.containsKey(string)) {
				hm.put(string, hm.get(string)+1);
			} else {
				hm.put(string, 1);
			}
		}
	}
	
	static void printTheMaxValueAndElement() {
//		int maxValueInMap=(Collections.max(hm.values()));
//		for (Entry<String, Integer> entry : hm.entrySet()) {  
//            if (entry.getValue()==maxValueInMap) {
//                System.out.println(entry.getKey()+" "+ entry.getValue());
//            }
//        }
		int maxValue = 0;
		String maxKey = "";
		List<String> keyList = new ArrayList<String>(hm.keySet());
		for (int i = 0; i < keyList.size(); i++) {
			String key = keyList.get(i);
		    Integer value = hm.get(key);
		    if (value > maxValue) {
				maxValue = value;
				maxKey = key;
			}
		}
		System.out.println(maxKey+" "+maxValue);
	}

}
