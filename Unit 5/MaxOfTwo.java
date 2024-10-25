// Alexander Szeremeta
// 20231205
// HCS
// Max of Two program from Unit 5 slides

import java.util.Scanner;

public class MaxOfTwo {
   public static void main(String[] args) {
      int numOne;
      int numTwo;
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a number: ");
      numOne = console.nextInt();
      System.out.print("Enter another number: ");
      numTwo = console.nextInt();
      if (numOne > numTwo) {
         System.out.printf("%d is greater than %d.", numOne, numTwo);
      } else if (numTwo > numOne) {
         System.out.printf("%d is greater than %d.", numTwo, numOne);
      } else {
         System.out.printf("%d is the same as %d.", numOne, numTwo);

      }
   }
}
   