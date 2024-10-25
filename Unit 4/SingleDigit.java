// Alexander Szeremeta
// 20231116
// HCS
// Single Digit program from Unit 4 Slides

public class SingleDigit {
   
   public static boolean isSingleDigit_v1(int n) {
      if (n > -10 && n < 10) {
         return true;
      } else {
         return false;
      }
   }
   
   public static boolean isSingleDigit_v2(int n) {
      return n > -10 && n < 10;
   }
   
   public static void main(String[] args) {
      System.out.println(isSingleDigit_v1(20));
      System.out.println(isSingleDigit_v1(5));
      System.out.println(isSingleDigit_v2(-5));
      System.out.println(isSingleDigit_v2(-20));
   }
}