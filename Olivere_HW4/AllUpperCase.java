//Eric Oliver, Olivere, 6/13/2021
//This program will ask the user for inputs and convert them to all upper case letters, regardless of the case inputted, until the user types "STOP in any case.

import java.util.Scanner;

public class AllUpperCase{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a word (or STOP) to stop the program.");
      String a = s.nextLine().toUpperCase();
      System.out.println(a);
      
      while(!(a.equalsIgnoreCase("stop"))){
         System.out.println("Enter a word (or STOP) to stop the program.");
         a = s.nextLine();
         System.out.println(a);     
      }
      System.out.println("You have entered all the words.");
   }
}




