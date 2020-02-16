import java.util.Scanner;
	
	public class url {
    	public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    System.out.println("Enter the Web adress");
    	String adress= input.nextLine();

    
    System.out.println("Veryfing an URL with " + adress.length() + " characters");
    System.out.println("Is this a valid and secure URL? " + adress.startsWith("https://"));
    
    }
}