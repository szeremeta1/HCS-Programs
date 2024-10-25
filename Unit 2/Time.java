// Alexander Szeremeta
// 20231009
// Honors Computer Science
// Exercise 2.3

public class Time {

   public static void main(String[] args){
      int hour = 10;
      int minute = 41;
      int second = 36;
      int secMidnight = hour * 3600 + minute * 60 + second;
      int secRemaining = 86400 - secMidnight;
      int percentPassed = secMidnight * 100 / 86400;
      
      System.out.println("Seconds since midnight: " + secMidnight);
      System.out.println("Seconds remaining in day: " + secRemaining);
      System.out.println("Percent of Day Passed: " + percentPassed + "%");
      
      int secFromStart = (hour * 3600 + minute * 60 + second) - (10 * 3600 + 25 * 60 + 38);
      System.out.println("");
      System.out.print("Seconds Spent Making this Program: " + secFromStart);
   }
}
