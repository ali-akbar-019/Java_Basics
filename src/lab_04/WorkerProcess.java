package lab_04;

public class WorkerProcess {
	public static void main(String args[]) {
		long sum = 0;
		for (int i = 0; i < 10000; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
	}
}
