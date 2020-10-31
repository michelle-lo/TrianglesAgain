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

    System.out.println("----distanceTo----");
    System.out.println(p1.distanceTo(p2)); //2.828
    System.out.println("----equals----");
    System.out.println(p1.equals(p2)); //false
    System.out.println(p1.equals(p1_2)); //true


    Triangles t1 = new Triangles (p1, p2, p3);
    Triangles t2 = new Triangles (p4, p5, p6);
    //Triangle t2 = new Triangle (3, 4);
    //Triangle t3 = new Triangle (4, 2);
    System.out.println("----getPerimeter----");
    System.out.println(t1.getPerimeter()); //8.064
    System.out.println(t2.getPerimeter()); //16.502
    System.out.println("----getArea----");
    System.out.println(t1.getArea()); //around 3
    System.out.println(t2.getArea()); //12.5




  }
  //public static String printcheck (String name, Object actual, Object expected) {

  //}
}
