//This was an exercise assigned in class to determine the largest of a set of numbers
//without using the Math.max function.
//Eric Oliver, 6/3/2021

import java.util.Scanner;

public class LargestNumber{
   public static void main(String[] args){  
   Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int a = input.nextInt(); 
      System.out.println("Enter a number: ");
      int b = input.nextInt(); 
      System.out.println("Enter a number: ");
      int c = input.nextInt(); 
      if (a > b && a > c){
         System.out.println("The largest number is " + a);
      }
      else if(b > c)
         System.out.println("The largest number is " + b);
      else
         System.out.println("The largest number is " + c);      
   } 
}     
