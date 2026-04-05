package day_02;

public class Question_03 {
	public static void main(String args[]) {

		int a = 15;
		int b = 4;
		//relational operators
		boolean greater = a > b;
		boolean smaller = a < b;
		boolean equal = a == b;
		boolean notEqual = a != b;
		boolean lessThanEqual = a <= b;
		boolean greaterThanEqual = a>= b;
		//
		//printing all of them
		System.out.println("a = " + a + ", b = " + b);
		//
		System.out.println("a > b = " + greater);
		System.out.println("a < b = " + smaller);
		System.out.println("a = b = " + equal);
		System.out.println("a != b = " + notEqual);
		System.out.println("a <= b = " + lessThanEqual);
		System.out.println("a >= b = " + greaterThanEqual);
		
		
	}
}
