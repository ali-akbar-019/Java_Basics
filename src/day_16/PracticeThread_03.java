package day_16;
import java.util.concurrent.Semaphore;



class SharedResource{
	static Semaphore s = new Semaphore(2); //allow two threads at a time
	void accessResource(String name) {
		
		try {
			s.acquire();
			System.out.println(name+" is accessing the resource");
			Thread.sleep(2000);
			System.out.println(name +" is leaving the resource");
		}catch(InterruptedException e) {
			System.out.println(e.getStackTrace());
		}finally {
			s.release();
		}
			
		
	}
}
class ThreadDemo2 extends Thread{
	SharedResource s = new SharedResource();
	String name;
	public ThreadDemo2(SharedResource s , String name){
		this.s =s ;
		this.name = name;
	}
	public void run () {
		s.accessResource(name);
	}
}
public class PracticeThread_03 {
	public static void main(String args[]) throws InterruptedException {
		SharedResource obj = new SharedResource();
		ThreadDemo2 t1 = new ThreadDemo2(obj , "Thread 1");
		ThreadDemo2 t2 = new ThreadDemo2(obj, "Thread 2");
		ThreadDemo2 t3 = new ThreadDemo2(obj , "Thread 3");
		ThreadDemo2 t4 = new ThreadDemo2(obj, "Thread 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
		
	}
}
