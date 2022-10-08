/*
 name:Tristan Dinh
 Date:3/28/2022
 * 
 * 
 * This program performs a "Caesar cipher," which is a shift of characters in
 * a message by a given number of letters.  It provides a crude form of
 * encoding to pass along a secret message.
 * The program serves as an example of Strings and the type char.
 * 
 * Self grade: A, 100% because I met the requirements
 */

import java.util.*;

public class  Module9Dinh  // <---- must change the name of the class to a meaningful name, also add your last name
 {
   public static void main(String[] args) {
       
      start();     //<---------- must change the name method1 to a name of your choice
      //your code    
   }
   /*
   This method displays the menu
   Ask the user to enter the choice
   ask to enter the message
   call the proper method based on the user's choice to encrypt or decrypt the code
   */
   public static void start()  //<------  must change the name method1 tp a meaningful name
   {
    Scanner kb = new Scanner(System.in);
    System.out.print("How many times do you want to use the app: ");
    int count = kb.nextInt();
      for(int i = 1; i <= count; i++)
      {
    menu();
    System.out.println();
     
    
     
   }
}
	/*
	 * Returns a new string with the letters of the given string shifted
	 * forward or backward by the amount equal to the given key.
	 * For example, shift("hello", 3) returns "khoor".
	 */
   
   public static String converter(String s, int key)  //<------ must change the name method2 to a meaningful name
    {
              
      
      return "";  //modify it
   }
   /*
	 * decrypts the encrypted string using the same key value. 
	 * For example, decrypt("khoor", 3) returns "hello".
	 */

   public static String method3(String s, int key) //<----must change the name method3 to a meaningful name
   {
      //your code                	
      return ""; //modify this line
   }
   /*This method displays a menu for the user to choose the option
   refer to the provided output to see the menu*/
   public static void menu()   //<-------  must change the name method4 to a meaningful name of your choice
   {
      for(int i = 1; i <= 50; i++)
      System.out.print("-");
      System.out.println("\nEnter \"Encrypt\" to encrypt your message");
      System.out.println("Enter \"Decrypt\" to decrypt your message");
      for(int o = 1; o <= 50; o++)
      System.out.print("-");

   }


}


