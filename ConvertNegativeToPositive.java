package week1.assignment;

public class ConvertNegativeToPositive {
     //to convert negative number to positive number.
	public static void main(String[] args) {
		int num = -40;
		System.out.println("number give" + num);
		//conditions
		if (num < 0) {
			num = -num;
			System.out.println("converted positive number is"+ num);
			
		}
		else {
			 System.out.println("given number is positive number");
		}
	}
}
     
     