package day_06;

public class Question_04 {
	public static void main(String args[]) {
		String str1 = new String("ali akbar");
		String str2 = new String("ali akbar");
		//dono same hi lag rahe ha bazahir
		//lets check them 
		if(str1.equals(str2)) {
			System.out.println("Both the strings are same(using the .equals())");
		}
		if(str1 == str2) {
			System.out.print("Both strings are same(Using the ==  operator)");
		}else {
			System.out.print("Both strings are not the same(Using the ==  operator)");
		}
		//for the .equals it will print equal but for the == it wont print equal
		//because the == check if the objects are same and then checks there values are same
		//but when we use 'new' keyword then we make a new object
		//so the str1 and str2 are not the same objects although there values are same
		//so the .equals will return true
	}
}
