package day_14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Question_04 {
	public static void main(String args[]) {
//		Q4. Create a HashMap with student names as keys and their marks as values. 
//		Print all key-value pairs, get a specific student's marks by name, and remove one entry.
		HashMap<String, Integer> mp = new HashMap<String , Integer>();
		mp.put("Ali", 100);
		mp.put("Akbar", 60);
		mp.put("Zainab", 70);
		mp.put("Ahsan", 80);
		for(String st:mp.keySet()) {
			System.out.println(st + " val->"+ mp.get(st));
		}
		
		//we can also use an iterator
		Iterator it = mp.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
			System.out.println(entry.getKey() +" " + entry.getValue());
			
			
		}
	}
}
