package day_14;

import java.util.HashMap;

public class Question_05 {
	public static void main(String args[]) {
//		Q5. Create a HashMap of 5 products and their prices. Iterate through it and print only the products whose price is above 500.
		HashMap<String, Integer> mp = new HashMap<String , Integer>();
		mp.put("Item 1", 1000);
		mp.put("Item 2", 2000);
		mp.put("Item 3", 3000);
		mp.put("Item 4", 000);
		mp.put("Item 5", 100);
		
		//
		for(String k: mp.keySet()) {
			int val = mp.get(k);
			if(val > 500) {
				System.out.println(k + "->" + mp.get(k) );
			}
			
		}
		
	}
}
