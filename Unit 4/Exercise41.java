// Alexander Szeremeta
// 20231117
// HCS
// Exercise 4.1 from Think Java

public class Exercise41 {
   
   public static String printAmerican(String day, String date, String month, String year) {
      return day + ", "  + month + " " + date + ", " + year;
   }
   
   public static String printEuropean(String day, String date, String month, String year) {
      return day + " " + date + " " + month + " " + year;
   }
   
   public static void main(String[] args) {
      System.out.println(printAmerican("Sunday", "24", "August", "2008"));
      System.out.print(printEuropean("Sunday", "24", "August", "2008"));
   }
}
