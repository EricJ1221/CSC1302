//Eric Oliver, Olivere, 6/4/2021
//This program will find the character of an ASCII code from an input between 0 and 127

import java.util.Scanner;

public class ASCIItoCharacter{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter an ASCII code: ");
      int x = input.nextInt();
      
      char ch = (char) x;
      System.out.println(ch);
   }
}