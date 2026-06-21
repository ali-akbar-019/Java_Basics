package lab_10;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class PracticeTask_02 {
	public static void main(String args[]) {
		int balance = 1000;
		Scanner scanner = new Scanner(System.in);
		// now lets simulate a withdraw scenario
		try {
			System.out.println("Current Balance: " + balance);
			System.out.println("Enter the withdraw amount");
			int amount = scanner.nextInt();
			//
			withdraw(balance, amount); // it will throw exception if the amount is invalid
			balance -= amount;
			System.out.println(amount + " withdrawn Successfully");
			System.out.println("Current Balance: " + balance);
		} catch (InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: Invalid Input");
		} finally {
			System.out.println("Transaction Completed.");
			scanner.close();
		}
	}

	public static void withdraw(int balance, int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException(
					"Your current balance is " + balance + ".\n You can not withdraw: " + balance);
		}
		if (amount <= 0) {
			throw new InsufficientBalanceException("Amount should be greater than 0");
		}
	}
}
