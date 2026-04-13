package day_16;
import java.util.concurrent.Semaphore;

//
class Worker extends Thread {
	//
	int id;
	Semaphore sem;
	//
	Worker(int id, Semaphore sem){
		this.id = id;
		this.sem = sem;
	}
	//----------------------------------
	public void run() {
		try {
			sem.acquire(); //lock
			System.out.println(id + " is accessing the resource");
			Thread.sleep(2000);
			System.out.println(id + " is leaving the resouce");
		}catch(InterruptedException e) {
			System.out.println(e.getStackTrace());
		}finally {
			sem.release();
			System.out.println(id + " has left the resource");
			
		}
	}
	
}
public class WalkthroughSemaphore {
	public static void main(String args[]) {
		Semaphore sem = new Semaphore(2);
		for(int i = 1 ; i <= 5; i++) {
			new Worker(i , sem).start();
		}
	}
}
