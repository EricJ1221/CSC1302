//Eric Oliver, Olivere, 6/8/2021
//This program will ask the user to enter a letter and then determine whether it is a consonant or a vowel.

import java.util.Scanner;

public class VowelOrConsonant{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a letter: ");
      String s = input.nextLine();
      char x = s.charAt(0);
      
         if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') 
            System.out.print( x + " is a vowel.");
         else if(x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
            System.out.print( x + " is a vowel.");
         else if( x == 'b' || x == 'c' || x == 'd' || x == 'f' || x == 'g' || x == 'h' || x == 'j' || x == 'k' || x == 'l' || x == 'm' || x == 'n' || x == 'p' || x == 'q' || x == 'r' || x == 's' || x == 't' || x == 'v' || x == 'w' || x == 'x' || x == 'y' || x == 'z')   
            System.out.println( x + " is a consonant.");
         else if( x == 'B' || x == 'C' || x == 'D' || x == 'F' || x == 'G' || x == 'H' || x == 'J' || x == 'K' || x == 'L' || x == 'M' || x == 'N' || x == 'P' || x == 'Q' || x == 'R' || x == 'S' || x == 'T' || x == 'V' || x == 'W' || x == 'X' || x == 'Y' || x == 'Z')   
            System.out.println( x + " is a consonant.");
         else
            System.out.println( x + " is an invalid input.");
   
   }
}