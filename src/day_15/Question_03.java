package day_15;

class Vehicle{
	//
	void drive() {
		System.out.println("Car is driving...");
	}
	
}
class Car extends Vehicle{
//	
	void playMusic() {
		System.out.println("Playing the music...");
	}
}
//

public class Question_03 {
	public static void main(String args[]) {
//		Q3. Create a class Vehicle with a method drive() and a child class Car with a method playMusic(). 
//		Upcast a Car object to Vehicle, then downcast it back and call both methods.
		Vehicle c=  new Car();
		c.drive();
		//downcasting
		Car c2 = new Car();
		c2.playMusic();
		c2.drive();
	}
}	
