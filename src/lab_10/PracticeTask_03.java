package lab_10;

import java.util.Scanner;

class InvalidMarksException extends Exception {
	public InvalidMarksException(String message) {
		super(message);
	}
}

public class PracticeTask_03 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		try {
			// array that will hold the student marks
			int[] studentMarks = inputMarks(scanner);
			// validate the student marks
			validateMarks(studentMarks);
			// calculate the averate
			double marksAverage = calculateAverage(studentMarks);
			// print the out
			printMarksAndAverage(studentMarks, marksAverage);
		} catch (InvalidMarksException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid Input");
		} finally {
			System.out.println("Program Excuted Successfully.");
			scanner.close();
		}
	}

	// input the marks of the student
	public static int[] inputMarks(Scanner scanner) {
		int[] marks = new int[3];
		System.out.println("Marks for 3 Subjects");

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter the marks for the " + (i + 1) + " Subject");
			marks[i] = scanner.nextInt();
		}
		return marks;

	}

	// validate the marks
	public static void validateMarks(int[] marks) throws InvalidMarksException {
		// check all the marks
		for (int mark : marks) {
			if (mark < 0 || mark > 100) {
				throw new InvalidMarksException("Marks Can only be in the range (0 - 100). Found: " + mark);
			}
		}
	}

	// calculate the average
	public static double calculateAverage(int[] marks) {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		return (double) total / marks.length;
	}

	// print all the info
	public static void printMarksAndAverage(int[] marks, double average) {
		System.out.println("Marks of the student");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}
		System.out.println();
		// average
		System.out.println("Average: " + average);
	}
}
