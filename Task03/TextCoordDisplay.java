package Task03;

public class TextCoordDisplay implements CoordDisplay {
  public void display(Coord coord) {
      System.out.println("x: " + coord.getX());
      System.out.println("y: " + coord.getY());
  }
}
