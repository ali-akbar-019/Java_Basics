package day_14;

import java.util.ArrayList;

public class Question_01 {
//	Q1. Create an ArrayList of 5 student names. Add them, print all, remove one by name, and print the final list.
	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Ali");
		arr.add("Akbar");
		arr.add("Zainab");
		arr.add("Fatima");
		arr.add("Ahsan");
		 //printing all of them
		for(String name: arr) {
			System.out.println(name);
		}
		//removing one
		arr.remove(4);
		System.out.println("Printing After Removing");
		for(String name: arr) {
			System.out.println(name);
		}
	}
	
	
	
}
