package day_08;

class Counter{
	public static int count =0;
	Counter(){
		count++;
	}
}
public class Question_04 {
	public static void main(String args[]) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		System.out.println("count = "+ Counter.count);
	}
}
