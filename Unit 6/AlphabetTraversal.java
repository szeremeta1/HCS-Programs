// Alexander Szeremeta
// 20230129
// HCS
// Alphabet Traversal from Unit 6 Slides

public class AlphabetTraversal {
   
   public static void main(String[] args) {
      String str = "Professor Chaos".toLowerCase();
      for (char ch = 'a'; ch <= 'z'; ch++) {
         if (str.indexOf(ch) < 0) {
            System.out.println(ch + " is not in the string");
         }
      }
   }
}