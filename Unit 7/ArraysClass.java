// Alexander Szeremeta
// 20240207
// HCS
// Arrays Class Program from Unit 7 Slides

import java.util.Arrays;

public class ArraysClass {

   public static void main(String[] args) {
      double[] randomArr = new double[5];
      for (int i = 0; i < randomArr.length; i++) {
         randomArr[i] = Math.random();
      }
      
      System.out.println(Arrays.toString(randomArr));
      double[] newArr = Arrays.copyOf(randomArr, randomArr.length);
      newArr[4] = 13.0;
      System.out.println(Arrays.toString(randomArr));
      System.out.println(Arrays.toString(newArr));
   }
}