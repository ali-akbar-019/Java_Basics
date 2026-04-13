package day_16;


class BankAccount{
	int id;
	double balance;
	
	public int withdraw() {
		return 0;
	}
	public void deposit()
	{
		
	}
}

class ThreadTransfer extends Thread{
	BankAccount fromAccount;
	BankAccount toAccount ;
	public ThreadTransfer(BankAccount fromAccount, BankAccount toAcccount){
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}
	public void run() {
		try {
			synchronized(fromAccount) {
				synchronized(toAccount) {
					System.out.println("Aquired from 'fromAccount' to 'toAccount'");
					int withD= fromAccount.withdraw();
					Thread.sleep(100);
					toAccount.deposit();
				}
			}
		}catch(Exception e) {
			
			
		}finally {
			
		}
	}
}
public class Task_02 {
	public static void main(String args[]) throws InterruptedException{
		BankAccount fromAccount = new BankAccount();
		BankAccount toAccount = new BankAccount();
		ThreadTransfer t1= new ThreadTransfer(fromAccount, toAccount);
		ThreadTransfer t2= new ThreadTransfer(fromAccount, toAccount);
		t1.start();
		t2.start();
		Thread.sleep(2000);
		t1.join();
		t2.join();
	}
}
