package day_14;
import java.util.ArrayList;
import java.util.Iterator;
public class Question_02 {
//Q2. Create an ArrayList of numbers, iterate through it using a for-each loop and print only the even numbers.
	public static void main(String args[]) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(23);
		arr.add(30);
		arr.add(42);
		arr.add(53);
		arr.add(64);
		for(int num: arr) {
			if(num % 2==0) {
				System.out.println(num);
			}
		}
		
		//we could also use an iterator to print the content
		Iterator it = arr.iterator();
		System.out.println("Using iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
