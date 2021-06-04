//random number generator practice
// this program will print a number betwwn 10 and 50

public class Rand10_50 {
   public static void main(String[] args) {
      int rand = (int)(10 + Math.random()*40);
      System.out.println(rand);
      if(rand % 2 == 0){
         System.out.println("rand is even");
         if(rand % 4 == 0){
            System.out.println("rand is divisible by 4 \"2\" ");
         }
      }
      else{
         System.out.println("rand is odd");
      }
   }
}