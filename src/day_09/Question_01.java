package day_09;

class Printer{
	void print(int a , int b) {
		System.out.println("num1 = " +a);
		System.out.println("num2 = " +b);
	}
	void print(int a , double b) {
		System.out.println("num1 = " +a);
		System.out.println("num2 = " +b);
	}
	void print(double a , int b) {
		System.out.println("num1 = " +a);
		System.out.println("num2 = " +b);
	}
	void print(double a , double b) {
		System.out.println("num1 = " +a);
		System.out.println("num2 = " +b);
	}
	void print(String a , String b) {
		System.out.println("num1 = " +a);
		System.out.println("num2 = " +b);
	}
}
public class Question_01 {
	public static void main(String args[]) {
		Printer p = new Printer();
		p.print(1,2);
		p.print(1,2.2);
		p.print(1.2,2);
		p.print(1.3,2.3);
		p.print("ali", "akbar");
	}
}
