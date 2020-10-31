public class Triangles {
  private v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
    v1 = new Point (x1, y1);
    v2 = new Point (x2, y2);
    v3 = new Point (x3, y3);
  }


  /*
  a) Three points.
 private Point v1, v2, v3;

 b) Two constructors constructors :
  public Triangle(Point a, Point b, Point c)
     Points are immutable, so you can just store the reference, no copy needed.

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3)
    Make new points out of the doubles to store in the instance variables.
    */
}
