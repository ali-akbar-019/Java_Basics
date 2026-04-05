package day_09;

class Person{
	private String name;
	private int age;
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
	
	void display() {
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
	}
}
public class Question_04 {
	public static void main(String args[]) {
		Person p1 = new Person();
		p1.setName("Ali akbar");
		p1.setAge(22);
		p1.display();
	}
}
