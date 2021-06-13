//Eric Oliver, Olivere, 5/29/2021, This program will demonstrate a two-way if-else and augmented assignment operator.

import java.util.Scanner;

public class Problem1_2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer that is a multiple of 5: ");
      int multipleOfFive = input.nextInt();
      
      if(multipleOfFive % 5 == 0){
         System.out.println("Input Verified");
      }
      else{
         int numberDiff = (5 - multipleOfFive % 5);
         multipleOfFive += numberDiff;
         System.out.println("Input Corrected");
         System.out.println(multipleOfFive);
      }
   }
}
