package day_16;


class ThreadDemo extends Thread{
	public void run() {
		System.out.println("Thread is running");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
public class PracticeThread_01  {
	public static void main(String args[])throws InterruptedException {
		ThreadDemo t = new ThreadDemo();
		System.out.println("State->"+ t.getState());
		t.start();
		System.out.println("State->"+ t.getState());
		Thread.sleep(2000);
		System.out.println("State->"+ t.getState());
		t.join();
		System.out.println("State->"+ t.getState());
	}
}
