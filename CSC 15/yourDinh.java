/*name: Tristan Dinh
date: 02/28/2022
program description: give the user input to find out their gas and electric car description then follows up with how many hours and cost per car.
self grade: A (100) because I followed the rubric
*/
import java.util.*;
public class yourDinh
{
}
class LabGas 
{
   
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      description();
         
      calculateGasTravel(kb);
      for(int i = 1; i <= 60; i++)
         System.out.print("%");
      System.out.println();   
      calculateElectricTravel(kb);    
   }
   
   /* This part of the code is the formula to show the amount to charge the electric car */
   public static double chargeCost(int stops, double chargeCost)
   {
      return stops * chargeCost;  
   }
   
   /* This part of the code shows how much gas costs for the distance the user inputted */
   public static double gasCost(double distance, double milesPerGallon, double costPerGallon)
   {
      return distance / milesPerGallon * costPerGallon;
   }
   
   /* This part oaf the code shows how to calculate the integer stops */
   public static int stops(double distance, double milesPerCharge)
   {
      return (int) distance / (int) milesPerCharge; 
   }

   /* This part of the code is the formula to show the travelHoursGasCar which we later inputted into another formula and method */
   public static double travelHoursGasCar(double distance , double speed)
   {
      return distance/speed;
   }
   
   /* this part of the code shows the amount of travel hours based on the users input */
   public static double travelHoursWithElectricCar(int stops, double hoursPerStop, double distance, double speed)
   {
      return (stops * hoursPerStop) + (distance / speed); //<-----must be changed
   }
   
   /* This part of the code calculates Gas travel and the overral user input for the gasoline caar */
     public static void calculateGasTravel(Scanner kb)
   {
      System.out.println("\nTraveling with a gas car\n");
      
      //This is the code that is shown to the  user. 
      System.out.print("Enter the total number of the miles you are traveling: ");
      double distance = kb.nextDouble();
      System.out.print("Enter the speed of your car:");
      double speed = kb.nextDouble();
      System.out.print("Enter the miles per gallon:");
      double milesPerGallon = kb.nextDouble();
      System.out.print("Enter the cost per gallon:");
      double costPerGallon = kb.nextDouble();
      System.out.println();
      double temp = travelHoursGasCar(distance,speed);
      System.out.println("\nTraveling with your gas car: ");
      System.out.println("Hours\t\t"+temp);
      //This calculates the gascost based on the users input
      double tempOne = gasCost(distance,milesPerGallon,costPerGallon);
      System.out.println("Cost\t\t"+tempOne);
     
      
   /* this code is shown to user to input the parts of the electric vehicle */    
   }
   public static void calculateElectricTravel(Scanner kb)
   {
      //This is the code that is shown to the user
      System.out.println("\nTraveling with an electric car\n");
      
      System.out.print("Enter the total number of the miles you are traveling: ");
      double distance = kb.nextDouble();
      System.out.print("Enter the speed of your car:");
      double speed = kb.nextDouble();
      System.out.print("Enter the number of miles that you can travel with a fully charged battery:");
      double milesPerCharge = kb.nextDouble();
      System.out.print("Enter the number of hours it takes to charge your car:");
      double hoursPerStop = kb.nextDouble();
      System.out.print("Enter the amount of money you need each time to fully charge the battery of your car:");
      double chargeCost = kb.nextDouble();
      System.out.println();
      double tempTwo = travelHoursWithElectricCar(stops(distance,milesPerCharge),hoursPerStop,distance,speed);
      System.out.println("\nTraveling with your electric car\n");
      System.out.println("Hours of travel\t\t"+tempTwo);
      System.out.println();
      //This code calculates the charge cost from the users input
      double tempThree = chargeCost(stops(distance,milesPerCharge),chargeCost);
      System.out.println("Charge cost\t\t"+tempThree);
      
       
             
   }

   /* This piece of code is shown to the beginning of the code */
   public static void description()
   {
      for(int i = 1; i <= 80; i++)
         System.out.print("%");
      System.out.println();
      System.out.println("I can calculate the cost and the time to travel to your destination ");
      System.out.println("I will provide the information for both gas car and the electric car.");
      System.out.println("Just answer some simple questions"); 
      for(int i = 1; i <= 80; i++)
         System.out.print("%");
      System.out.println();
   
       
   }
    
}