//Eric Oliver, Olivere, 6/11/2021


public class CharacterWorksheet{
   public static void main(String[] args){

//Character Worksheet1.
//Declare and assign a char variable called myLetter to z.
      char myLetter = 'z';
         System.out.println(myLetter);

//2.Write a Java statement that makes myLetter uppercase.
      myLetter = Character.toUpperCase(myLetter);
//3.Write a java statement that finds out if myLetter is a digit.
         System.out.println(Character.isDigit(myLetter));

//4.Write a java statement that finds out if myLetter is an upper case letter.
         System.out.println(Character.isUpperCase(myLetter));

//5.Assume myLetter = ‘Z’;What is the output for System.out.print(myLetter++);
         myLetter = 'Z';
            System.out.println(myLetter++);

//6.Assume myLetter = ‘Z’;What is the output for System.out.print(++myLetter);
            System.out.println(++myLetter);

//7.Assume myLetter = ‘Z’;What is the output for System.out.print(myLetter--);

//8.What happens when a data type, like double, is cast into a char? (page 127)
            //must cast from double to int to char

//9.Evaluate the following Java statement:  char c = 90;
         char c = 90;
            System.out.println(c); 
//Hint: Java automatically reads this number 90 as ASCII code 90 and converts it to respective character and stores the value in the variable c. 

//10.What Java method in the Character class lets me know if my character is a letter
         System.out.println(character.isLetter(myLetter));
   
   }
}
