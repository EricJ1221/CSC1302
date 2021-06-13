//Eric Oliver, Olivere, 6/4/2021
//This program will determine the shipping cost of a package based on its weight.

import java.util.Scanner;

public class Problem4{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter the weight of your package: ");
   double x = input.nextDouble();
   
   boolean threeFive = (x > 0)&&(x < 1);
   boolean fiveFive = (x > 1)&&(x <= 3);
   boolean eightFive = (x > 3)&&(x <= 10);
   boolean tenFive = (x > 10)&&(x <= 20);
   
   if(x <= 0)
      System.out.println("Invalid Weight.");
   else if(threeFive)
      System.out.println("Shipping cost of 3.50.");
   else if(fiveFive)
      System.out.println("Shipping cost of 5.50.");
   else if(eightFive)
      System.out.println("Shipping cost of 8.50.");
   else if(tenFive)
      System.out.println("Shipping cost of 10.50.");
   else
      System.out.println("The package cannot be shipped");
      
   }
}