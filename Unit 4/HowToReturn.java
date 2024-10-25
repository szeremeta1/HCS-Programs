// Alexander Szeremeta
// 20231106
// HCS
// How to return Program from Unit 4 Slides

public class HowToReturn{
   public static int remainder(int a, int b) {
      return a % b;
   }
   
   public static double square(double n) {
      return n * n;
   }
   
   public static boolean isMultipleOf5(int n) {
      return n % 5 == 0;
   }
   
   public static String wtf(String str) {
      return str.replaceAll("w", "f");
   }
   
   public static void main(String[] args) {
      int answer = remainder(1075, 7);
      double answer2 = square(69.0);
      boolean answer3 = isMultipleOf5(75);
      System.out.println(answer);
      System.out.println(answer2);
      System.out.println(answer3);
   }
}