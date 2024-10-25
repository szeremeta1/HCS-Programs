// Alexander Szeremeta
// 20231121
// HCS
// Exercise 4.6 from Think Java

public class Multadd {
   
   public static double multadd(double a, double b, double c) {
      return a * b + c;
   }
   
   public static double expSum(double x) {
      return multadd(x , Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
   }
   
   public static void main(String[] args) {
      System.out.println(multadd(1, 2, 3));
      System.out.println(multadd(2.5, 1.0, 4.0));
      System.out.println(multadd(2, 3, 4));
      System.out.println(multadd(1.0, Math.log(10), Math.log(20)));
      System.out.println(expSum(10));
   }
}