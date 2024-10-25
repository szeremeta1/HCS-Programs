// Alexander Szeremeta
// 20231022
// HCS
// Think Java Exercise 3.2

import java.util.Scanner;

public class Exercise32 {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a temperature in Celsius: ");
      double inputC = in.nextDouble();
      double outputF = inputC * 9 / 5 + 32;
      System.out.printf("%.1f C = %.1f F", inputC, outputF);
   }
}