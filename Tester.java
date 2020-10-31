public class Tester {
  public static void main (String[] args) {
    Point p1 = new Point (1, 2);
    Point p2 = new Point (3, 4);

    System.out.println("----distanceTo----");
    System.out.println(p1.distanceTo(p2)); //2.828
  }
}
