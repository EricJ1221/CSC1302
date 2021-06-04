//MultiwayIfElse, had some trouble with this, need to do quiz and read chapter 3, 5/26/2021

import java.util.Scanner;

public class MultiwayIfElse {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a score: ");
      double score = input.nextDouble();
      
      if (score >= 90.0){
         System.out.println("A");
      }
      else {
         if(score >= 80.0){
            System.out.println("B");
         }
         else {
            if(score >= 70.0){
               System.out.println("C");
            }
            else {
               if(score >= 60.0) {
                  System.out.println("D");
               }
               else {
                  System.out.println("F");
               }
            }
         }
      }
   }     
}