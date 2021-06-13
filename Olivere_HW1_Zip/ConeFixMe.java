//Eric Oliver, Olivere, 5/23/2021, I will be correcting any syntax errors present in this program.

import java.util.Scanner;

public class ConeFixMe {
   public static void main(String[] args) {
   
      System.out.println("This program was corrected by Eric Oliver.");
      
      // Get input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value for the radius: ");
      double radius = input.nextDouble();
      System.out.print("Enter a value for the height: ");
      int height = input.nextInt();
      
      final double PI = 3.14159;
      
      // calculate slant using Pythagorean theorem
      double hypotenuse = Math.sqrt((radius * radius + height * height));
      
      // calculuate volume
      double volume = ( PI * radius * radius * ((height)/3));
      
      // calculuate lateral area
      double latArea = (PI * radius * hypotenuse);
      
      // calculuate surface area
      double surArea = (PI * radius *(hypotenuse + radius));
      
      // display input
      System.out.println("Cone Measurements");
      System.out.println("radius: " + height);
      System.out.println("height: " + radius);
      System.out.println("slant: " + hypotenuse);
      
      // output results
      System.out.println("Volume = " + volume);
      System.out.println("Lateral Area = " + latArea);
      System.out.println("Surface Area = " + surArea);
      
      // check your answer here:
      // https://www.calculatorsoup.com/calculators/geometry-solids/cone.php
    } //end main
}    
    
    
