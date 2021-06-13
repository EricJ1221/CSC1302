//Eric Oliver, olivere, 6/11/21
import java.util.Scanner;
public class StringWorksheet{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Declare and assign a string variable, firstName, to your first name.
      String firstName = "Eric";
      //2.Write a Java statement that finds out how many characters are in firstName.
      System.out.println("The length of " + firstName + " is " + firstName.length() + ".");
      //3.Write a Java statement that displays the third character in firstName.
      System.out.println(firstName.charAt(2));
      //4.Declare and assign a string variable, lastName, to your last name.
      String lastName = "Oliver";
      //5.Declare and assign a string variable, fullName, that combines firstName and lastName.
      String fullName = firstName + " " + lastName;
         System.out.println(fullName);
      //6.Write Java statements that will read in your first and last name to a variable called thisName and then check if they are the same thisName to fullName. 
      String thisName = input.nextLine();
         System.out.println(thisName.equalsIgnoreCase(fullName)); 
      //What is the result? Was it what you expected?
      //true
      //7.Write the Java statement that will read in 1 word.
      String word = input.next();
      //8.State the method that will compare two Strings without considering the capitalization.
      System.out.println(firstName.compareToIgnoreCase(lastName));
      //9.Write the Java statement that will see if CSCI1302 ends with 0.
      System.out.println("CSC1302".endswith("0"));
      //10.Write the Java statement that will find the first occurrence of w in the String wormwood.
      System.out.println("wormwood".indexOf('w'));
      //11.Write the Java statement that will find the last occurrence of w in the String wormwood.
      System.out.println("wormwood".lastIndexOf('w'));
   }
}