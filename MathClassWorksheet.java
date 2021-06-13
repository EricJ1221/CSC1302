//Eric Oliver, 6/10/2021

public class MathClassWorksheet{
   public static void main(String[] args){



//Math Class Worksheet1.

//True or FalseThe min and max methods in the Math class are not overloaded.
      System.out.println("True");
//2.Write a Java statement that returns the absolute value of -6.3.
      System.out.println(Math.abs(-6.3));
//3.Write a Java statement that returns the square root of 81.
      System.out.println(Math.sqrt(81));
//4.Write a Java statement that returns the value of 9^6.
      System.out.println(Math.pow(9,6));
//5.Write a Java statement that returns the higher value of 6 and 100.
      System.out.println(Math.max(6,100));
//6.Write a Java statement that returns the lower value of 56 and 2.
      System.out.println(Math.min(56,2));
//7.Write a Java statement that returns the natural log of 6.
      System.out.println(Math.log(6));
//8.Write a Java statement that returns 5.6 rounded up to the nearest integer.
      System.out.println(Math.ceil(5.6));
//9.Write a Java statement that returns 5.6 rounded down to the nearest integer.
      System.out.println(Math.floor(5.6));
//10.Write a Java statement that generates a random number between 20 and 30 (excluding 30). That is generate a random x such that 20<=x<30.
      int x = (20 + ((int)Math.random() * 10));
         System.out.println(x);
   }
}