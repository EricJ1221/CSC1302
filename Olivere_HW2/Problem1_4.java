//Eric Oliver, Olivere, 5/29/2021
//This program will demonstrate a nested if statment with a basic boolean expression

import java.util.Scanner;

public class Problem1_4 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in); 
      
      System.out.println("Enter a price with decimals: ");
      double price = input.nextDouble();
      
      System.out.println("Enter a whole number rating: ");
      int rating = input.nextInt();

      if(price < 150.00){
         if(rating > 4){
            System.out.println("Book it");
         }
         else{
            System.out.println("Save your money");
         }
      }
      else{
         System.out.println("Save your money");
                 
      }         
   }
}

