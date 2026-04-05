package day_11;


abstract class Shape{
	//
	abstract void area();
}
class Cirlce extends Shape{
	//
	public void area() {
		System.out.println("area for the circle");
	}
}
class Rectangle extends Shape{
	//
	public void area() {
		System.out.println("area for the rectanlge");
	}
}
public class Question_01 {
	public static void main(String args[]) {
		Cirlce c = new Cirlce();
		c.area();
		Rectangle r = new Rectangle();
		r.area();
	}
}
