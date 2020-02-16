import java.util.Scanner;
	
	public class Tax {
    	public static void main(String[] args) {

    	Scanner input = new Scanner (System.in);
    	System.out.println("What is the amount in CAD?");
    		double CAD = input.nextDouble();
        System.out.println("How much would you like to tip in percentage?");
            double TIP = input.nextDouble();

    	final double TPS =  0.05;
    	final double TVQ = 0.0975;
    	double TAX = (CAD * TPS) + (CAD * TVQ);
    	double cost = CAD + TAX;
        double tip = cost * (TIP/100); //tips will be calculated with the cost and tax included//
        double finalAmount = CAD + TAX + tip;

    	System.out.println("Your amount with taxes included will be " + cost + " dollars.");
        System.out.println("Your amount with tax and your selected tip amount will be " + finalAmount + " dollars.");
        
    }
}
