//Eric Oliver, Olivere, 6/2/2021, this program will use boolean expressions to determine different things about each of the randomly generated numbers.

public class Problem2_2 {
   public static void main(String[] args){
      int randOne = (int) (0 + Math.random()*(9-0+1));
      int randTwo = (int) (10 + Math.random()*(100-10+1));
      //int randOne = 3;
      //int randTwo = 31;
      System.out.println(randOne);
      System.out.println(randTwo);
      
      boolean isOdd = (randOne % 2 != 0)&&(randTwo % 2 != 0);
      System.out.println("Both numbers are odd: " + isOdd);
      
      boolean isEven = (randOne % 2 == 0)&&(randTwo % 2 == 0);
      System.out.println("Both numbers are even: " + isEven);
      
      boolean isEvenOrOdd = ((randOne % 2 == 0 && randTwo % 2 != 0) || (randTwo % 2 == 0 && randOne %2 != 0)); 
      System.out.println("Is one number even and the other number odd: " + isEvenOrOdd);
      
      boolean multOfThree = (randOne % 3 == 0 && randTwo % 3 == 0);
      System.out.println("Are both numbers a multiple of three: " + multOfThree);
      
      boolean oneMultOfThree = (randOne % 3 == 0 || randTwo % 3 == 0);
      System.out.println("Is at least one of the numbers a multiple of three: " + oneMultOfThree);
     
      boolean oneOrOther = ((randOne % 3 != 0 || randTwo % 3 != 0) && (randTwo % 3 == 0 || randOne % 3 == 0)); 
      System.out.println("Is one or the other of the numbers a multiple of three but not both: " + oneOrOther);
         
      boolean firstInSecond = ((randOne == randTwo/10) || (randOne == randTwo % 10));
      System.out.println("Is the first number of the digits in the second number: " + firstInSecond);
      
      boolean uniqueDigits = ((randOne != randTwo % 10) && (randOne != randTwo  / 10 )); 
      System.out.println("Are all of the digits in both numbers unique: " + uniqueDigits);
      
      boolean divisByFour = (randOne % 4 == 0 && randTwo % 4 == 0);
      System.out.println("Are both numbers a multiple of four? " + divisByFour);     
   }
}
