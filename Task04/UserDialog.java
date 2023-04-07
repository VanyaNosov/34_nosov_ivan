package Task04;

import java.util.Scanner;

public class UserDialog {
  // class fields and methods
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter initial velocity: ");
    double v0 = scanner.nextDouble();

    System.out.println("Enter launch angle (in radians): ");
    double alpha = scanner.nextDouble();

    System.out.println("Enter time of flight: ");
    double t = scanner.nextDouble();

    CoordSolver solver = CoordFactory.createSolver(v0, alpha, t);
    Coord coord = solver.solve();

    System.out.println("Result:");
    System.out.println(coord);

    // Instantiate the fabricator and call the display method
    ResultFabricator fabricator = new ProjectileResultFabricator(coord);

    // Ask user for table parameters
    System.out.println("Enter number of rows in table: ");
    int numRows = scanner.nextInt();
    System.out.println("Enter number of columns in table: ");
    int numCols = scanner.nextInt();

    // Create column headers array
    String[] colHeaders = new String[numCols];
    for (int i = 0; i < numCols; i++) {
        System.out.println("Enter column header for column " + (i+1) + ": ");
        colHeaders[i] = scanner.next();
    }

    // Call displayTable method with user-defined parameters
    TableCoordDisplay display = new TableCoordDisplay();
    display.displayTable(coord, colHeaders);
  }
}