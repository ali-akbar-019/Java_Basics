package day_04;

public class Question_03 {
	public static void main(String args[]) {
		int number = 10;
		int guessCount = 0;
		//as we dont have to use a scanner so lets just think that the user will enter the number from 1 till he finds the number
		int i = 1;
		do {
			guessCount++;
			if(i == number) {
				System.out.println("Correct!\nYou Guessed the number in "+ guessCount+" tries.");
				break;
			}else {
				System.out.println("Incorrect!");
			}
			i++;
		}while(true);
		
	}
}	
