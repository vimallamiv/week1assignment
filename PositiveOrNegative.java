package week1.assignment;

public class PositiveOrNegative {
// to check whether the given number is positive or negative
	
   public static void main(String[] args) {
	int input = 35;
	System.out.println("input given " +input);
	//condition 1
	if (input > 0)  {
		System.out.println("the number given is positive");
	}
	//condition 2
	else if (input < 0) {
		System.out.println("the number given is negative");
	}
	else {
		System.out.println("the number given is neither positive nor negative");
	}
}
   
}
