//Eric Oliver, Olivere, 6/8/2021
//This program will prompt the user to input two characters, the first (M,C,I) for their Major and the second for their classification (1,2,3,4) and output them as a string.

import java.util.Scanner;

public class StudentMajorAndStatus{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter two characters: ");
      String s = input.nextLine();
      char x = s.charAt(0);
      char y = s.charAt(1);
      
      if( x == 'M' && y == '1')
         System.out.println("Mathematics Freshman.");
      else if( x == 'M' && y == '2')
         System.out.println("Mathematics Sophomore.");
      else if( x == 'M' && y == '3')
         System.out.println("Mathematics Junior.");
      else if( x == 'M' && y == '4')
         System.out.println("Mathematics Senior.");
      else if( x == 'C' && y == '1')
         System.out.println("Computer Science Freshamn.");
      else if( x == 'C' && y == '2')
         System.out.println("Computer Science Sophomore.");
      else if( x == 'C' && y == '3')
         System.out.println("Computer Science Junior.");
      else if( x == 'C' && y == '4')
         System.out.println("Computer Science Senior.");
      else if( x == 'I' && y == '1')
         System.out.println("Information Technology Freshamn.");
      else if( x == 'I' && y == '2')
         System.out.println("Information Technology Sophomore.");
      else if( x == 'I' && y == '3')
         System.out.println("Information Technology Junior.");
      else if( x == 'I' && y == '4')
         System.out.println("Information Technology Senior.");
      else
         System.out.println("Invalid input.");

   }
}