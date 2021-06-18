
public class LoopPractice {
   public static void main(String[] args){
      int n = 5; 
      for( int i = n ; i > 0; i--){
         for(int j = 1; j <= n + 1 - i; j++){
            System.out.print( n + 1 - i + " ");
         }       
      }
      
   }
}


             