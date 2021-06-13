//Eric Oliver, Olivere, 5/25/2021, This program will convert kilograms to pounds.

import java.util.Scanner; //imported our scanner

public class KilosToPoundsRevisited {
   public static void main(String[] args) {
      System.out.println("Enter a number for kilograms: ");
      Scanner input = new Scanner(System.in); //step 2 we created an object
      
      double kilos = input.nextDouble();
      
      double pounds = (kilos*2.20462);
      System.out.println("My name is Eric Oliver");
      System.out.println(kilos + " Kilograms is " + pounds + "pounds.");
   }
}
      
      