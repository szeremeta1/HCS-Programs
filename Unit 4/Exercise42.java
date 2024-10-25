// Alexander Szeremeta
// 20231117
// HCS
// Exercise 4.2 from Think Java

public class Exercise42 {
   
   public static void main(String[] args) {
      zippo("rattle", 13);
   }
   
   public static void baffle(String blimp) {
      System.out.println(blimp);
      zippo("ping", -5);
   }
   
   public static void zippo(String quince, int flag) {
      if (flag < 0) {
         System.out.println(quince + " zoop");
      } else {
         System.out.println("ik");
         baffle(quince);
         System.out.println("boo-wa-ha-ha");
      }
   }
}