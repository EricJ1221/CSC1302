///display time

import java.util.Scanner;

public class DisplayTime {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter an integer for Seconds: ");
   int seconds = input.nextInt();
   
   int minutes = seconds / 60;
      System.out.println("in " + seconds + " seconds there are " + minutes + " minutes");
   int remainingseconds = seconds % 60;
      System.out.println("and " + remainingseconds + " seconds.");
      
   }
}