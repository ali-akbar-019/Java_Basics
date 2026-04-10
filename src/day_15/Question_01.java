package day_15;

class Animal{
	//method
	public void eat() {
		System.out.println("animal is eating");
	}
}
class Dog extends Animal{
//	method
	public void bark() {
		System.out.println("Barking ...");
	}
}

public class Question_01 {
	public static void main(String args[]) {
//		Q1. Create a parent class Animal with a method eat() and a child class Dog with a method bark().
//		Demonstrate upcasting — create a Dog object, upcast it to Animal and show that you can only access eat() and not bark().
		Animal dg = new Dog();
		dg.eat();
		//cant access the bark cz in the animal class there is no bark method
		//if we down cast
		Dog dg1 = (Dog) new Dog();
		dg1.eat();
		dg1.bark();
		
	}
}
