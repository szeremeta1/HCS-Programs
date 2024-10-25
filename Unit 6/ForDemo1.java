// Alexander Szeremeta
// 20230109
// HCS
// ForDemo1 from Unit 6 Slides

public class ForDemo1 {

   public static void countdown(int n) {
      for (int i = n; i > 0; i = i - 1) {
         System.out.println(i);
      }
      System.out.println("Blastoff!");
   }
   
   public static void main(String[] args) {
      countdown(10);
   }
}