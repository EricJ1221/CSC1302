//Eric Oliver, Olivere, 6/9/2021
//write a program using a while-loop to sum all even numbers from 1-100.


public class WhileLoopEx1{
   public static void main(String[] args){
      int sum = 0;
      int count = 0;
      while(count <= 100){
         if(count % 2 == 0){
            sum += count;
         }
         count++;
         System.out.println(count + " , " + sum); 
         
      }
   }
}