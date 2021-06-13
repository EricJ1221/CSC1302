//Eric Oliver, Olivere, 6/13/2021
//This program will ask the user for inputs and convert them to all upper case letters, regardless of the case inputted.

import java.util.Scanner;

public class AllUpperCase{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a word (or STOP) to stop the program: ");
      String a = input.nextLine().toUpperCase();
      while(a != "STOP"){
         System.out.println(a);
         System.out.println("Enter a word (or STOP) to stop the program: ");
         a = input.nextLine().toUpperCase();
      }
   }
}