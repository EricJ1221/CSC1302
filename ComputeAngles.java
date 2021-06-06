//Eric Oliver, 6/6/2021
//how to compute the angles of a triangle with only points (x,y)

import java.util.Scanner;

public class ComputeAngles {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //prompt the user to enter in the three points
      System.out.println("Enter three points: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      
      System.out.println("The first point is: " + x1 + ", " + y1);
      System.out.println("The second point is: " + x2 + ", " + y2);
      System.out.println("The third point is: " + x3 + ", " + y3);
      
      //compute the three sides
      double a = Math.sqrt((x2-x3)*(x2-x3) +(y2-y3)*(y2-y3));
      
      double b = Math.sqrt((x1-x3)*(x1-x3) +(y1-y3)*(y1-y3));
      
      double c = Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
      
      System.out.println("The length of side a: " + a);
      System.out.println("The length of side b: " + b);
      System.out.println("The length of side c: " + c);
      
      
      //compute three angles
      double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)/(-2 * b * c)));
         System.out.println("Angle A: " + A + " degrees.");
      double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)/(-2 * a * c)));
         System.out.println("Angle B: " + B + " degrees.");
      double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)/(-2 * a * b)));
         System.out.println("Angle C: " + C + " degrees.");
      
      //Display the results
      System.out.println("The three angles are " + Math.round(A * 100)/100.0 + " " + Math.round(B * 100)/100.0 + " " + Math.round(C * 100)/100.0);
 
      
   }
}