//Eric Oliver, Olivere, 6/8/2021
//

import java.util.Scanner;

public class StudentMajorAndStatus{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter two characters: ");
      String s = input.nextLine();
      char x = s.charAt(0);
      char y = s.charAt(1);
      
      char 'M' = "Mathematics";
      char 'C' = "Computer Science";
      char 'I' = "Information Technology";
      char '1' = "Freshman";
      char '2' = "Sophomore";
      char '3' = "Junior";
      char '4' = "Senior";  
      
         if((x == 'M' && y == '1') || (x == 'M' && y == '2') || (x == 'M' && y == '3') || (x -- 'M' && y == '4'))
            System.out.println( x + y )
   }
}