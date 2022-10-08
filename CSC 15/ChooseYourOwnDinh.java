/*Name: Tristan Dinh
date: 2/21/2022
Description of what this program does: This program converts gallons to litters in a table.
self grade: A because I met all the requirements in the rubric and provide the correct output and directions from the rubric.
*/
public class ChooseYourOwnDinh 

{
  public static final double GALLON = 3.78;
   
   
   public static void main (String[] args)
   {
  
     methodOne();
     methodTwo();
            
   }
   ////////////////////////////////////////////////////////////
   /* This method provides a description of the app on the screen*/
    
   
    //your code for the method #1
    public static void methodOne()
    {
    
      for(int i = 1; i < 40; i++)
      System.out.print("%");
      System.out.println();
      System.out.println();
      System.out.print("This program converts the gallon to litter");
      System.out.println();
      System.out.print("One gallon is equal to 3.78 litter");
      System.out.println();
      System.out.println();
      for(int i = 1; i < 40; i++)
      System.out.print("%");
    
    }
    
   
   
   
   ////////////////////////////////////////////////////////////////////
   /*This method provides a table that shows the conversion of 1 to 9 gallons to liters.*/
      
     
     //Your code for the method #2
   public static void methodTwo()
   {
     System.out.println();
     System.out.println("Gallon     Litters");
     for(int i = 1; i < 10; i++)
     
     System.out.println(i+ "\t\t\t\t" + (int) (i* GALLON) + "\n");
   
  }
  }