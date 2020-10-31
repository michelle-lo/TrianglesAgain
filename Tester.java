public class Tester {
  public static void main (String[] args) {
    Point p1 = new Point (1, 2);
    Point p2 = new Point (3, 4);
    Point p3 = new Point (1, 2);

    System.out.println("----distanceTo----");
    System.out.println(p1.distanceTo(p2)); //2.828
    System.out.println("----equals----");
    System.out.println(p1.equals(p2)); //false
    System.out.println(p1.equals(p3)); //true
  }

}
