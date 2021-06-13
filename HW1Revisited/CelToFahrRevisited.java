//Eric Oliver, Olivere, 5/25/2021, This program will convert celsius to fahrenheit.

import java.util.Scanner;

public class CelToFahrRevisited {
   public static void main(String[] args) {
      System.out.println("Enter a degree in Celsius: ");
      Scanner input = new Scanner(System.in);
      double celsius = input.nextDouble();
      double fahrenheit = (1.8 * celsius + 32);
      System.out.println("My Name is Eric Oliver");
      System.out.println("Celsius " + celsius +" is " + fahrenheit + " in Fahrenheit.");
      
   }
}