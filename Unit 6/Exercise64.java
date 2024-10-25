// Alexander Szeremeta
// 20230123
// HCS
// Exercise 6.4 from Think Java

public class Exercise64 {

   public static boolean isAbecedarian(String word) {
      int length = word.length();
      for (int i = 0; i < length - 1; i++) {
         if (word.charAt(i) > word.charAt(i + 1)) {
         return false;
         }
      }
      return true;
   }
   
   public static void main(String[] args) {
      System.out.println(isAbecedarian("adempt"));
   }
}