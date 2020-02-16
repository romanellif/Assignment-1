import java.util.Random;
	
	public class Number {
    	public static void main(String[] args) {

    Random random = new Random ();
    int start = 0;
    int end = 100;
    int number = random.nextInt(end - start + 1) + start;
    System.out.println("The random number is " + number);
	


    System.out.println(number + " to the power of 2, is equal to = "
    	+ (number*number));
    System.out.println(number + " to the power of 3, is equal to = "
    	+ (number*number*number));
    System.out.println("The squareroot of " + number + " is equal to = "
    	+ Math.sqrt(number));
   	System.out.println("The log of " + number + " is equal to = "
        + Math.log(number));
    System.out.println("The log of " + number + " with a log base of 10, is equal to = "
        + Math.log10(number));
    }
}
