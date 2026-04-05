package day_09;


class BankAccount{
	private double balance;
	//setter
	void setBalance(double b) {
		balance = b;
		
	}
	//getter
	double getBalance() {
		return balance;
	}
	
}
public class Question_03 {
	public static void main(String args[]) {
		BankAccount b = new BankAccount();
		b.setBalance(1213.12);
		System.out.print(b.getBalance());
	}
}
