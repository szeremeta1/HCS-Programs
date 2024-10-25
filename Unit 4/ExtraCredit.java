// Alexander Szeremeta
// 20231117
// HCS
// Extra Credit from Unit 4 Worksheet

public class ExtraCredit {
 
   public static double add(double a, double b) {
	   return a + b;
   }
   
   public static double subtract(double a, double b) {
	   return a - b;
   }
   
   public static double multiply(double a, double b) {
	   return a * b;
   }
   
   public static double divide(double a, double b) {
	   return a / b;
   }
   
   public static double multAdd(double a, double b, double c) {
	   return a * b + c;
   }
   
   public static double calculateTip(double checkTotal, int percent) {
	   return checkTotal * percent / 100;
   }
   
   public static void main(String[] args) {
      System.out.println(add(1, 2));
      System.out.println(subtract(8, 3));
      System.out.println(multiply(3, 4));
      System.out.println(divide(16, 2));
      System.out.println(multAdd(1, 2, 3));
      System.out.println(calculateTip(600.23, 15));
   }
}