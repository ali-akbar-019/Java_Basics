package lab_10;

import java.util.Scanner;

public class StudentResultSystem {
	// for removing the magic numbers
	private static final int GRADE_A = 85;
	private static final int GRADE_B = 70;
	private static final int GRADE_C = 55;
	private static final int GRADE_D = 40;
	private static final int SCHOLARSHIP_THRESHHOLD = 90;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// marks
		int[] marks = inputMarks(scanner);

		// total sum of the marks
		int totalMarks = calculateTotal(marks);
		// get the average of the marks
		double averageMarks = calculateAverage(totalMarks, marks.length);
		// get the grade of the student
		String gradeOfTheStudent = calculateGrade(averageMarks);

		// print all the information
		printStudentInfo(totalMarks, averageMarks, gradeOfTheStudent);
		// print status and scholarship status
		printStatusAndScholarship(gradeOfTheStudent, averageMarks);
		scanner.close();

	}

	// this method is used to get the marks of the students
	public static int[] inputMarks(Scanner scanner) {
		int[] marks = new int[3];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter the Marks for the " + (i + 1) + " subject");
			marks[i] = scanner.nextInt();
		}
		return marks;
	}

	//
	public static int calculateTotal(int[] marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	//
	public static double calculateAverage(int totalMarks, int totalSubjects) {
		return (double) totalMarks / totalSubjects;
	}

	//
	public static String calculateGrade(double marks) {
		if (marks >= GRADE_A) {
			return "A";
		} else if (marks >= GRADE_B) {
			return "B";
		} else if (marks >= GRADE_C) {
			return "C";
		} else if (marks >= GRADE_D) {
			return "D";
		} else {
			return "F";
		}
	}

	//
	public static void printStudentInfo(int totalMarks, double averageMarks, String grade) {
		// print all the information
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Marks: " + averageMarks);
		System.out.println("Grade: " + grade);
	}

	//
	public static void printStatusAndScholarship(String grade, double marks) {

		if (grade == "F") {
			System.out.println("Status: Fail");
		} else {
			System.out.println("Status: Pass");
		}
		//
		if (marks >= SCHOLARSHIP_THRESHHOLD) {
			System.out.println("Scholarship Eligible: Yes");
		} else {
			System.out.println("Scholarship Eligible: No");
		}
	}
}
