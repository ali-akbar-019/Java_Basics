package day_05;

public class Question_04 {
	public static void main(String args[]) {
		int arr[] = {12,3,45,26,27,2};
		//before reversing
		int n = arr.length;
		for(int i = 0 ; i< n ;i++) {
			System.out.print(arr[i] + " ");
		}
		//reversing logic
		//ill use the two pointer appraoch
		int s = 0;
		int e= n -1;
		while(s <= e) {
			int temp = arr[e];
			arr[e] = arr[s];
			arr[s] = temp;
			s++;
			e--;
		}
		//
		System.out.println("\nAfter Reversing");
		for(int i = 0 ; i< n ;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
