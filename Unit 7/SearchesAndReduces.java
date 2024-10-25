// Alexander Szeremeta
// 20240209
// HCS
// Search and Reduce Program from Unit 7 Slides

public class SearchesAndReduces {

   public static int whereIsIt(double[] a, double target) {
      for (int i = 0; i < a.length; i++) {
         if (a[i] == target)
            return i;
      }
      return -1;
   }
   
   public static double sum(double[] b) {
      double total = 0.0;
      for (double value : b)
         total += value;
      return total;
   }
   
   public static void main(String[] args) {
      double[] nums = {1.0, 29.7, 2.1, 6.3, 3.14, 14.2, 8.9};
      System.out.println(whereIsIt(nums, 3.14));
      System.out.println(sum(nums));
   }
   
}