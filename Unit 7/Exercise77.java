// Alexander Szeremeta
// 20240229
// HCS
// Exercise 7.7 from ThinkJava

import java.util.Arrays;

public class Exercise77 {
   
   public static String letterHist(String str) {
      int[] histogram = new int[26];
      for (char c : str.toCharArray()) {
         if (Character.isLetter(c)) {
            int index = Character.toLowerCase(c) - 'a';
            histogram[index]++;
         }
      }
      return Arrays.toString(histogram);
   }
   
   public static void main(String[] args) {
      System.out.println(letterHist("This is a test string"));
   }
}