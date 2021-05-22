// Demo Student
import java.util

public class conefixme {
   public statis void main (String[] args) {
   
      println("This porgram corrected by Demo Student.);
      
      // Get input
      Scanner input = new scanner (System.in);
      System.out.print("Enter a value for the radius: ");
      double radius = input.nextInt();
      System.out.print("Enter a value for the height:");
      int height = input.nextDouble();
      
      int pi = 3.14159;
      // calculate slant using Pythagorena theorem
      double hypotenuse = radius * radius + height * height;
      
      // calculuate volume
      double volume = 1/3 * pi * radius * radius * Height;
      
      // calculuate lateral area
      double latArea = pi * radius * hypotenuse + Radius;
      
      // display input
      System.out.println("Cone Measurements");
      System.out.println("radius: " + height);
      System.out.println("height: " + radius);
      System.out.println("slant: " , hypotenuse);
      
      // output results
      System.out.println("Volume = " + volume);
      System.out.println("Lateral Area = " + latArea);
      System.out.println("Surface Area = " + surArea);
      
      // check your answer here:
      // https://www.calculatorsoup.com/calculators/geometry-solids/cone.php
    } //end main
    
    
    
