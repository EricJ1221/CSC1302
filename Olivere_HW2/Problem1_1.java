//Eric Oliver, Olivere, 5/29/2021, In this program I will be demonstrating the use of a multistatement if and the post increment operator.

import java.util.Scanner;

public class Problem1_1 {
   public static void main(String[] args) { 
      Scanner input = new Scanner(System.in);
      System.out.println("Beat those \"Kats\" Jacks!");
   
      int totalWins = 0; 
      System.out.println("Enter home team score: ");  
      int scoreHome = input.nextInt();
      System.out.println("Enter visitor team score: ");
      int scoreVisitor = input.nextInt();
         
         if(scoreHome > scoreVisitor){
            totalWins++;
            System.out.println("SFA wins");  //this if statment will determine if the Home team has outscored the Visiting team. 
      }
      System.out.println("Total number of wins = " + totalWins);
   }
}
