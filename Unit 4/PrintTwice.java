// Alexander Szeremeta
// 20231031
// HCS
// PrintTwice Program from Unit 4 Slides

public class PrintTwice {
   public static void printTwice(String str) {
      System.out.println(str);
      System.out.println(str);
   }
   
   public static void main(String[] args) {
      printTwice("Don't make me say this twice!");
      printTwice("ALWAYS. BE. CHECKING."); // or Dr. Brannon WILL find you
   }
}