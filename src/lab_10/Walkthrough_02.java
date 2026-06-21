package lab_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Walkthrough_02 {
	public static void main(String args[]) {
		try {
			Scanner inputTaker = new Scanner(System.in);
			System.out.println("Enter the first Number");
			int firstNumber = inputTaker.nextInt();
			System.out.println("Enter the second Number");
			int secondNumber = inputTaker.nextInt();
			//
			double result = (double) firstNumber / secondNumber;
			System.out.printf("%d / %d = %.2f%n", firstNumber, secondNumber, result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Can not divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("Error: Please provide valid input");
		}
	}
}
