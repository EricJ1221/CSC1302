//Eric Oliver, Olivere, 6/21/2021
//Practice writing and calling methods that have parameters and return values.

import java.util.Scanner;

public class Task4{
   
   public static double tipPercentage(double dollars){ //When passed a dollar amount (double) for a restaurant bill, returnsthe 20% tip amount
      double tipAmount = dollars *.20;
      return tipAmount;
   }
      
   public static String letterGrade(String grade){ //when passed a letter (char) representing a grade returns the description (String) for their grade
      if(grade.equals("A"))
         return "Excellent";
      else if(grade.equals("B"))
         return "Good";
      else if(grade.equals("C"))
         return "Fair";
      else if(grade.equals("D") || grade.equals("F"))
         return "Poor";
      else
         return "invalid"; 
   }
   
   public static int numberOfVowels(String word){ //when passed a word returns the number of vowels in the word   
      word = word.toUpperCase();
      int length = word.length();
      int vowelCount = 0;
      char y;
      for(int index = 0; index < length; index++){
         y = word.charAt(index);
         if( y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U' || y == 'Y')
            vowelCount++;
      }
      return vowelCount;
   }
   public static void main(String[] args){
      
      System.out.println("Enter a dollar amount for your restaurant bill: ");
      Scanner s = new Scanner(System.in);
      double dollars = s.nextDouble();
      System.out.println(tipPercentage(dollars));
      
      System.out.println("Enter a letter grade for your test score: ");
      Scanner d = new Scanner(System.in);
      String grade = d.nextLine();
      grade = grade.toUpperCase();
      System.out.println(letterGrade(grade));
      
      System.out.println("Enter a word to find the number of vowels it contains: ");
      Scanner e = new Scanner(System.in);
      String word = e.nextLine();
      System.out.println(numberOfVowels(word));
   
   }  
}
