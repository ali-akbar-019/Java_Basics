package day_07;

public class Question_01 {
	public static void main(String args[]) {
		Car car1= new Car(); //they are in the same package so have not to 
		//import it from anywhere
		car1.setBrand("Honda");
		car1.setColor("Red");
		car1.setSpeed(100.123);
		car1.display();
//		call the methods here
		car1.start();
		car1.stop();
		
		
		
	}
}
