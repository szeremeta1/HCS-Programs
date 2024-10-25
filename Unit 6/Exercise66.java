// Alexander Szeremeta
// 20230123
// HCS
// Exercise 6.6 from Think Java

public class Exercise66 {

   public static boolean canSpell(String tiles, String word) {
      tiles = tiles.toLowerCase();
      word = word.toLowerCase();
      for (int i = 0; i < word.length(); i++) {
         char letter = word.charAt(i);
         int index = tiles.indexOf(letter);
         if (index == -1) {
            return false;
         }
      }
      return true;
   }
   
   public static void main(String[] args) {
      System.out.println(canSpell("CALSDFE", "nan"));
   }
}