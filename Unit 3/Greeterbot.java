// Alexander Szeremeta
// 20231013
// HCS
// GreeterBot program from Unit 3 slides

import java.util.Scanner;

public class Greeterbot {

   public static void main (String[] args) {
      Scanner kybd = new Scanner(System.in);
      System.out.println("Hello, my name is Greeterbot.");
      System.out.print("What is your name? ");
      String yourName = kybd.nextLine();
      System.out.print("Hello, " + yourName + "! Good to meet you.");
   }
}