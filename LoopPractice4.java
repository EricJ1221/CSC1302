
public class LoopPractice4 {
   public static void main(String[] args){
      int number = 25;
      int i;
      
      boolean isPrime = true;
      for(i = 2 ; i < number&&isPrime; i++){
         if(number% i == 0){
         isPrime = false;
         break
         }             
      }
      System.out.println("i is " + i + " isPrime is " + isPrime);
   }
}



//for( int i = 0 ; i < 5 ; i++){
         //for( int j = 0; j <= i; j++){
            //System.out.print( i + 1 + " ");
            
            //1 2 2 3 3 3 4 4 4 4 5 5 5 5 5