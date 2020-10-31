//HW12
//November 11th, 2020

public class Point {
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  /* a) The distanceTo method returns the Euclidean distance
  from this point to the other point. Please DO NOT round. */
  public double distanceTo(Point other){
    double diff_x = other.getX() - x;
    double diff_y = other.getY() - y;
    return Math.sqrt((diff_x * diff_x) + (diff_y * diff_y));
  }

}
