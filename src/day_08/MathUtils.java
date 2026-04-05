package day_08;

public class MathUtils {
	//
	public static int square(int n) {
		return n*n;
	}
	public static void main(String args[]) {
		int n = 2;
		int sq = MathUtils.square(n);
		System.out.println("n = " + n + " square = " + sq);
	}
}
