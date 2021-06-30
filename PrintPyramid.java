//Jessie's version of the Pyramid from 5.19, if you look in homework 5 at mine, you can see that there are so many ways to work out these nested loop problems. 6/21/2021

public class PrintPyramid{
   public static void main(String[] args){
   
      for(int i = 0; i < 8; i++){
         for(int j = 7; j > i; j--){
            System.out.print("    ");
         }
         
         int k;
         for(k = 0; k <= i; k++){
            System.out.printf("%4d", ((int)Math.pow(2, k)));
         }
        
         for(int m = (i - 1); m >= 0; m--){
            System.out.printf("%4d", ((int)Math.pow(2, (m))));
         }
         
         System.out.println();
      }
   }
}