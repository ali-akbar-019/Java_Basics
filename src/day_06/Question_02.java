package day_06;

public class Question_02 {
	public static void main(String args[]) {
		String word = "ali akbar";
		String ch = "k";
		//lets suppose we are looking for 'k'
		if(word.contains(ch)) {
			System.out.println("Yes K is present");
			//now replacing it 
			System.out.println("Replacing 'k' with 'q'");
			word = word.replace('k', 'q');
			System.out.println("new string = " + word);
			
		}else {
			System.out.println("'k' is not present. So we can not replace it");
		}
	}
}
