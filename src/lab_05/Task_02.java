package lab_05;

class BankAccount {
	public int id;
	double balance;

	public BankAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public synchronized void deposit(double amount) {
		balance += amount > 0 ? amount : 0;

	}

	public synchronized void withdraw(double amount) {
		balance -= amount > 0 ? amount : 0;

	}

}

//class TransferThread extends Thread {
//	BankAccount fromAccount;
//	BankAccount toAccount;
//	double amount;
//
//	public TransferThread(BankAccount fromAccount, BankAccount toAccount, double amount) {
//		this.fromAccount = fromAccount;
//		this.toAccount = toAccount;
//		this.amount = amount;
//	}
//
////	
//	public void run() {
//		synchronized (fromAccount) {
//			System.out.println(getName() + " BY FROM " + " Acquired");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			synchronized (toAccount) {
//				System.out.println(getName() + " BY TO " + " Acquired");
////				
//				fromAccount.withdraw(amount);
//				toAccount.deposit(amount);
//			}
//		}
//	}
//}

class TransferThread extends Thread {
	BankAccount fromAccount;
	BankAccount toAccount;
	double amount;

	public TransferThread(BankAccount fromAccount, BankAccount toAccount, double amount) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}

//	
	public void run() {
		BankAccount firstAccount;
		BankAccount secondAccount;
		if (fromAccount.id < toAccount.id) {
			firstAccount = fromAccount;
			secondAccount = toAccount;
		} else {
			firstAccount = toAccount;
			secondAccount = toAccount;
		}
		synchronized (firstAccount) {
			System.out.println(getName() + " BY FROM " + " Acquired");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (secondAccount) {
				System.out.println(getName() + " BY TO " + " Acquired");
//				
				fromAccount.withdraw(amount);
				toAccount.deposit(amount);
			}
		}
	}
}

public class Task_02 {

	public static void main(String args[]) throws InterruptedException {
		//
		BankAccount b1 = new BankAccount(1, 1000);
		BankAccount b2 = new BankAccount(2, 1000);
		TransferThread t1 = new TransferThread(b1, b2, 500);
		TransferThread t2 = new TransferThread(b2, b1, 500);
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
}
