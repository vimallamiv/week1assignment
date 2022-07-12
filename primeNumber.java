package week1.assignment;

public class primeNumber {
         public void name() {
			int num=13;
			boolean flag = false;
			for(int i = 2;i <= num / 2; i++) {
				if (num % i == 0) {
					flag=true;
					break;
				}
				
		}
			if(flag ==false) {
				System.out.println("is prime number");
			}
			else {
				System.out.println("not a prime number");
			}
         }
}
