package Task05;

import java.io.*;

/**
 * Demonstrates serialization and deserialization of Coord objects.
 */

import java.io.*;
import java.util.Scanner;

public class CoordDemo {
    public static void main(String[] args) {
        CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
        Coord coord = solver.solve();
        CoordDisplay display = new TextCoordDisplay();
        display.display(coord);
    }
}