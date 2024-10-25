// Alexander Szeremeta
// 20240226
// HCS
// Think Java Exercise 7.1

public class Exercise71 {
   
   public static int banana(int[] a) {
      int kiwi = 1;
      int i = 0;
      while (i < a.length) {
         kiwi = kiwi * a[i];
         i++;
      }
      return kiwi;
   }
   
   public static int grapefruit(int[] a, int grape) {
      for (int i = 0; i < a.length; i++) {
         if (a[i] == grape) {
            return i;
         }
      }
      return -1;
   }
   
   public static int pineapple(int[] a, int apple) {
      int pear = 0;
      for (int pine: a) {
         if (pine == apple) {
            pear++;
         }
      }
      return pear;
   }
   
   public static void main(String[] args) {
      int[] a = {1, 2, 3, 4};
      System.out.println(banana(a));
      System.out.println(grapefruit(a, 69));
      System.out.println(pineapple(a, 420));
   }
}