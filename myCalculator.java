package week1.assignment;

public class myCalculator {

	public static void main(String[] args) {
	
		// creating object for class Calculator
		Calculator cal = new Calculator();
	
		System.out.println("call add method ");
         cal.add(7, 5, 8);
         
         System.out.println("call sub method");
         cal.sub(9, 6);
         
         System.out.println("call multiply method");
         cal.mul(7.0d, 5.0d);
         
         System.out.println("call div method");
         cal.div(12.3f, 4.1f);
	}

}
