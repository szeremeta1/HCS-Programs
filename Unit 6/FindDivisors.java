// Alexander Szeremeta
// 20230121
// HCS
// Find Divisors Program from Unit 6 Slides

import java.util.Scanner;

public class FindDivisors {
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = scanner.nextInt();
      int count = 0;
      
      for (int i = 1; i <= n; i++) {
         if (n % i == 0) {
            System.out.println(i + " is a divisor of " + n);
            count++;
         }
      }
      
      System.out.println(n + " has " + count + " divisors.");
      if (count == 2) {
         System.out.println(n + " is a prime number.");
      } else {
         System.out.println(n + " is a composite number.");
      }
   }
}