//Eric Oliver, Olivere, 5/29/2021
// This program will generate, store and output the two numbers generated.

public class Problem2_1 {
   public static void main(String[] args){
      int randOne = (int) (0 + Math.random()*(9-0+1));
      int randTwo = (int) (10 + Math.random()*(100-10+1));
      System.out.println(randOne);
      System.out.println(randTwo);
   }
}