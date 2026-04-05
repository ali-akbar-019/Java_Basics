package day_04;

public class Question_04 {
	public static void main(String args[]) {

		for(int i =1; i <= 20; i++ ) {
			if(i% 3 ==0) {
				continue;
			}else {
				System.out.print(i + " ");
			}
		}
	}
}
