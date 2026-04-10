package day_15;

class Shape{
//	
}
class Circle extends Shape{

}
class Rectangle extends Shape{

}
public class Question_05 {
	public static void main(String args[]) {
//		Q5. Create a parent class Shape with child classes Circle and Rectangle. Create an array of type Shape and store both Circle and
//		Rectangle objects in it. Loop through and downcast each one to access their specific methods.
		Shape[] arr = new Shape[5];
		arr[0]= new Circle();
		arr[1] = new Rectangle();
		arr[2]= new Circle();
		arr[3] = new Rectangle();
		arr[4]= new Circle();
		
		
		for(Shape sp: arr) {
			if(sp instanceof Circle) {
				Circle c = (Circle) sp;
				System.out.println("is a circle");
				
			}
			if(sp instanceof Rectangle) {
				Rectangle r = (Rectangle) sp;
				System.out.println("Is a Rectanlge");
			}
		}
		
	}
	
}
