import java.util.Scanner;
	
	public class Digit {
    	public static void main(String[] args) {

    	Scanner input = new Scanner (System.in);
    	System.out.println("Choose any 3 digit number");
    		int digits = input.nextInt();
    	System.out.println("The sum is " + sumDigits(digits));
		 }
		  public static int sumDigits(long n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}

}