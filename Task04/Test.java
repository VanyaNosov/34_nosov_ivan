package Task04;

public class Test {
  // class fields and methods
  public static void main(String[] args) {
    CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
    Coord coord = solver.solve();
    
    CoordDisplay display = new TextCoordDisplay();
    display.display(coord);

    String[] tableParams = {"x", "y", "v0", "alpha", "t"};
    CoordDisplay tableDisplay = new TableCoordDisplay();
    tableDisplay.displayTable(coord, tableParams);
  }
}