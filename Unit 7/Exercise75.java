// Alexander Szeremeta
// 20240228
// HCS
// Think Java Exercise 7.5

public class Exercise75 {
   
   public static boolean areFactors(int n, int[] arr1) {
      for (int factor : arr1) {
         if (n % factor != 0) {
            return false;
         }
      }
      return true;
   }
   
   public static void main(String[] args) {
      int[] arr1 = {1, 2, 3, 4, 5, 6};
      System.out.println(areFactors(3, arr1));
   }
}