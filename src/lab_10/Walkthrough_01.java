package lab_10;

public class Walkthrough_01 {
	public static void main(String args[]) {
		int number01 = 5;
		int number02 = 10;
		int number03 = 15;

		// multiply and print result
		printMultiplication(number01, number02, "Result 1");
		printMultiplication(number02, number03, "Result 2");
		printMultiplication(number01, number03, "Result 3");
	}

	public static void printMultiplication(int num1, int num2, String label) {
		int answer = num1 * num2;
		System.out.println(label + " " + answer);
	}
}