//Reading input from the Console

import java.util.Scanner; // Step 1 - Import Scanner Class

public class ReadInputfromConsole{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // Step 2 - Create and object of Scanner type
      
      double radius = input.nextDouble(); // Invoke method using object to read value from console
      
      final double PI = 3.14159; //CONSTNAME for PI, PI will not change
      double area = PI * radius * radius;
      
      System.out.println(area);
      
      
    }
}