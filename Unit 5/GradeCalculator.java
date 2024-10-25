// Alexander Szeremeta
// 20231205
// HCS
// Grade Calculator program from Unit 5 slides

import java.util.Scanner;

public class GradeCalculator {
   public static void main(String[] args) {
      int userGrade;
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a numerical grade: ");
      userGrade = console.nextInt();
      if (userGrade >= 90) {
         System.out.println("Your grade is an A!");
      } else if (userGrade >= 80){
         System.out.println("Your grade is a B!");
      } else if (userGrade >= 70){
         System.out.println("Your grade is a C!");
      } else if (userGrade >= 60){
         System.out.println("Your grade is a D!");
      } else if (userGrade >= 0){
         System.out.println("Your grade is an F! :(");
      }
   }
}
   