//Eric Oliver, Olivere, 6/9/2021
//write about what the return value of String.compareTo() represents


// is string 1 greater than string 2?


//what is the result of compareTo on these strings?

public class StringCompareToEx1{
   public static void main(String[] args){
      String x = "bat";
      String y = "cat";
      
      char x1 = 'T';
      char y1 = '.';
      int a1 = x1;
      int a2 = y1;
      
      System.out.println(x1);
      System.out.println(a1);
      System.out.println(y1);
      System.out.println(a2);
      
      
      System.out.println(x);
      System.out.println(y);
      System.out.println(x.compareTo(y));
      System.out.println(y.compareTo(x));
   }
}

