//Eric Oliver, Olivere, 6/18/2021
//problem 5.19

//tried to get it to equal n rows to no avail.

public class NestedLoop5_19{
   public static void main(String[] args){
    
      
      int i;
      int j;
      int k;
      int q;
      int s; 
      int z; 

      for(i = 1; i <= 8; i++ ){   //prints my rows  
         for(j = 0; j < 8-i; j++){     //prints spaces (5)
            System.out.print("     "); 
         }
         for(k = 0; k < i ; k++){   //prints the left side up to the center row of the pyramid
            System.out.printf("%5d",((int)Math.pow(2,k)));
         } 
         for(q = k-2; q >= 0; q--){   //prints the numbers to the right of the center of the pyramid
            System.out.printf("%5d",((int)Math.pow(2,q)));
         }
         System.out.println("");
      } 
   }
}