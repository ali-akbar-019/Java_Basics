package day_01;

public class question_02 {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int temp;
		//before swapping
		System.out.println("Before Swapping\na = " + a + ", b = " + b);
		//swapping
		temp = b;
		b = a;
		a = temp;
		//after swapping
		System.out.println("After Swapping\na = " + a + ", b = " + b);
		
	}
}
