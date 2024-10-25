// Alexander Szeremeta
// 20240207
// HCS
// Array Traversal Program from Unit 7 Slides

public class ArrayTraversal {
   
   public static void main(String[] args) {
      double[] arr = {3.142, 2.724, 2.556, 1.414};
      System.out.println(arr);
      
      for (int i = 0; i < arr.length; i++) {
         double element = arr[i];
         System.out.println(element);
      }
      
      int j = 0;
      while (j < arr.length) {
         double element = arr[j];
         System.out.println(element);
         j++;
      }
   }
}