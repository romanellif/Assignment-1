public class Trip {
    public static void main(String[] args) {

    	System.out.println("What is the amount in CAD?");
    		int CAD = input.nextInt();

    	int TPS =  5%;
    	int TVQ = 9.975%;
    	int tax = (TPS + TVQ);
    	int cost = CAD * tax; 

    	System.out.println("Your amount with taxes included will be " + cost + "dollars.");
