import java.utils.Scanner;

public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter Roman Numeral: ");
   String input = scanner.nextLine();
   boolean result1 = isValid(input);
   if (result1 == true) {
      System.out.println(convert(input));
   } else {
      System.out.println("Your input is not a valid Roman Numeral.");
   }
}