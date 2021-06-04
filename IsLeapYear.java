//calculate a leap year

import java.util.Scanner;

public class IsLeapYear {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
         int year = input.nextInt();
         
         boolean isLeap = ((year % 4 == 0) && !(year % 100 != 0)) || (year % 400 == 0); 
         
         if (isLeap) {
            System.out.println("The " + year + " is a leap year");
         }
         else{
            System.out.println("The " + year + " 2000is NOT a leap year");
         }        
      }
  }

   