package customerDiscount;
import java.util.Scanner;
public class OnSeason extends OffSeason {
    public double discount() {
        double onDisc = 0.40;
        return onDisc;
    }

    public void calculateTotalPacakage() {
    	double totalAmount;//variable declared to calculate total package
    	 Scanner sc = new Scanner(System.in);//scanner class object created to take user input
         System.out.println("Enter the season you are purchasing clothes  OFFSEASON or ONSEASON");
         String season = sc.nextLine();
         
         if (!season.equals("ONSEASON") && !season.equals("OFFSEASON")) {
             System.out.println("Invalid season");
             System.out.println("season should be either in  OFFSEASON or ONSEASON");
             return; // Exit the program if the season is invalid
         }
         System.out.println("Enter the price of package");
         double pack = sc.nextDouble();
         
         if (season.equals("ONSEASON")) {
             totalAmount = pack * (1 - discount()); 
             System.out.println("Total package amount is " + totalAmount);
         } else {
             totalAmount = pack * (1 - super.discount()); 
             System.out.println("Total package amount is " + totalAmount);
         }
     }
    
    public static void main(String[] args) {
        
        OnSeason onSeason = new OnSeason();
        onSeason.calculateTotalPacakage();
}}

