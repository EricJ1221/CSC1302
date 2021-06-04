//// Area of circle with input from keyboard

import java.util.Scanner;

public class AreaOfCircleWithInput {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("enter an integer for the radius: ");
      int radius = input.nextInt();
      final double PI = 3.14159;
      double area = radius * radius * PI;
         System.out.println( area );
   }
}