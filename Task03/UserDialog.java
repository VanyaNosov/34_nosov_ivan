package Task03;

import java.util.Scanner;

public class UserDialog {
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
        fabricator.display();
    }
}

