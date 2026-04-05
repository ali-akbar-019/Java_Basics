package day_13;

public class Question_02 {
	public static void main(String args[]) {
		//widening
		int number = 10;
		double dNumber = (double)number;
		System.out.println("Widening: "+ dNumber);
		//narrowing
		int nNumber = (int)dNumber;
		System.out.println("Narrowing: "+ nNumber);
	}
}
