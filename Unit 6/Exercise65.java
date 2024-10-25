// Alexander Szeremeta
// 20230123
// HCS
// Exercise 6.5 from Think Java

public class Exercise65 {

   public static boolean isDoubloon(String word) {
      int count = word.length();
      word = word.toLowerCase();
      for (int i = 0; i < word.length(); i++) {
         char a = word.charAt(i);
         if (count % 2 != 0) {
         return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      System.out.println(isDoubloon("murmur"));
   }
}