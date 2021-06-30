//Eric Oliver, Olivere, 6/21/2021
//Practice writing and calling methods that have no parameters and a return a value.


import java.util.Scanner;

public class Task3{
      
   public static String upperCaseName(){
      System.out.println("Please enter your name: ");
      Scanner input = new Scanner(System.in);
      String s = input.nextLine();
      String d = s.toUpperCase();
      return d;
   }
   
   public static double randomFiveDigit(){
      double a = (Math.random()*100000);
      return ((int)a);
   }
   
   public static int totalLetters(){
      
      int numOfWords = 5;
      Scanner words = new Scanner(System.in);
      System.out.println("Enter 5 words: ");
      int letters = 0;
      String z;
      
      for(int i = 0; i < numOfWords; i++){
         z = words.nextLine();
         letters += z.length();
      }
      return letters;
   }
   public static void main(String[] args){
     
     System.out.println(upperCaseName());
     
    
     System.out.println(randomFiveDigit());
     
     
     System.out.println(totalLetters());
     
   }
} 

   