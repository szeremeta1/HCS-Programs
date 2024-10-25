// Alexander Szeremeta
// 20231205
// HCS
// NumChecker program from Unit 5 slides

import java.util.Scanner;

public class NumChecker {
   public static void main(String[] args) {
      int userNum;
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a number: ");
      userNum = console.nextInt();
      if (userNum == 9) {
         System.out.println("That is the lucky number!");
      } else {
         System.out.println("That is not the lucky number!");
      }
   }
}
   