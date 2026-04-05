package day_07;

public class Student {
	String name;
	int age;
	int marks;
	public Student(String name, int age, int marks){
		this.name = name;
		this.age =age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	//display method
	public void displayInfo() {
		System.out.println("Name = " +name);
		System.out.println("Age = " +age);
		System.out.println("Marks = " +marks);
	}
}
