package day_10;

class Animal{
	String name;
	int age;
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	//method
	public void eat() {
		System.out.println(name+ "(ANIMAL) is eating");
	}
}
class Dog extends Animal{
	Dog(String name, int age){
		super(name, age);
	}
	//method
	public void bark() {
		System.out.println("Barking ...");
	}
}


public class Question_01 {
	public static void main(String args[]) {
		Dog dg = new Dog("jake", 1);
		dg.eat();
		dg.bark();
	}
}
