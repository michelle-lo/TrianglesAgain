public class Triangles {
  private Point v1, v2, v3;

  public Triangles(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangles(double x1, double y1,double x2, double y2,double x3, double y3) {
    v1 = new Point (x1, y1);
    v2 = new Point (x2, y2);
    v3 = new Point (x3, y3);
  }

  //Return the perimeter without any rounding.
  public double getPerimeter() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    return a + b + c;
  }

  //Return the area using Heron's formula without any rounding.
  public double getArea() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);

    double semiP = getPerimeter() / 2;

    return Math.sqrt((semiP * (semiP - a) * (semiP - b) * (semiP - c)));
  }

  //Return the "equilateral" "isosceles" or "scalene"
  //Round distances to the nearest tenthousandths for your classifications.
  public String classify() {
    double A = (Math.round(v1.distanceTo(v2) * 10000)) / 10000.0;
    return "" + A;
  }

/*
  public String toString()
       The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
  */



}
