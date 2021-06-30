//Eric Oliver

public class NestedForPyramidPractice{
   public static void main(String[] args){
      
      
      
      for(int i = 0; i < 7; i++){//this prints my rows
         for(int j = 0; j < i+1; j++){
            System.out.print(j+1);
         }
         System.out.println("");
      }
      System.out.println("");
      
      for(int a = 0; a < 6; a++){
         for(int b = 0; b < 6-a; b++){
            System.out.print(b+1);
         }
         System.out.println("");
      }
      System.out.println("");
      
      
      int r;
      for(int e = 0; e < 5; e++){
         for( r = 0; r < 4-e; r++){//prints spaces
            System.out.print(" ");
         }
         for(int t = 5; t >=5 - e; t--) //prints numbers
            System.out.print(t-r);
            
      System.out.println("");  
      }                   
   }
}