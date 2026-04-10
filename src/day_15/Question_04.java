package day_15;

public class Question_04 {
//
	public static void main(String args[]) {
//		Q4. Demonstrate instanceof keyword — before downcasting check if the object is actually an
//		instance of the child class and only then downcast. Print a proper message if it is not.
		//alr the instanceof just returns true if the obj is the instace of the class
		Dog dg = new Dog();
		if(dg instanceof Dog) {
			System.out.println("Dg is safe to downcast");
		}else {
			System.out.println("Can not downcast to Dog");
		}
	}
}
