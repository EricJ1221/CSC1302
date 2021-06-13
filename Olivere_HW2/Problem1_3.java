//Eric Oliver, Olivere, 5/29/2021 
//This program will determine whether a random number between -5 and 5 is positive, negative or equal to zero

public class Problem1_3 {
   public static void main(String[] args){
   int rand = (int) (Math.random()*11-5);
      System.out.println(rand);  //added this print statement to double check my program.
      if(rand > 0)
         System.out.println("positive"); 
      else if(rand < 0)
         System.out.println("negative");
      else
         System.out.println("zero");                   
   }
}


