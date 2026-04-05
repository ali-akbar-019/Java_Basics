package day_07;

public class Question_03 {
	public static void main(String args[]) {
		Calculator calc = new Calculator();
		double  num1 = 10.2;
		double num2 = 212.12;
		System.out.println("num1 = "+ num1 +" num2 = "+ num2);
		System.out.println("addition= " + calc.add(num1, num2));
		System.out.println("subtraction= " + calc.subtract(num1, num2));
		System.out.println("multiplication= " + calc.mult(num1, num2));
		System.out.println("division= " + calc.divide(num1, num2));
	}
}
