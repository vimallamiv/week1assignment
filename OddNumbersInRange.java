package week1.assignment;

public class OddNumbersInRange {
//to print all odd numbers within given range
	public static void main(String[] args) {
		int start = 1;
		int end = 20;
		int value;
		System.out.println("odd number from 1 to 20 are");
		for (int i =start; i <= end; i++) {
			value = i%2;
			if (value ==1) {
				System.out.println(i);
			}
		}
	}
}
