package day_09;


class Animal{
	//method
	void sound() {
		System.out.println("Animal Sound ...");
	}
}
class Dog extends Animal{
	//
	void sound() {
		System.out.println("Dog Sound ...");
	}
}
class Cat extends Animal{
	//
	void sound() {
		System.out.println("Cat Sound ...");
	}
}
public class Question_05 {
	public static void main(String args[]) {
		Animal d1 = new Dog();
		Animal c1 = new Cat();
		d1.sound();
		c1.sound();
	}
}
