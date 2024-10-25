// Alexander Szeremeta
// 20240227
// HCS
// Unit 7 Worksheet

public class HCS7Worksheet {
   
   public static double sum(double[] arr) {
      double sum = 0.0;
      for (double element : arr) {
         sum += element;
      }
      return sum;
   }
   
   public static double product(double[] arr) {
      double product = 1.0;
      for (double element : arr) {
         product *= element;
      }
      return product;
   }
   
   public static double average(double[] arr) {
      return sum(arr) / arr.length;
   }
   
   public static double max(double[] arr) {
      double maxIndex = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > maxIndex)
            maxIndex = arr[i];
      }
      return maxIndex;
   }
   
   public static int indexOfMin(double[] arr) {
      int minIndex = 0;
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < arr[minIndex])
            minIndex = i;
      }
      return minIndex;
   }
   
   public static int indexOf(String[] arr, String str) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i].equals(str))
            return i;
      }
      return -1;
   }
   
   public static int count(String[] arr, String str) {
      int count = 0;
      for (String element : arr) {
         if (element.equals(str))
            count++;
      }
      return count;
   }
   
   public static String vowelize(String str) {
      String result = "";
      for (char c : str.toCharArray()) {
         if ("aeiou".indexOf(c) != -1)
            result += c;
      }
      return result;
   }
   
   public static int[] booleanHist(boolean[] arr) {
      int trueCount = 0;
      int falseCount = 0;
      for (boolean value : arr) {
         if (value) {
            trueCount++;
         } else {
            falseCount++;
         }
      }
      return new int[] {trueCount, falseCount};
   }
   
   public static int[] factorHist(int[] arr) {
      int[] factorCounts = new int[9];
      for (int num : arr) {
         for (int i = 0; i < 9; i++) {
            if (num % (i + 1) == 0)
               factorCounts[i]++;
         }
      }
      return factorCounts;
   }
}