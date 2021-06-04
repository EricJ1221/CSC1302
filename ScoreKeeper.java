//Eric Oliver, Olivere, 5/31/2021
// this program will demonstrate a m

import java.util.Scanner;

public class ScoreKeeper{
   public static void main(String[] args){
      System.out.println("Beat those \"Kats\" Jacks!");
      int totalWins = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.println("enter an integer for home team: ");
      int homeScore = input.nextInt();
      
      System.out.println("enter an integer for the visiting team: ");
      int visScore = input.nextInt();
      if(homeScore > visScore){
         int totalWinsMax = totalWins++;
         System.out.println("SFA wins!");
         
      }
      System.out.print("Total wins: " + totalWins);
   }
}