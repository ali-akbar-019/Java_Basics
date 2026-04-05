package day_06;

public class Question_05 {
	public static void main(String args[]) {
		//
		StringBuilder str = new StringBuilder();
		//i will append ali akbar into the string
		str.append('a');
		str.append('l');
		str.append('i');
		str.append(' ');
		str.append('a');
		str.append('k');
		str.append('b');
		str.append('a');
		str.append('r');
		//printing
		System.out.println(str);
		//reversing it
		System.out.println("Reversed: "+ str.reverse());
	}
}
