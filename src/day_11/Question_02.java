package day_11;


interface BankOperations{
	//method
	void deposit();
	void withdraw();
	double getBalance();
	
}

//
class SavingAccount implements BankOperations{
	//implement the methods in here
	public void deposit() {
		System.out.println("deposit method in the SavingAccount");
	}
	public void withdraw() {
		System.out.println("withdraw method in the SavingAccount");
	}
	public double getBalance() {
		System.out.println("getBalance method in the SavingAccount");
		return 2.32;
	}
}

public class Question_02 {
	public static void main(String args[]) {
		SavingAccount sv = new SavingAccount();
		sv.deposit();
		sv.withdraw();
		sv.getBalance();
	}
}
