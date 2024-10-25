// Alexander Szeremeta
// 20240226
// HCS
// Think Java Exercise 7.3

public class Exercise73 {
   
   public static int indexOfMax(int[] arr1) {
      int maxIndex = 0;
      int maxElement = arr1[0];
      int currentIndex = 0;
      for (int element : arr1) {
         if (element > maxElement) {
            maxElement = element;
            maxIndex = currentIndex;
         }
         currentIndex++;
      }
      return maxIndex;
   }
   
   public static void main(String[] args) {
      int[] array = {3, 2, 99, 76};
      System.out.println(indexOfMax(array));
   }
}