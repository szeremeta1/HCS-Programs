// Alexander Szeremeta
// 20231017
// HCS
// Convert Challenge from Unit 3 Slides

import java.util.Scanner;

public class Convert {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      final double CM_PER_INCH = 2.54;
      final double INCH_PER_FT = 12;
      System.out.print("How many cm? ");
      double inputCm = in.nextDouble();
      double outputFt = inputCm / CM_PER_INCH / INCH_PER_FT;
      System.out.printf("%.3f cm = %.3f ft", inputCm, outputFt);
   }
}