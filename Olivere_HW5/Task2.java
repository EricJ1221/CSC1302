//Eric Oliver, Olivere, 6/19/2021
//This program contains two methods with parameters but no return, one that will allow you to pass an integer whether greater or less than zero and will increment the digit down to zero.
//The second method will allow you to pass a string and output each individual character of said string on a different line.

import java.util.Scanner;

public class Task2{   
    
   public static void intToZero(int input){      
      
      if( input < 0){
         for(int count = input ; count <= 0; count++)
            System.out.println(count);
      }
      if(input > 0){
         for(int count = input ; count >= 0; count--)
            System.out.println(count);
      }
      System.out.println("");
   }
   
   public static void printLetter(String S1){
      int length = S1.length();
            
      for(int index = 0; index < length; index++)
         System.out.println(S1.charAt(index));
   }
   public static void main(String[] args) {
      intToZero(7);
      printLetter("ball");
   }   
}