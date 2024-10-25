// Alexander Szeremeta
// 20231013
// HCS
// Echo program from Unit 3 slides

import java.util.Scanner;

public class Echo {
   public static void main (String[] args) {
      Scanner kybd = new Scanner(System.in);
      System.out.print("Type something: ");
      String line = kybd.nextLine();
      System.out.println("You said: " + line);
      System.out.print("Type something else: ");
      line = kybd.nextLine();
      System.out.println("You also said: " + line);
   }
}