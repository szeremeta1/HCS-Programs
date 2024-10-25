// Alexander Szeremeta
// 20230111
// HCS
// MultTable from Unit 6 Slides

public class MultTable {
   
   public static void tableRow(int base, int maxHeight) {
      for (int i = 1; i <= maxHeight; i++) {
         System.out.printf("%4d", base * i);
      }
      System.out.println();
   }
   
   public static void main(String[] args) {
      int rows = 20;
      for (int stuff = 1; stuff <= rows; stuff++) {
         tableRow(stuff, rows);
      }
   }
}