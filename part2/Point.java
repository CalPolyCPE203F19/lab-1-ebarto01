import java.lang.Math;

public class Point
{

   private double x;
   private double y;

   public Point(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public double getX() { return x; }
   // gets the x coordinate   

   public double getY() { return y; }
   // gets the y coordinate

   public double getRadius() 
   {
      double radius = Math.sqrt((x * x) + (y * y));
      return radius;
   }
   // gets the distance from the origin to Point

   public double getAngle()
   {
      double angle = Math.atan((x  / y ));
      return angle;
   }
   // returns the angle (radians) from the x-axis (in the range of -pi to pi)

   //public Point rotate90()
   // returns a newly created Point representing a 90 degree rotation of this
   // point about the origin


}
