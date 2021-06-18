//Eric Oliver, 6/14/2021
//Nested loop practice 5.18 pg 200

public class NestedLoopPractice2{
   public static void main(String[] args){
      
      for(int i = 6; i > 0; i--){
         for(int j = 1; j <= i; j++){ 
            System.out.print(j + " ");
         }
         System.out.println();
      }
   }
}


