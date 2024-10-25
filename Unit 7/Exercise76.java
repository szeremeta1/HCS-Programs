// Alexander Szeremeta
// 20240229
// HCS
// Exercise 7.6 from ThinkJava

public class Exercise76 {
   
   public static boolean arePrimeFactors(int n, int[] arr1) {
      for (int factor : arr1) {
         if (!isPrime(factor) || n % factor != 0) {
            return false;
         }
      }
      return true;
   }
   
   public static boolean isPrime(int n) {
      for (int i = 2; i < n / 2; i++) {
         if (n % i == 0) {
            return false;
         }
      }
   return true;
   }
   
   public static void main(String[] args) {
      int[] arr1 = {2, 4, 6, 8};
      System.out.println(arePrimeFactors(2, arr1));
   }
}