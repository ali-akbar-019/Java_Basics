package day_16;


class MyThread extends Thread{
	public void run() {
		
		for(int i = 1 ; i<= 5;i++) {
			System.out.println("Thread is running..."+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}
public class PracticeThread_02 {
	public static void main(String args[]) throws InterruptedException{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		System.out.println("State of t1 "+t1.getState());
		System.out.println("State of t2 "+ t2.getState());
		//
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("State after running t1 "+t1.getState());
		System.out.println("State after running t2 "+ t2.getState());
	}
}
