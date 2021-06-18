//Eric Oliver, 6/14/2021
//Nested loop practice 5.18 pg 200

public class NestedLoopPractice{
   public static void main(String[] args){
      int numLines = 7; 
      int rows = numLines * 2 - 1;
      
      // Moves cursor to next line
      for(int i = 1; i <= 7; i++){
         // Printes 7 through 2
         for(int j = numLines; j > 1; j--){
            if(j <= i) {
               System.out.print(j + " ");
            } else {
               System.out.print("  ");
            }
            
         }
         
         System.out.print("1 ");
         
         // Prints 2 through 7
         for(int k = 2; k < 8; k++) {
            if(k <= i) {
               System.out.print(k + " ");
            } else {
               System.out.print("  ");
            }
          }
         
         System.out.println();
      }
   }
}


