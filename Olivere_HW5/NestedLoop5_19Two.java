//Eric Oliver, Olivere, 6/21/2021
//problem 5.19
//This program will print the pyramid depicted in the textbook for problem 5.19
//Please don't put this on the final.


public class NestedLoop5_19Two{
   public static void main(String[] args){

      for(int i = 1; i <= 8; i++ ){   //prints my rows  
         for(int j = 0; j < 8-i; j++){     //prints spaces (5)
            System.out.print("     "); 
         }
         int k;
         for(k = 0; k < i ; k++){   //prints the left side up to the center row of the pyramid
            System.out.printf("%5d",((int)Math.pow(2,k)));
         } 
         for(int q = k-2; q >= 0; q--){   //prints the numbers to the right of the center of the pyramid
            System.out.printf("%5d",((int)Math.pow(2,q)));
         }
         System.out.println(""); //prints a new line so that the new row can begin
      } 
   }
}