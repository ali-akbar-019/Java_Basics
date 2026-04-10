package day_14;

import java.util.HashSet;

public class Question_03 {
//	Q3. Create a HashSet of 6 numbers including some duplicates. Print the set and observe that duplicates are automatically removed.
	public static void main(String args[]) {
		HashSet<Integer> ht = new HashSet<Integer>();
		ht.add(1);
		ht.add(1);
		ht.add(1);
		ht.add(1);
		ht.add(1);
		ht.add(1);
		ht.add(2);
		ht.add(4);
		ht.add(6);
		//now print
		//we can use an enhanced for loop in here
		for(int num: ht) {
			System.out.print(num + " ");
		}
		if(ht.contains(2)) {
			System.out.println("\n"+2 + " is present");
		}
	}
}
