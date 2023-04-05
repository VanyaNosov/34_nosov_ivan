package Task02;

public class Main {
  public static void main(String[] args) {
      CoordSolver solver = new CoordSolver(10, Math.PI / 4, 2);
      Coord coord = solver.solve();
      System.out.println(coord);

      CoordDemo.main(args);
  }
}

