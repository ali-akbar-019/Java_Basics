package day_16;



public class FixedDeadlock {
	Resource r1 =  new Resource();
	Resource r2 = new Resource();

	public void method_01(String name) {
		synchronized(r1) {
			System.out.println(name+ " locked resource 1");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e ) {
				System.out.println(e.getStackTrace());
			}
			synchronized(r2) {
				System.out.println(name+ " locked resource 2");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e ) {
					System.out.println(e.getStackTrace());
				}
			}
		}
	}
	public void method_02(String name) {
		synchronized(r1) {
			System.out.println(name+ " locked resource 1");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e ) {
				System.out.println(e.getStackTrace());
			}
			synchronized(r2) {
				System.out.println(name+ " locked resource 2");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e ) {
					System.out.println(e.getStackTrace());
				}
			}
		}
	}

	public static void main(String args[]) {
		FixedDeadlock s = new FixedDeadlock();
		Thread t1 = new Thread(()->s.method_01("Thread 1"));
		Thread t2 = new Thread(()->s.method_02("Thread 2"));
		t1.start();
		t2.start();
	}
}