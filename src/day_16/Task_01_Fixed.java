package day_16;

import java.util.concurrent.Semaphore;

class SharedPrinter{
	Semaphore sem = new Semaphore(3);
	void print(String name) {
		try {
			if(!sem.tryAcquire()) {
				System.out.println(name + " is waiting for the printer ....");
				sem.acquire();
			}
			//
			System.out.println(name + " has started printing");
			Thread.sleep(2000);
			System.out.println(name + " has stopped printing");
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}finally {
			System.out.println(name + " is leaving the printer");
			sem.release();
		}
		
	}
	
}
class Student_02 extends Thread{
	SharedPrinter pt;
	String name ;
	boolean isPrinting = false;
	public Student_02(String name, SharedPrinter pt){
		this.pt= pt;
		this.name = name;
	}
	//
	public void run() {
		requestPrint();
		//
		requestPrint(); //simulating handled deadlock situtaion
	}
	
	//
	void requestPrint() {
		if(isPrinting) {
			System.out.println(name + " is alreading printing, Deadlock avoided");
			return;
		}
		//
		isPrinting = true;
		pt.print(name);
		isPrinting= false;
		
	}
	
}
public class Task_01_Fixed {
	public static void main(String args[]) throws InterruptedException {
		SharedPrinter pt = new SharedPrinter();
		Student_02 st1 = new Student_02("ali 1", pt);
		Student_02 st2 = new Student_02("ali 2", pt);
		Student_02 st3 = new Student_02("ali 3", pt);
		Student_02 st4 = new Student_02("ali 4", pt);
		Student_02 st5 = new Student_02("ali 5", pt);
		
		//-----------
		System.out.println("st1 state -> " + st1.getState());
		System.out.println("st2 state -> " + st2.getState());
		System.out.println("st3 state -> " + st3.getState());
		System.out.println("st4 state -> " + st4.getState());
		System.out.println("st5 state -> " + st5.getState());
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		System.out.println("st1 state -> " + st1.getState());
		System.out.println("st2 state -> " + st2.getState());
		System.out.println("st3 state -> " + st3.getState());
		System.out.println("st4 state -> " + st4.getState());
		System.out.println("st5 state -> " + st5.getState());
		Thread.sleep(3000);
		System.out.println("st1 state -> " + st1.getState());
		System.out.println("st2 state -> " + st2.getState());
		System.out.println("st3 state -> " + st3.getState());
		System.out.println("st4 state -> " + st4.getState());
		System.out.println("st5 state -> " + st5.getState());
		st1.join();
		st2.join();
		st3.join();
		st4.join();
		st5.join();
		System.out.println("st1 state -> " + st1.getState());
		System.out.println("st2 state -> " + st2.getState());
		System.out.println("st3 state -> " + st3.getState());
		System.out.println("st4 state -> " + st4.getState());
		System.out.println("st5 state -> " + st5.getState());
		
	}
}
