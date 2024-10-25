// Alexander Szeremeta
// 20240207
// HCS
// Enhanced Loops Program from Unit 7 Slides

import java.util.Arrays;

public class EnhancedLoops {
   
   public static void main(String[] args) {
      String name = "Wolfgang Amadeus Mozart";
      for (char ch : name.toCharArray()) {
         System.out.println(ch);
      }
      
      String[] roster = {/* add names here */};
      for (String person : roster ) {
         System.out.println("Good to see you, " + person);
      }
   }
}