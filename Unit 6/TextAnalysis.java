// Alexander Szeremeta
// 20240201
// HCS
// Text Analysis Retest from Unit 6 Test

public class TextAnalysis {
   
   public static double countSyllables(String text) {
      int count = 0;
      text = text.toLowerCase();
      char ch = text.charAt(0);
      if ('a' <= ch && ch <= 'z') {
         System.out.print(ch);
      }
      System.out.println();
      return ch;
   }
   
   public static int countWords(String text) {
      int spaces = text.indexOf(' ');
      int words = spaces / 2;
      return words;
   }
   
   public static void main(String[] args) {
      System.out.println(countSyllables("computer scientists"));
      System.out.println(countWords("rubber duck attack"));
   }
}