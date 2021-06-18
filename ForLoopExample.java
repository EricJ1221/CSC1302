//Eric Oliver, 6/13/2021

public class ForLoopExample{
   public static void main(String[] args){
      int sum = 0;
      for ( double i = 1; i <= 99; i++){
         double sum /= i + 1;
         System.out.println(sum + " " + i);
      }
   }
}
   