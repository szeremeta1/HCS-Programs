//Alexander Szeremeta
//20231211
//HCS
//Exercise 5.6 from Think Java

import java.util.Scanner;

public class Quadratic {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the coefficient a: ");
      int a = scanner.nextInt();
      System.out.print("Enter the coefficient b: ");
      int b = scanner.nextInt();
      System.out.print("Enter the coefficient c: ");
      int c = scanner.nextInt();
      double discriminant = b * b - 4 * a * c;
      
      if (discriminant > 0) {
         double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
         double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
         System.out.println("Root 1: " + root1);
         System.out.println("Root 2: " + root2);
      } else if (discriminant == 0) {
         double root = -b / (2 * a);
         System.out.println("Root: " + root);
      } else {
         System.out.println("No real roots");
      }
   }
}