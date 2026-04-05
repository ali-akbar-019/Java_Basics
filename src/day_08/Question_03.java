package day_08;

class Employee{
	String name;
	double salary;
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	//method 
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		
	}
}
public class Question_03 {
	public static void main(String args[]) {
		Employee emp1 = new Employee("ali akbar", 123.123);
		emp1.display();
	}
}
