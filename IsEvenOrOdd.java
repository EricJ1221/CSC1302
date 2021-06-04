//Eric Oliver, Oliver, 5/25/2021, This program will determine if a number is even or odd.
//Write a program that checks whether a number is even or odd through the key board.

import java.util.Scanner;

public class IsEvenOrOdd {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in) ;
      
      System.out.println("Enter any integer number :");
      int num = input.nextInt();
    
         if (num % 2 == 0)
         System.out.println("The number you entered is even");
         else
         System.out.println("The number you entered is odd");
      
   }
}