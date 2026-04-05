package day_12;

public class Question_01 {
	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 2;
		int div;
		try {
			div = num1/num2;
			System.out.println(num1 +"/"+num2+" = "+div);
		}catch(ArithmeticException e) {
			System.out.println("Error while diving the two numbers "+e.getMessage());
		}
	}
}
