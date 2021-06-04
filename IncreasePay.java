////44/4

import java.util.Scanner;

public class IncreasePay {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int pay = 500;
      int score = input.nextInt();
      if (score >= 90){
         System.out.println(pay * .03 + pay); 
      }
      else{
         System.out.print(pay * .01 + pay);
      }   
   }
}      
