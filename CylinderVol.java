//Eric Oliver, Olivere, 5/23/2021, this program will calculate the volume of a cylinder.

import java.util.Scanner;

public class CylinderVol {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the radius and the length of a cylinder: ");
      
      double radius = input.nextDouble();
      double length = input.nextDouble();
            
      final double PI = 3.14159;
   
      double area = radius * radius * PI;
   
      double volume = area * length;
      
      System.out.println("My name is Eric Oliver");
      System.out.println("The area is " + round(area, 2));
      System.out.println("The volume is " + round(volume, 2));
      
   }
   
   public static double round(double value, int places) {
       if (places < 0) throw new IllegalArgumentException();

       long factor = (long) Math.pow(10, places);
       value = value * factor;
       long tmp = Math.round(value);
       return (double) tmp / factor;   
   }
}