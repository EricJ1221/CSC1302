 
 
public class Test2{
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