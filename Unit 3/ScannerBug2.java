// Alexander Szeremeta
// 20231019
// HCS
// Scanner Bug V1 from Unit 3 Slides

import java.util.Scanner;

public class ScannerBug2 {
   public static void main (String[] args) {
      String name;
      int age;
      Scanner console = new Scanner(System.in);
      System.out.print("What is your age? ");
      age = console.nextInt();
      console.nextLine(); // "reads intermediate newline" not sure what that means but its important
      System.out.print("What is your name? ");
      name = console.nextLine();
      System.out.printf("Hello, %s, age %d%n", name, age);
   }
}