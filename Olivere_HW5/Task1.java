//Eric Oliver, Olivere, 6/18/2021
//This program contains two methods with no parameters or return, the first method will allow you to enter words and print each one until "HALT" is entered. After entering "Halt" the word count will be printed.
//The second method will print all the numbers between 100 and 200 that are divisible by 2 and 3 ,but not both.

import java.util.Scanner;

public class Task1 {
   public static void main(String[] args) {
      System.out.println(enterWords());             //I attempted to move the main method below my other methods as you stated in class
      System.out.println(printNumbers());           // but they wouldn't work after I did that. I'm unsure of why it doesnt work for this task but it worked for task 2;
}
   public static void enterWords(){
      int count = 0;
      System.out.println("Enter words or Enter HALT to stop the program and see your output");
      Scanner s = new Scanner(System.in);
      String a = s.nextLine();
      System.out.println(a);
      
      while(!(a.equals("HALT"))){
         System.out.println("Enter words or Enter HALT to stop the program and see your output");
         a = s.nextLine();
         System.out.println(a);
         count++;
      }
      System.out.println(count);
      System.out.println("");
    } 
        
   public static void printNumbers(){
      for(int i = 100; i <= 200; i++){
         if((i % 2 == 0)^(i % 3 == 0))
            System.out.println(i);
      }
   }    
}

