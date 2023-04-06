package Task04;

import java.io.*;

/**
 * Demonstrates serialization and deserialization of Coord objects.
 */

 import java.io.*;
import java.util.Scanner;

public class CoordDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
Coord coord = solver.solve();
CoordDisplay display = new TextCoordDisplay();
display.display(coord);

scss
Copy code
    System.out.println("Enter column names separated by commas:");
    String[] columnNames = scanner.nextLine().split(",");
    display.displayTable(coord, columnNames);
}
}

File 8: Main.java
No changes needed.




Vanya Nosov
Add the ability for the user to enter data for v0 alpha t
To add the ability for the user to enter data for v0, alpha, and t, we need to modify the UserDialog class. Here's the updated code:

Java file: UserDialog.java

java
Copy code
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
        
        // Instantiate the table display and call the display method
        TableDisplay tableDisplay = new TextTableDisplay();
        tableDisplay.display(coord);
    }
}
We've added code to prompt the user for the values of v0, alpha, and t, create the CoordSolver and Coord objects based on these values, and then display the results using a TableDisplay object. Note that we've added a call to the display method of TableDisplay, passing in the Coord object.

Now we need to create the TableDisplay interface and a concrete implementation called TextTableDisplay.

Java file: TableDisplay.java

java
Copy code
public interface TableDisplay {
    void display(Coord coord);
}
Java file: TextTableDisplay.java

java
Copy code
import java.util.Scanner;

public class TextTableDisplay implements TableDisplay {

    public void display(Coord coord) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows for the table: ");
        int numRows = scanner.nextInt();

        System.out.println("Enter number of columns for the table: ");
        int numCols = scanner.nextInt();

        double deltaX = coord.getX() / numCols;
        double deltaY = coord.getY() / numRows;

        System.out.print("+");
        for (int i = 0; i < numCols; i++) {
            System.out.print("---+");
        }
        System.out.println();

        for (int i = numRows; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < numCols; j++) {
                double x = j * deltaX;
                double y = coord.getY() - i * deltaY;

                if (y < 0) {
                    System.out.print("   |");
                } else if (Math.abs(y - coord.getY()) < deltaY / 2 && Math.abs(x - coord.getX()) < deltaX / 2) {
                    System.out.print(" X |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
            System.out.print("+");
            for (int j = 0; j < numCols; j++) {
                System.out.print("---+");
            }
            System.out.println();
        }
    }
}
Here, we've defined the TextTableDisplay class to implement the TableDisplay interface. The display method prompts the user for the number of rows and columns to use in the table, and then computes the size of each cell based on the dimensions of the Coord object. It then iterates over each cell in the table and determines whether it should contain an X to represent the



public void displayTable(Coord coord, String[] headers) {
    System.out.format("<table><thead><tr>");
    for (String header : headers) {
        System.out.format("<th>%s</th>", header);
    }
    System.out.format("</tr></thead><tbody><tr>");
    System.out.format("<td>%f</td><td>%f</td>", coord.getX(), coord.getY());
    System.out.format("</tr></tbody></table>");
}
This method takes a Coord object and an array of String headers as arguments. It formats and prints a HTML table with the Coord object's x and y values under the headers specified in the headers array.







//  import java.util.Scanner;

// public class CoordDemo {
//     public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.println("Enter initial velocity: ");
//             double v0 = scanner.nextDouble();
        
//             System.out.println("Enter launch angle (in radians): ");
//             double alpha = scanner.nextDouble();
        
//             System.out.println("Enter time of flight: ");
//             double t = scanner.nextDouble();
        
//             System.out.println("Enter number of rows in table: ");
//             int rows = scanner.nextInt();
        
//             System.out.println("Enter number of columns in table: ");
//             int cols = scanner.nextInt();
        
//             CoordSolver solver = CoordFactory.createSolver(v0, alpha, t);
//             Coord coord = solver.solve();
        
//             System.out.println("Result:");
//             System.out.println(coord);
        
//             CoordDisplay display = new TableCoordDisplay(rows, cols);
//             display.display(coord);
//     }
// }

// import java.io.*;
// import java.util.Scanner;

// public class CoordDemo {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
// Coord coord = solver.solve();
// CoordDisplay display = new TextCoordDisplay();
// display.display(coord);

//     System.out.println("Enter column names separated by commas:");
//     String[] columnNames = scanner.nextLine().split(",");
//     display.displayTable(coord, columnNames);
// }
// }

// public class CoordDemo {
//     public static void main(String[] args) {
//         CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
//         Coord coord = solver.solve();
//         CoordDisplay display = new TextCoordDisplay();
//         display.display(coord);
//     }
// }

// import java.io.*;
// import java.util.Scanner;

// public class CoordDemo {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
// Coord coord = solver.solve();
// CoordDisplay display = new TextCoordDisplay();
// display.display(coord);
//     System.out.println("Enter column names separated by commas:");
//     String[] columnNames = scanner.nextLine().split(",");
//     display.displayTable(coord, columnNames);
// }
// }
// import java.io.*;
// import java.util.Scanner;

// public class CoordDemo {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
// Coord coord = solver.solve();
// CoordDisplay display = new TextCoordDisplay();
// display.display(coord);

// scss
// Copy code
//     System.out.println("Enter column names separated by commas:");
//     String[] columnNames = scanner.nextLine().split(",");
//     display.displayTable(coord, columnNames);
// }
// }

// File 8: Main.java
// No changes needed.




// Vanya Nosov
// Add the ability for the user to enter data for v0 alpha t
// To add the ability for the user to enter data for v0, alpha, and t, we need to modify the UserDialog class. Here's the updated code:

// Java file: UserDialog.java

// java
// Copy code
// import java.util.Scanner;

// public class UserDialog {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter initial velocity: ");
//         double v0 = scanner.nextDouble();

//         System.out.println("Enter launch angle (in radians): ");
//         double alpha = scanner.nextDouble();

//         System.out.println("Enter time of flight: ");
//         double t = scanner.nextDouble();

//         CoordSolver solver = CoordFactory.createSolver(v0, alpha, t);
//         Coord coord = solver.solve();

//         System.out.println("Result:");
//         System.out.println(coord);

//         // Instantiate the fabricator and call the display method
//         ResultFabricator fabricator = new ProjectileResultFabricator(coord);
//         fabricator.display();
        
//         // Instantiate the table display and call the display method
//         TableDisplay tableDisplay = new TextTableDisplay();
//         tableDisplay.display(coord);
//     }
// }
// We've added code to prompt the user for the values of v0, alpha, and t, create the CoordSolver and Coord objects based on these values, and then display the results using a TableDisplay object. Note that we've added a call to the display method of TableDisplay, passing in the Coord object.

// Now we need to create the TableDisplay interface and a concrete implementation called TextTableDisplay.

// Java file: TableDisplay.java

// java
// Copy code
// public interface TableDisplay {
//     void display(Coord coord);
// }
// Java file: TextTableDisplay.java

// java
// Copy code
// import java.util.Scanner;

// public class TextTableDisplay implements TableDisplay {

//     public void display(Coord coord) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter number of rows for the table: ");
//         int numRows = scanner.nextInt();

//         System.out.println("Enter number of columns for the table: ");
//         int numCols = scanner.nextInt();

//         double deltaX = coord.getX() / numCols;
//         double deltaY = coord.getY() / numRows;

//         System.out.print("+");
//         for (int i = 0; i < numCols; i++) {
//             System.out.print("---+");
//         }
//         System.out.println();

//         for (int i = numRows; i >= 0; i--) {
//             System.out.print("|");
//             for (int j = 0; j < numCols; j++) {
//                 double x = j * deltaX;
//                 double y = coord.getY() - i * deltaY;

//                 if (y < 0) {
//                     System.out.print("   |");
//                 } else if (Math.abs(y - coord.getY()) < deltaY / 2 && Math.abs(x - coord.getX()) < deltaX / 2) {
//                     System.out.print(" X |");
//                 } else {
//                     System.out.print("   |");
//                 }
//             }
//             System.out.println();
//             System.out.print("+");
//             for (int j = 0; j < numCols; j++) {
//                 System.out.print("---+");
//             }
//             System.out.println();
//         }
//     }
// }
// Here, we've defined the TextTableDisplay class to implement the TableDisplay interface. The display method prompts the user for the number of rows and columns to use in the table, and then computes the size of each cell based on the dimensions of the Coord object. It then iterates over each cell in the table and determines whether it should contain an X to represent the




// Vanya Nosov
// The type TextCoordDisplay must implement the inherited abstract method CoordDisplay.displayTable(Coord, String[])

// 2 / 2

// To extend the CoordDisplay interface, we need to add a new method `displayTable(Coord coord




// Vanya Nosov
// The type TextCoordDisplay must implement the inherited abstract method CoordDisplay.displayTable(Coord, String[])
// To implement the displayTable method in TextCoordDisplay class, add the following code:

// css
// Copy code
// public void displayTable(Coord coord, String[] headers) {
//     System.out.format("<table><thead><tr>");
//     for (String header : headers) {
//         System.out.format("<th>%s</th>", header);
//     }
//     System.out.format("</tr></thead><tbody><tr>");
//     System.out.format("<td>%f</td><td>%f</td>", coord.getX(), coord.getY());
//     System.out.format("</tr></tbody></table>");
// }
// This method takes a Coord object and an array of String headers as arguments. It formats and prints a HTML table with the Coord object's x and y values under the headers specified in the headers array.






// public class CoordDemo {
//     public static void main(String[] args) {
//         CoordSolver solver = CoordFactory.createSolver(10, Math.PI / 4, 2);
//         Coord coord = solver.solve();
//         CoordDisplay display = new TextCoordDisplay();
//         display.display(coord);
//     }
// }

