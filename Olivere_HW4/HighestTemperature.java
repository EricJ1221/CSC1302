//Eric Oliver, Olivere, 6/14/21
//This program prompts the user to enter the number of temperatures to be entered, the individual temperatures themselves, and will determine the highest temp out of all the inputs.

import java.util.Scanner;

public class HighestTemperature{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Temperatures to be entered:");
      int num = input.nextInt();
      int highTemp = 0;
      int temps;
      
      for(int count = 1; count <= num; count++){
         System.out.print("Enter a temperature: " + count + " ");
         temps = input.nextInt();
         if(temps > highTemp)
           highTemp = temps;
      }      
      System.out.println("The highest temperature entered is " + highTemp);
   }
}