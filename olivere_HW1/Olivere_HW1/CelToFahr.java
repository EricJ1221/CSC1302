// Eric Oliver, Olivere, 5/22/2021, This program will convert temperatures from degrees Celsius to degrees Fahrenheit.

import java.util.Scanner;

public class CelToFahr {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter a degree in Celsius");
 
      double celsius = input.nextDouble();
   
      double fahrenheit = (1.8 * celsius + 32);

      System.out.println("My name is Eric Oliver");
      System.out.print( celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
   
   }
}