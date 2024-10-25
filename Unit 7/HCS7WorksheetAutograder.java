// Dr. Brannon
// HCS
// 20230303
// Unit 7 worksheet

import java.util.Arrays;

public class HCS7WorksheetAutograder {

   public static void main(String[] args) {
      double[] arr1 = {13.5, 3.32, 57.0, 42.15, 15.23};
      double[] arr2 = {18.78, 67.94, 5.79, 18.84, 64.11, 
                       72.17, 29.23, 34.1, 39.46, 21.57};
      String[] names = {"Hippolytos", "Arcadius", "Achilleus", "Pyrrhos",
                        "Arcadius", "Nicanor", "Linus", "Theodora", 
                        "Pancratius", "Sophron", "Hermogenes", "Achilleus",
                        "Cleopatra", "Zenais", "Cleopatra", "Theodora",
                        "Athanasia", "Nicanor", "Euclides", "Nicanor",
                        "Sophron", "Arcadius", "Linus", "Theodora",
                        "Pancratius", "Pyrrhos", "Arcadius", "Demetrius"};
      boolean[] states1 = {true, true, false, true, true};
      boolean[] states2 = {true, false, true, true, true, 
                           true, false, false, true, false};
      int[] nums1 = {13, 3, 57, 42, 15};
      int[] nums2 = {43, 68, 16, 95, 94, 
                     83, 30, 42, 64, 19};
                     
      int score = 0;
                  
      // Question 1
      double ans1a = HCS7Worksheet.sum(arr1);
      double ans1b = HCS7Worksheet.sum(arr2);
      System.out.println(ans1a); // 131.2
      System.out.println(ans1b); // 371.99
      if (ans1a == 131.2) score++;
      if (ans1b == 371.99) score++;
      
      // Question 2
      double ans2a = HCS7Worksheet.product(arr1);
      double ans2b = HCS7Worksheet.product(arr2);
      System.out.println(ans2a); // 1640001.2919300003
      System.out.println(ans2b); // 5.463280452526752E14
      if (ans2a == 1640001.2919300003) score++;
      if (ans2b == 5.463280452526752E14) score++;
      
      // Question 3
      double ans3a = HCS7Worksheet.average(arr1);
      double ans3b = HCS7Worksheet.average(arr2);
      System.out.println(ans3a); // 26.24
      System.out.println(ans3b); // 37.199
      if (ans3a == 26.24) score++;
      if (ans3b == 37.199) score++;
      
      // Question 4
      double ans4a = HCS7Worksheet.max(arr1);
      double ans4b = HCS7Worksheet.max(arr2);
      System.out.println(ans4a); // 57.0
      System.out.println(ans4b); // 72.17
      if (ans4a == 57.0) score++;
      if (ans4b == 72.17) score++;
      
      // Question 5
      int ans5a = HCS7Worksheet.indexOfMin(arr1);
      int ans5b = HCS7Worksheet.indexOfMin(arr2);
      System.out.println(ans5a); // 1
      System.out.println(ans5b); // 2
      if (ans5a == 1) score++;
      if (ans5b == 2) score++;
      
      // Question 6
      int ans6a = HCS7Worksheet.indexOf(names, "Zenais");
      int ans6b = HCS7Worksheet.indexOf(names, "Brannon");
      System.out.println(ans6a); // 13
      System.out.println(ans6b); // -1
      if (ans6a == 13) score++;
      if (ans6b == -1) score++;
      
      // Question 7
      int ans7a = HCS7Worksheet.count(names, "Arcadius");
      int ans7b = HCS7Worksheet.count(names, "Theodora");
      System.out.println(ans7a); // 4
      System.out.println(ans7b); // 3
      if (ans7a == 4) score++;
      if (ans7b == 3) score++;
      
      // Question 8
      String ans8a = HCS7Worksheet.vowelize("computer science");
      String ans8b = HCS7Worksheet.vowelize("Artoo-Detoo");
      System.out.println(ans8a); // oueiee
      System.out.println(ans8b); // aooeoo
      if (ans8a.equals("oueiee")) score++;
      if (ans8b.equals("aooeoo")) score++;
      
      // Question 9
      String ans9a = Arrays.toString(HCS7Worksheet.booleanHist(states1));
      String ans9b = Arrays.toString(HCS7Worksheet.booleanHist(states2));
      System.out.println(ans9a); // [4, 1]
      System.out.println(ans9b); // [6, 4]
      if (ans9a.equals("[4, 1]")) score++;
      if (ans9b.equals("[6, 4]")) score++;
      
      // Question 10
      String ans10a = Arrays.toString(HCS7Worksheet.factorHist(nums1));
      String ans10b = Arrays.toString(HCS7Worksheet.factorHist(nums2));
      System.out.println(ans10a); // [5, 1, 4, 0, 1, 1, 1, 0, 0]
      System.out.println(ans10b); // [10, 6, 2, 3, 2, 2, 1, 2, 0]
      if (ans10a.equals("[5, 1, 4, 0, 1, 1, 1, 0, 0]")) score++;
      if (ans10b.equals("[10, 6, 2, 3, 2, 2, 1, 2, 0]")) score++;
      
      System.out.println();
      System.out.printf("Test cases correct: \t%2d%n", score);
      score += 10;
      System.out.printf("Compilation bonus: \t10%n");
      System.out.printf("Autograder score: \t%2d out of 26 points%n", score);
   }

}