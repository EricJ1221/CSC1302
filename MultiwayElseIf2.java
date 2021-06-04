// Multiway Else If, the better more concise way, 5/26/2021

import java.util.Scanner;//we have imported our Scanner

public class MultiwayElseIf2{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in); // we have created an object of Scanner type
      
      System.out.println("Enter a score: ");
      double score = input.nextDouble(); /// declared and initialized variable score      
      
      if (score >= 90.0)
         System.out.println("A");
      else if(score >= 80.0)
         System.out.println("B");
      else if(score >= 70.0)
         System.out.println("C");
      else if(score >= 60.0)
         System.out.println("D");
      else 
         System.out.println("F");
   }
}