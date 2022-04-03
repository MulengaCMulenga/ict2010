/**
 * Author      : Mulenga C. Mulenga
 * Description : A simple program that demonstrates String methods
 * Date        : 16th Oct 2021
 * Start Time  : 11:24
 * End Time    : 11:35
 **/
 
 public class Program4
 {
   public static void main(String [] args)
   {
      String fullname = "John Mulenga";
      String mall2 = "Levi Shopping mall";
      
      // mall2 displayed in upper case
      System.out.println(mall2.toUpperCase());
      
      // length of fullname
      System.out.println(fullname.length());
      
      // display the first character in fullname
      System.out.println(fullname.charAt(0));
      
      // display 'Mulenga' only from fullname
      System.out.println(fullname.substring(5,12));
      
      // display 'Shopping' only from mall2
      System.out.println(mall2.substring(5,13));
   }
 }