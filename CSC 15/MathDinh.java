import java.util.Scanner;
/*
name: Tristan Dinh
date: 3/14/2022
program description: This program is a expession evalulator that asks the user to enter an operation and two inputs to get the result they want.
self grade: A, 100% because I met all the requirements
*/
public class MathDinh
{
   
}
/* this part of the code displays the start method which asks the user questions */
class Expression
{
   public static void main(String[] args)
   {
      start();
   }
   /* This part of the code has the scanner for the user, and has the list method which would list all the operands and it asks the user to enter their numbers between 0-9 */
   public static void start()
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("How many times do you want to use the software: ");
      int count = kb.nextInt();
      for(int i = 1; i <= count; i++)
      {  
      list();
      System.out.println();
      System.out.print(" Enter an operand: ");
      String operand = kb.next();
      System.out.print("Enter a number between 0-9: ");
      int numberA = kb.nextInt();
      System.out.print("Enter another number between 0-9: "); 
      int numberB = kb.nextInt();
      int solution = evaluate(numberA,numberB,operand); 
      System.out.println(numberA + " " + operand +" "+ numberB + " = " +solution);
      String A= convertNumToWord(numberA);
      String B= convertNumToWord(numberB);
      String O= convertOpToWords(operand);
      String Sentence = ( A + " " + O + " " + B + " equals "+solution);
      System.out.println(Sentence);
   
      }
   }
  
   public static String convertOpToWords(String operator)
   {
     switch(operator)
      {
        case "*": return "multiply";
        case "/": return "divide";
        case "+": return "addition";
        case "-": return "subtraction";
        case "^": return "exponent";
        case "%": return "modulus";
        default: return "invalid";
     }
   }

/* this part of the code converts the operation and returns it into words */
   public static String convertNumToWord(int a)
   {  
     if(a == 0)
      {return ("zero");
      }
     if(a == 1)
      {return ("one");
      }
     if(a == 2)
      {return ("two");
      }
     if(a == 3)
      {return ("three");
      }
     if(a == 4)
      {return ("four");
      }
     if(a == 5)
      {return ("five");
      }
     if(a == 6)
      {return ("six");
      }
     if(a == 7)
      {return ("seven");
      }
     if(a == 8)
      {return ("eight");
      }
     if(a == 9)
      {return ("nine");
      }
     else{ return("none");
   }
  }
   
 /* this part of the code evaluates the users two inputs into the operand they selected */
   public static int evaluate(int a, int b, String op)
   {
      switch(op)
      { case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "^": return a ^ b;
        case "%": return a % b;    
        default: return 0;                 
   }
  }
/* this part of the code lists all the operations the user can choose from */
   public static void list()
   {
     for(int i = 1; i <= 50; i++)
      System.out.print("-");
      System.out.println("\n  Welcome to Math App");
      System.out.println("  Enter + if Adding");  
      System.out.println("  Enter * if Multiplying");
      System.out.println("  Enter - if Dubtracting");
      System.out.println("  Enter ^ if using an Exponent");
      System.out.println("  Enter / if Dividing");
      System.out.println("  Enter % if using an Modulus");
      for(int o = 1; o <= 50; o++)
      System.out.print("-");
      
   }
}