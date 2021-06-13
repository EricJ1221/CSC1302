//eric oliver, 6/9/2021

public class ExamplesNestedForLoop{
   public static void main(String[] args){
      int n = 5;
      for( int row = 0 ; row < n; row ++){
         for( int col = 0; col <= row ; col++){ /// col = column
            System.out.print("* "); 
         }
         System.out.println();  
      }
   }
}