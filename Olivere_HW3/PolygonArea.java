//Eric Oliver, Olivere, 6/4/2021
//This program will prompt the user to input a variable for the sides of the polygon and it will accordingly calculate the area of the polygon.

import java.util.Scanner;

public class PolygonArea{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the number of sides: ");
      double n = input.nextDouble();
      
      System.out.println("Enter the length of the sides: ");
      double s = input.nextDouble();
      
      final double PI = 3.1415; 
      double degrees = Math.toDegrees(Math.PI / n);       
      double area = ((n * Math.pow(s, 2))/(4 * Math.tan(radians))); 
      System.out.println("The area of the polygon is: " + area);   
   }
}