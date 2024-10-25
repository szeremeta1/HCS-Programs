// Alexander Szeremeta
// 20240212
// HCS
// Search Example from Unit 7 Slides

public class SearchExample {
   public static String longestWord(String[] words) {
      String longestWord = "";
      for (String word : words) {
         if (word.length() > longestWord.length())
            longestWord = word;
      }
      return longestWord;
   }
   
   public static void main(String[] args) {
      String[] roster = {"Ayan", "Evan", "Felipe", "Owen", "Phillip", "Teresa", "Tessa", "Thomas"};
      System.out.print("The person with the longest name is " + longestWord(roster));
   }
}