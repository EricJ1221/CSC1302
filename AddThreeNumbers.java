//Add Three Numbers     

import java.util.Scanner; //Import Scanner Class

public class AddThreeNumbers {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in); // Create an object of Scanner type
   
   System.out.println("Enter three Integer Numbers: "); // Invoke method using object to read value from console
   int num1 = input.nextInt();
   int num2 = input.nextInt();
   int num3 = input.nextInt();
   
   int sum = num1 + num2 + num3;
   System.out.println("The sum of the numbers are" + sum);
   
   }
}