package day_05;

public class Question_03 {
	public static void main(String args[]) {
		int largest = Integer.MIN_VALUE;
		int arr[] = {2,3,4,56,67,4,23,4};
		//
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.print("Largest value in the array is : "+ largest);
	}
}
