// Alexander Szeremeta
// 20230129
// HCS
// String Traversal from Unit 6 Slides

public class StringTraversal {
   
   public static void main(String[] args) {
      String str = "235 Hope Road";
      for (int i = 0; i < str.length(); i++) {
         String letter = str.substring(i, i + 1);
         // char letter = str.charAt(i);
         System.out.println(letter);
      }
   }
}