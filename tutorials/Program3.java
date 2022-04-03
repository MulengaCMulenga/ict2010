/**
 * Author      :  Mulenga C. Mulenga
 * Descripsion :  A simple program on learning error identification
 * Errors      : 
                  1) Line 13 : int b = 15 is not declared a (;) is needed 
                  2) Line 15 : (==) is not the right assignment operator (=) is needed
                  3) Line 16 : (string) must start with a uppercase S, String is a built in class
                  4) Line 16 : The parenthesis are not closed
                  5) Line 17 : (system) must start with uppercase S
**/

public class Program3
{
   public static void main(String [] args)
   {
      int a = 20;
      int b = 15;
      
      double rainfall = a/b; // basic division
      String year = ("The year was: " + a + b); // String concatenation
      System.out.println(year);
   }
}