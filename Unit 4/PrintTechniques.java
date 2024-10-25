// Alexander Szeremeta
// 20231102
// HCS
// PrintTechniques Program from Unit 4 Slides

public class PrintTechniques{
   public static void print(String str) {
      System.out.print(str);
   }
   
   public static void printX(String str, int x) {
      for (int i = 0; i < x; i++) {
         print(str);
      }
   }
   
   public static void blankLine() {
      print("\n");
      
   }
   
   public static void main(String[] args) {
      print("Some demo text to display\n");
      blankLine();
      printX("Let me see this five times!\n", 5);
   }
}