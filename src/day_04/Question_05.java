package day_04;

public class Question_05 {
	public static void main(String args[]) {
		for(int i = 1; i <= 100 ;i ++) {
			if(i % 3 == 0 && i % 7 == 0) {
				break;
			}else {
				System.out.print(i + " ");
			}
		}
	}
}
