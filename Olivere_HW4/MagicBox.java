//Eric Oliver, Olivere, 6/13/2021
//This program will prompt the user to input how many rows, columns and what symbol they would like their magic box to be printed in and then output said magic box.

import java.util.Scanner;

public class MagicBox{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many rows would you like in your box? ");
      int x = input.nextInt();
      
      System.out.println("How many columns would you like in your box? ");
      int y = input.nextInt();
      input.nextLine();
      
      System.out.println("What symbol would you like in your box? ");
      String z = input.nextLine();
      System.out.println("Here comes the magic...");
      System.out.println("Here is your magic box!!");
      System.out.println("");
      
      for (int j = 0; j < x; j++){
        for(int i = 0; i < y; i++){
          System.out.print(z + " ");
      }
      System.out.println("");                         
      }
      
      
      
      System.out.println("");
      System.out.println("This magic box brought to you by Eric Oliver.");
   }
}

