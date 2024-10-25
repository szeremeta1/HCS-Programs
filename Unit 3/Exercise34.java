// Alexander Szeremeta
// 20231022
// HCS
// Think Java Exercise 3.4

import java.util.Scanner;
import java.util.Random;

public class Exercise34 {
   public static void main (String[] args) {
      Random randomNum = new Random();
      int number = randomNum.nextInt(100) + 1;
      System.out.println("I'm thinking of a number between 1 and 100");
      System.out.println("(including both). Can you guess what it is?");
      Scanner in = new Scanner(System.in);
      System.out.print("Type a number: ");
      int inputNum = in.nextInt();
      int offBy = inputNum - number;
      System.out.println("The number I was thinking of is: " + number);
      System.out.print("You were off by: " + offBy);
   }
}