// Alexander Szeremeta
// 20230121
// HCS
// Find Divisors Program from Unit 6 Slides

public class Fibonacci {
   
   public static void main(String[] args) {
      int n = 20;
      int firstTerm = 0;
      int secondTerm = 1;
      
      int count = 1;
      while (count < n) {
          System.out.println(firstTerm + " + " + secondTerm + " = " + (firstTerm + secondTerm));
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
          count++;
      }
   }
}