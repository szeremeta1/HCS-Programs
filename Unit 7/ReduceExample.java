// Alexander Szeremeta
// 20240212
// HCS
// Reduce Example from Unit 7 Slides

public class ReduceExample {
   public static double avgStrLength(String[] arr) {
      double totalChars = 0.0;
      for (String str : arr) {
         totalChars += str.length();
      }
      return totalChars / arr.length;
   }
   
   public static void main(String[] args) {
      String[] roster = {"Ayan", "Evan", "Felipe", "Owen", "Phillip", "Teresa", "Tessa", "Thomas"};
      System.out.print("The average name length is " + avgStrLength(roster));
   }
}