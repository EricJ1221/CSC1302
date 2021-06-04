///BMI calculator practice, Eric Oliver, 5/30/2021
//this program will ask for heigth and weight inputs and determine the BMI of the individual.

import java.util.Scanner;

public class BMIPractice {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your weight: ");   //prompt the user to enter variable
      double pounds = input.nextDouble();                 // store the input as a variable
      
      System.out.println("Enter your heigth: ");
      double inches = input.nextDouble();
      
      final double KILOGRAMS_PER_POUND = 0.45359237; // DECLARE AND INITIALIZE A CONSTANT
      final double METERS_PER_INCH = 0.0254; // Same same ^^^^^^^

      double weight = pounds * KILOGRAMS_PER_POUND;
      double heighth = inches * METERS_PER_INCH;
      double bmi = weight / (heighth * heighth);
      
      System.out.println("Your BMI is : " + bmi);
      if(bmi < 18.5)
         System.out.println("Underweight");
      else if (bmi <= 25.0)
         System.out.println("Normal");
      else if (bmi <= 30.00)
         System.out.println("Overweight");
      else
         System.out.println("Obese");
      
   }
}   