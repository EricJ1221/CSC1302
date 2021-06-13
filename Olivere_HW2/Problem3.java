//Eric Oliver, Olivere, 5/29/2021
//This program will generate a random number and tell you a corresponding fortune.
import java.util.Scanner;

public class Problem3{
   public static void main(String[] args){
      System.out.println("Please enter your name: ");
      Scanner input = new Scanner(System.in);
      String name = input.next();
      
      int magicNumber = (int)(0 + Math.random()*(7));
      System.out.println("Your magic number is " + magicNumber);
      System.out.println("Here is your fortune, " + name + ":");
      String fortune = "fortune";
      
      if(magicNumber == 0)
         fortune = "A beautiful, smart and loving person will be coming into your life.";
      else if(magicNumber == 1)
         fortune = "A dubious friend my be an enemy in camouflage.";
      else if(magicNumber == 2) 
         fortune = "A faithful friend is a strong defense";
      else if(magicNumber == 3)
         fortune = "A feather in the hand is better than a bird in the air.";
      else if(magicNumber == 4)
         fortune = "a fresh start will put you on your way.";
      else if(magicNumber == 5)
         fortune = "A friend asks only for your time not your money.";
      else if(magicNumber == 6)
         fortune = "None of the snowflakes in an avalanche feel remorse.";
      System.out.println(fortune);  
   }
}