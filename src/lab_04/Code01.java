package lab_04;

class Counter {
	private int counter;

	Counter() {
		this.counter = 0;
	}

	//
	/*
	 * void increment() { counter++; }
	 */
//	synchronized version
	synchronized void increment() {
		counter++;
	}

	int getCounter() {
		return counter;
	}
}

public class Code01 {
	public static void main(String args[]) {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100000; i++) {
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 100000; i++) {
				c.increment();
			}

		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getLocalizedMessage());
		}
//		check the final counter value
		System.out.println("Final Counter Value: " + c.getCounter());

	}
}
