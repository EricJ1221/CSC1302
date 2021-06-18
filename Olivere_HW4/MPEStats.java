//Eric Oliver, Olivere, 6/14/2021
//This program will prompt the user to input the number of scores to be calculated, the individual scores and will then calculate how many scores were above 70%.

import java.util.Scanner;

public class MPEStats{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("MPE scores to be entered: "); 
      int numScores = input.nextInt();
      int score;
      int totalAbove = 0;
      
      for(int x = 1; x <= numScores; x++){
         System.out.print("Enter score " + x + ": ");
         score = input.nextInt();
         if(score > 70)
            totalAbove++;
            
      }
   System.out.println("MPE pass rate is " + (((float)totalAbove/numScores)*100) + "% (" + totalAbove + " of " + numScores + ") students passed.");
   }
}