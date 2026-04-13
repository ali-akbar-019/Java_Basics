package day_16;
import java.util.concurrent.Semaphore;



class Printer{
	void printPage() {
		System.out.println("Printing .....");
	}
}
class SharedResourcePrinter{
	Printer pt1 = new Printer();
	Semaphore sem  = new Semaphore(3); //only three printer
	
	public void accessResource(String name) {
		try {
			sem.acquire();
			System.out.println(name + " is accessing the printer");
			Thread.sleep(1000);
			System.out.println(name +" has done its work");
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}finally {
			System.out.println(name + "has left the printer");
			sem.release();
		}
	}
	
}
class Student extends Thread{
	String name;
	SharedResourcePrinter pt;
	Student(String name, SharedResourcePrinter pt){
		this.name = name;
		this.pt = pt;
	}
	public void run() {
		pt.accessResource(name);
		
	}
}
public class Task_01 {
	public static void main(String args[]) throws InterruptedException {
		SharedResourcePrinter pt = new SharedResourcePrinter();
		Student st1 = new Student("ALi",pt);
		Student st2 = new Student("ALi 2",pt);
		Student st3 = new Student("ALi 3",pt);
		Student st4 = new Student("ALi 4",pt);
		System.out.println("st1 state -> " + st1.getState());
		System.out.println("st2 state -> " + st2.getState());
		System.out.println("st3 state -> " + st3.getState());
		System.out.println("st4 state -> " + st4.getState());
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		System.out.println("st1 state -> " + st1.getState());
		System.out.println("st2 state -> " + st2.getState());
		System.out.println("st3 state -> " + st3.getState());
		System.out.println("st4 state -> " + st4.getState());
		st1.join();
		st2.join();
		st3.join();
		st4.join();
		System.out.println("st1 state -> " + st1.getState());
		System.out.println("st2 state -> " + st2.getState());
		System.out.println("st3 state -> " + st3.getState());
		System.out.println("st4 state -> " + st4.getState());
	}
	
	
	
}
