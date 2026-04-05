package day_07;

public class Car {
	String brand;
	String color;
	double speed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//
	//start method
	public void start() {
		System.out.println("Car is starting ...");
	}
	//stop method
	public void stop() {
		System.out.println("Car is stopping ...");
	}
	//
	
	public void display() {
		System.out.println("Brand: "+ brand);
		System.out.println("Color: "+ color);
		System.out.println("Speed: "+ speed);
	}
}
