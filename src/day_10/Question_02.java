package day_10;

class Vehicle{
	//method
	void display() {
		System.out.println("Vehicle");
	}
}
class Car extends Vehicle{
	//
	void display2() {
		System.out.println("Car");
	}
}

class ElectricCar extends Car{
	
	//
	void display3() {
		System.out.println("ElectricCar");
	}
}
public class Question_02 {
	public static void main(String args[]) {
		ElectricCar ec = new ElectricCar();
		ec.display();
		ec.display2();
		ec.display3();
	}
}
