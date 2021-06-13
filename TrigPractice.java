//Eric Oliver, 6/6/2021
//practicing trig functions

import java.util.Scanner;

public class TrigPractice{
   public static void main(String[] args){
      //Scanner input = new Scanner(System.in);
      System.out.println("Enter a value for x in degrees: "); //prompt user for degrees
      //int x = input.nextInt();   //decalre and intialize variable for degrees
      //double x = input.nextDouble();
      final double PI = 3.14159; // declare a constant for pI or use Math.pi
      double radians = Math.toRadians(x);  //convert degrees to radians because the trig functions only accept radians
                                       // if not the functions will give out wrong answers
                                       
      System.out.println("Math.sin(radians): " + Math.sin(radians));
      
      System.out.println("Some common sin functions..");
      System.out.println("Math.sin(Math.PI/2): " + Math.sin(Math.PI/2));
      System.out.println("Math.sin(Math.PI/4): " + Math.sin(Math.PI/4));
      System.out.println("Math.sin(Math.PI/6): " + Math.sin(Math.PI/6));
      
      System.out.println("Some common cos functions..");
      System.out.println("Math.cos(Math.PI/2): " + Math.cos(Math.PI/2)); // these are wrong because they arent' in radians
      System.out.println("Math.cos(Math.PI/4): " + Math.cos(Math.PI/4));
      System.out.println("Math.cos(Math.PI/6): " + Math.cos(Math.PI/6));
      
      double rads2 = Math.toRadians(Math.PI/2);
      double rads6 = Math.toRadians(Math.PI/6);
      
      System.out.println("Math.cos(Math.toRadians(Math.PI/2)): " + Math.cos(rads2));
      System.out.println("Math.cos(Math.toRadians(Math.PI/6)): " + Math.cos(rads6));
      
      
      System.out.println("Math.exp(x): " + Math.exp(x));
      System.out.println("Math.log(x): " + Math.log(x));
      System.out.println("Math.log10(x): " + Math.log10(x));
     
   }
}