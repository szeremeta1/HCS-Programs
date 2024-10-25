// Alexander Szeremeta
// 20231005
// Honors Computer Science
// Triangle Program from Unit Slides

public class Triangle {

   public static void main(String[] args) {
      double sideOne = 8.0;
      double sideTwo = 24.0;
      System.out.println("Side One: " + sideOne);
      System.out.println("Side Two: " + sideTwo);
      System.out.println("----------------");
      System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(sideOne, 2)+ Math.pow(sideTwo, 2)));
      System.out.println("Angle One: " + Math.toDegrees(Math.atan(sideOne / sideTwo)));
      System.out.print("Angle Two: " + Math.toDegrees(Math.atan(sideTwo / sideOne)));
   }
}