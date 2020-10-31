public class Tester {
  public static void main (String[] args) {
    //triangle 2
    Point p1 = new Point (1, 2);
    Point p2 = new Point (3, 4);
    Point p1_2 = new Point (1, 2);
    Point p3 = new Point (4, 2);
    //triangle 2
    Point p4 = new Point (5,6);
    Point p5 = new Point (10,5);
    Point p6 = new Point (10,10);
    //triangle 3
    Point p7 = new Point (0.1, 0.1);
    Point p8 = new Point (-1.9, 0.1);
    Point p9 = new Point (-0.9, -1.632051);
    //triangle 4
    Point p10 = new Point (0, 0);
    Point p11 = new Point (1, 1);
    Point p12 = new Point (2, 0);


    System.out.println("----distanceTo----");
    System.out.println(p1.distanceTo(p2)); //2.828
    System.out.println("----equals----");
    System.out.println(p1.equals(p2)); //false
    System.out.println(p1.equals(p1_2)); //true


    Triangles t1 = new Triangles (p1, p2, p3);
    Triangles t2 = new Triangles (p4, p5, p6);
    Triangles t3 = new Triangles (p7, p8, p9);
    Triangles t4  = new Triangles (p10, p11, p12);
    //Triangle t2 = new Triangle (3, 4);
    //Triangle t3 = new Triangle (4, 2);
    System.out.println("----getPerimeter----");
    System.out.println(t1.getPerimeter()); //8.064
    System.out.println(t2.getPerimeter()); //16.502
    System.out.println("----getArea----");
    System.out.println(t1.getArea()); //around 3
    System.out.println(t2.getArea()); //12.5
    System.out.println("----classify----");
    System.out.println(t1.classify()); //scalene
    System.out.println(t2.classify()); //scalene
    System.out.println(t3.classify()); //equilateral
    System.out.println(t4.classify()); //isosceles
    System.out.println("----toString----");
    System.out.println(t1.toString()); //"v1(1.0, 2.0) v2(3.0, 4.0) v3(4.0, 2.0)"
    System.out.println(t3.toString()); //"v1(0.1, 0.1) v2(-1.9, 0.1) v3(-0.9, -1.632051)"
    System.out.println("----setVertex----");
    System.out.println("orig: " + t1.toString());
    t1.setVertex(0, p4);
    System.out.println("new: " + t1.toString()); //"new: v1(5, 6)..."
    t1.setVertex(1, p4);
    System.out.println("new: " + t1.toString()); //"new: v2(5, 6)..."
    t1.setVertex(2, p4);
    System.out.println("new: " + t1.toString()); //"new: v3(5, 6)..."
    t1.setVertex(3, p4);
    System.out.println("new: " + t1.toString()); //"new: no change"


  }
  /*
  public static void print (String method; int[] actual; Object expected) {

  }
  */

}
