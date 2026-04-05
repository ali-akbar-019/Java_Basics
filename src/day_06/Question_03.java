package day_06;

public class Question_03 {
	public static void main(String args[]) {
		String word ="  Hello World  " ;
		System.out.println("Initial word = " + word);
		//
		word = word.trim();
		//
	    String[] arr= word.split(" ");
	    System.out.println(arr[0]);
	    System.out.println(arr[1]);
	}
}
