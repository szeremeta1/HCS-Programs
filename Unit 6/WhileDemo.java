// Alexander Szeremeta
// 20230109
// HCS
// WhileDemo from Unit 6 Slides

public class WhileDemo {
   
   public static void countdown(int n) {
      while (n > 0) {
         System.out.println(n);
         n = n - 1; // n -=1; or n--;
      }
      System.out.println("Blastoff!");
   }
   
   public static void main(String[] args) {
      countdown(100000000);
   }
  
}
   