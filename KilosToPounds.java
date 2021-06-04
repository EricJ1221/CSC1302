//Eric Oliver, Olivere, 5/22/2021, This program will convert kilos to pounds.

import java.util.Scanner;

public class KilosToPounds {
   public static void main(String[] args) {
      
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a number for kilograms: ");
  
     
      double kilograms = input.nextDouble();
      
      double pounds = kilograms * 2.20462;
      
      System.out.println("My name is Eric Oliver");
      System.out.print(kilograms + " kilograms is " + pounds + " pounds.");
      
   }
}
