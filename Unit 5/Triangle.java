//Alexander Szeremeta
//20231211
//HCS
//Exercise 5.7 from Think Java

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the length of the first side: ");
      int side1 = scanner.nextInt();
      System.out.print("Enter the length of the second side: ");
      int side2 = scanner.nextInt();
      System.out.print("Enter the length of the third side: ");
      int side3 = scanner.nextInt();
      if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
         System.out.println("Error: Side lengths must be positive integers.");
      } else if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
         System.out.println("Yes, you can form a triangle with these side lengths.");
      } else {
         System.out.println("No, you cannot form a triangle with these side lengths.");
      }
   }
}