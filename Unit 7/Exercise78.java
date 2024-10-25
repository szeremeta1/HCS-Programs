// Alexander Szeremeta
// 20240229
// HCS
// Exercise 7.8 from ThinkJava

import java.util.Arrays;

public class Exercise78 {
   
   public static boolean areAnagrams(String s1, String s2) {
      s1 = s1.toLowerCase();
      s2 = s2.toLowerCase();
      char[] charArray1 = s1.toCharArray();
      char[] charArray2 = s2.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      return Arrays.equals(charArray1, charArray2);
   }
   
   public static void main(String[] args) {
      System.out.println(areAnagrams("allen downey", "well annoyed"));
   }
}