// Alexander Szeremeta
// 20231022
// HCS
// Think Java Exercise 3.3

import java.util.Scanner;

public class Exercise33 {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an amount of time in seconds: ");
      double inputSec = in.nextInt();
      double outputHour = inputSec / 3600;
      double outputMin = (inputSec % 3600) / 60;
      double outputSec = inputSec % 60;
      System.out.printf("%.0f seconds = %.0f hours, %.0f minutes, %.0f seconds", inputSec, outputHour, outputMin, outputSec);
   }
}