//Eric Oliver, Olivere, 6/21/2021

import java.util.Scanner;

public class SecretMessageEncoder{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter me a message to encode: ");
      String message = input.nextLine();
      
      System.out.println("Enter an integer to shift the message by: ");
      int shift = input.nextInt();
      
      System.out.println("The encoded message is: ");
      System.out.print(encode(message, 5));
      
   }
   
   public static String encode(String message, int shift){
      
      message = message.toUpperCase();
      char letter;
      int originalAlphabetPosition;
      int newAlphabetPosition;
      char newCharacter;
      String newMessage = "";
      
      for(int i = 0; i < message.length(); i++){
         letter = message.charAt(i);
         
         if(!(letter == ' ')){
            originalAlphabetPosition = letter - 'A';
            newAlphabetPosition = ((originalAlphabetPosition + shift) % 26);
            newCharacter = (char) ('A' + newAlphabetPosition);
            newMessage += Character.toString(newCharacter);
         }
         else
            newMessage += " ";
            continue;      
      }
      return newMessage;   
   }
}