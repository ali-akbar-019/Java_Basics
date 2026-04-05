package day_06;

public class Question_01 {

	public static void main(String[] args) {
		String name = "ali akbar";
		System.out.println("Intial value: "+ name);
		//upper case
		System.out.println("name.toUpperCase() = " + name.toUpperCase());
		//lower case
		System.out.println("name.toLowerCase() = " + name.toLowerCase());
		//reversing it
		//in the string we do not have default reverse method
		String reversed= new StringBuilder(name).reverse().toString();
		//
		System.out.println("Reversed = "+reversed);

	}

}
