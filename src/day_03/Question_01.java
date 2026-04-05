package day_03;

import java.util.Scanner;

public class Question_01 {
	public static void main(String args[]) {
		int age;
		//lets take user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		//now lets check the conditions
		if(age >= 18) {
			System.out.println("You are eligible to vote.");
		}else {
			System.out.println("You are not eligible to vote.");
		}
	}
}
