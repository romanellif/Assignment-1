import java.util.Scanner;

	public class Trip {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("How many kilometers are you going to travel?");
            int kilometers = input.nextInt();
        System.out.println("What is the average in kilometers your car will run"
         + "on 1 liter of gas?");
            int average = input.nextInt();
        
        double CAD = 1.16;
        int liters = kilometers / average;
        double cost = liters * CAD;

        System.out.println("Your trip is going to cost you on average " + 
        String.format("%.2f", cost) + " Canadian dollars.");
        
    }
    
}
