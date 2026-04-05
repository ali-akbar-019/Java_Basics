package day_02;

public class Question_05 {
	public static void main(String args[]) {
		boolean cond1 = false;
		boolean cond2 = true;
		
		System.out.println("Condition 1 = " + cond1 + " condition 2 = " + cond2);
		//&& operator
		if(cond1 && cond2) {
			System.out.println("Condition 1 && Condition 2");
		}else if(cond1 || cond2) {
			System.out.println("Condition 1 || Condition 2");
		}
		//lets check the not condition
		if(!cond1) {
			System.out.println("!Condition 1, which means condition one is false");
		}
	}
}
