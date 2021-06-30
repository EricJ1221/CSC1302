//This program will pritnt the pyramid as many times as desired. 6/21/2021
//Although I don't think I would have been able to get to this solution without help.
 
public class PyramidTest2{
   public static void main(String[] args){
 
 
 
   int rows = 8;     
   for (int row = 0; row < rows; row++) {  // row times 
   int number = 1;

      for(int i = 0; i < rows -1 - row; i++) // mtimes
         System.out.print("     ");

         for(int j = 0; j < 2 * row + 1; j++) { // n times 
            if ( j <= (2 * row + 1) / 2) {
            number *= 2;
               System.out.printf("%5d", number);  
            }
            else {
            number /= 2;
               System.out.printf("%5d", number);  
         }
      }
      System.out.println();
      }
   } 
}