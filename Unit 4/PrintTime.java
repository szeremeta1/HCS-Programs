// Alexander Szeremeta
// 20231102
// HCS
// PrintTime Program from Unit 4 Slides

public class PrintTime {
   public static void printTime(int hour, int minute) {
      System.out.printf("%02d:%02d%n", hour, minute);
   }
   
   public static void main(String[] args) {
      int h = 11;
      int m = 59;
      printTime(h, m); // variables passed as args
      printTime(1, 5); // literals passed as args
      printTime(7, 35);
      printTime(9, 5); // Current time as of writing
   }
}