// Alexander Szeremeta
// 20231205
// HCS
// Triangle Calculator program from Unit 5 slides

import java.util.Scanner;

public class TriangleCalculator {
   public static void main(String[] args) {
      int sideA;
      int sideB;
      int sideC;
      Scanner console = new Scanner(System.in);
      System.out.print("Enter Side A: ");
      sideA = console.nextInt();
      System.out.print("Enter Side B: ");
      sideB = console.nextInt();
      System.out.print("Enter Side B: ");
      sideC = console.nextInt();
      if (sideA == sideB && sideB == sideC) {
         System.out.println("The triangle is equilateral.");
      } else if (sideA == sideB || sideB == sideC || sideA == sideC){
         System.out.println("The triangle is isosceles.");
      } else {
         System.out.println("The triangle is scalene.");
      }
   }
}
   