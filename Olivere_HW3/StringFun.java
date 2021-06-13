
import java.util.Scanner;

public class StringFun {
  public static void main( String args[]){

    String doc = "People assume that time is a strict progression of cause to effect";
           doc+= ", but *actually* from a non-linear, non-subjective viewpoint - ";
           doc = doc + "it's more like a big ball of wibbly wobbly ";
           doc = doc.concat("time-y wimey... stuff.");
       
    System.out.print(doc);
   
    String who = "There's something that doesn't make sense.";    
    int length = who.length();
    System.out.println(who);
    System.out.println("The length of the who string is: " + length);

    char first = who.charAt(0);
    char last = who.charAt(length-1);

    System.out.println("\nThe first letter of the who string is: " + first);
    System.out.println("\nThe last letter of the who string is: " + last);

    //What prints
    System.out.println(first);
    System.out.println(first+last); 
    System.out.println((int)first); 
    System.out.println((int)last);  
    first++;                        
    System.out.println((int)first); 
    System.out.println(first);
    System.out.println(""+first+last);
    System.out.println((char)72);
    System.out.println((char)who.length());
    System.out.println(Character.isDigit(first));
    System.out.println(Character.isLetter(first));
    System.out.println(Character.isUpperCase(first));
    System.out.println(Character.toLowerCase(first));
    System.out.println(first);
    first = Character.toLowerCase(first);
    System.out.println(first);
    System.out.println(who.toUpperCase());
    System.out.println(who);
    who = who.toUpperCase();
    System.out.println(who);


    //Add this string to the string variable who ---> "Let's go and poke it with a stick!"
      who += "Let's go and poke it with a stick!";

    //Print the string variable doc in all UPPERCASE letters without changing the string in doc.
      System.out.println(doc.toUpperCase());

    //Print the length of the doc string
      int docSize = doc.length(); 
      System.out.println("The length of the doc string is " + docSize);
      
    //Assign to a variable the second character of the doc string.
       int second = doc.charAt(1); 
       
    //Assign to a variable the fifth character of the doc string.
       int fifth = doc.charAt(6);
       
    //Print all four characters in this program on one line with no spaces. 
      System.out.print(((char)84) + "" + ((char)46) + "" + ((char)85) + "" + ((char)72));
    




    String quote1 = "Bow ties are cool.";
    String quote2 = "Fezes are cool.";


    System.out.println("\nWhere is the z located in quote2? " + quote2.indexOf('z'));

    System.out.println("\nWhat letter is at position 7 in quote2? "
        + quote2.charAt(7));

    System.out.println("\nWhat prints? " + quote2.substring(4,11)); 

    String s1 = "Don't Blink";
    String s2 = "Spoilers";
    String s3 = "Run you clever boy.";
    String s4 = "Wibbly Wobbly";
    String s5 = "A mad man with a box.";

    System.out.println("\nWhat prints? " + s1.charAt(4) + s2.charAt(6) +
     s3.charAt(s3.length()-7)+ s1.charAt(2) + "z" + s5.charAt(3) +
     s4.charAt(4) + s3.charAt(s3.length()-3) +
     s2.charAt(s2.length()-2) + s3.charAt(10));

    
    
        
    
    //Add the code segment that asks the user if they like Sherlock Holmes.
    Scanner input = new Scanner(System.in);
    System.out.println("Do you like Sherlock Holmes?");
    String s = input.nextLine();
    s = s.toUpperCase();
    boolean isYes = false;
    boolean isNo = false;

    //Print an appropriate response if the user enters yes, no or something else.  
    if(s.equals("YES")){
      System.out.print("Cool, I like Sherlock Holmes too.");
    }
    else if(s.equals("NO")){ 
      System.out.print("What don't you like about Sherlock Holmes?");
    }
    else{
      System.out.print("Not a valid answer, please respond with \"yes\" or \"no\".");
      }
     
    //Hint: watch out for case. (Yes, YES, yes, yEs should all be treated as yes.)

    



  }//end main
}//end class