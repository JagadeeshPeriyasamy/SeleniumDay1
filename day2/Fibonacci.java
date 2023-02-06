package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		int firstnum = 0, sum = 0, secondnum = 1;
		System.out.println(firstnum);
		for (int j = 1; j <= 11; j++) {
			sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.println(sum);

		}
	}
}
