//Eric Oliver, Olivere, 6/9/2021
//write a program using a while-loop to sum all even numbers from 1-100.


public class WhileLoopEx1{
   public static void main(String[] args){
      int number = 9;
      int i;
      boolean isPrime = true;
         for(i = 2; i < number&& isPrime; i++){
            if(number % i == 0){
               isPrime = false;
            }
         }    
         System.out.println("i is " + i);
         
         if(isPrime)
            System.out.println(number + "is prime");
         else
            System.out.println(number + "is not prime");   
            
   }
}