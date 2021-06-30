//Eric Oliver, Olivere, 6/19/2021
//test 2 practice

public class TestTwoPractice{
   public static void main(String[] args){
      
     
      
      for(int i = 0; i < 5; i++){  /// number of rows
         for( int z = 0; z < i; z++) //prints my spaces
            System.out.print(" ");
         
         for( int x = 5-i; x > 0; x--) // prints numbe
            System.out.print(i+1);    
         
         System.out.println("");  
      }  
   }
}