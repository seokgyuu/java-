package com.java.pratice;

import java.util.HashMap;
import java.util.Map;

public class 창고정리 {

	public static void main(String[] args) {
		String storage[] = {"pencil", "pencil", "pencil","book"};
		int num[] = {2,4,3,1};
		
		Map<String , Integer> itemCounts = new HashMap<>();
		
		for(int i=0; i<storage.length; i++) {
			String item = storage[i];
			int count = num[i];
			itemCounts.put(item, itemCounts.getOrDefault(item, 0)+count);
		}
		String maxItem = "";
		int maxCount = 0;
		for(Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
			String item = entry.getKey();
			int count = entry.getValue();
			if(count > maxCount) {
				maxItem = item;
				maxCount = count;
			}
		}
			System.out.println(maxItem);
	}
	

}
