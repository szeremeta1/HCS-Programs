// Alexander Szeremeta
// 20231106
// HCS
// Calculate Area Program from Unit 4 Slides

import java.util.Scanner;

public class CalculateArea{
   
   public static double calculateArea(double radius) {
      double result = Math.PI * Math.pow(radius, 2);
      return result; // Do return types match?
   }
   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      double r = in.nextDouble();
      // Next line jumps to the method, then uses returned value
      System.out.printf("The area is %.2f", calculateArea(r));
   }
}