// Alexander Szeremeta
// 20230123
// HCS
// Exercise 6.2 from Think Java

public class Exercise62 {
   
   public static double squareRoot(double a) {
      double x0 = a / 2;
      while (true) {
         double x1 = (x0 + a / x0) / 2;
         if (Math.abs(x1 - x0) < 0.0001) {
            return x1;
         }
         
         x0 = x1;
      }
   }
   
   public static void main(String[] args) {
      System.out.println(squareRoot(81));
   }
}