// Alexander Szeremeta
// 20231019
// HCS
// Dollars to Euros warm-up

import java.util.Scanner;

public class DollarsToEuros {
   public static void main (String[] args) {
      Scanner dollarIn = new Scanner(System.in);
      final double usd = 1;
      final double eur = 0.94;
      System.out.print("How many dollars would you like to convert? ");
      double inputUsd = dollarIn.nextDouble();
      double converted = inputUsd * eur;
      System.out.printf("%.2f USD = %.2f EUR", inputUsd, converted);
   }
}
      
