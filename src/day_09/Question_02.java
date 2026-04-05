package day_09;

class Shape{
	void area() {
		System.out.println("Calculating area...");
	}
}
class Circle extends Shape{
	void area() {
		System.out.print("Actual area...");
	}
}
public class Question_02 {
	public static void main(String args[]) {
		Shape cr = new Circle();
		cr.area();
	}
}
