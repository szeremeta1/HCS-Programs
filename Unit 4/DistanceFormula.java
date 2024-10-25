// Alexander Szeremeta
// 20231108
// HCS
// Distance Formula (Writing and Calling a Stub Method) from Unit 4 Slides

public class DistanceFormula{

   public static double distance(double x1, double y1, 
                                 double x2, double y2) {
      double dx = x2 - x1;
      double dy = y2 - y1;
      double dSquared = dx * dx + dy * dy;
      return Math.sqrt(dSquared);
   }
   
   public static double circleCircumference(double x1, double y1, 
                                            double x2, double y2) {
      return distance(x1, y1, x2, y2) * Math.PI;
   }
   
   public static double circleArea(double x1, double y1, 
                                   double x2, double y2) {
      double diameter = distance(x1, y1, x2, y2);
      return Math.PI * Math.pow(diameter / 2, 2);
   }
   
   public static double rectanglePerimeter(double length, double width) {
      double perimeter = 2 * (length + width);
      return perimeter;
   }
   
   public static double rectangleArea(double length, double width) {
      double area = length * width;
      return area;
   }
   
   public static void main(String[] args) {
      System.out.println(distance(1, 2, 4, 6));
      System.out.println(distance(1, 1, 8, 25));
      System.out.println(distance(3, 7, 7, 4));
      System.out.println(distance(0, 0, 0, 0));
      System.out.println(distance(1, 2, 6, 14));
      System.out.println(distance(2, 2, 8, 2));
      System.out.println(distance(3, 5, 3, 6));
      System.out.println(circleCircumference(1, 2, 2, 2));
      System.out.println(circleArea(1, 2, 4, 6));
      System.out.println(rectanglePerimeter(1, 2));
      System.out.println(rectangleArea(1, 2));
   }
}