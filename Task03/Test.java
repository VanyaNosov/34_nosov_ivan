package Task03;

public class Test {
    public static void main(String[] args) {
      CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
      Coord coord = solver.solve();
      
      CoordDisplay display = new TextCoordDisplay();
      display.display(coord);
    }
}