package Task05;

import java.util.Scanner;

public class Menu {
    private static Menu instance = null;
    
    private Menu() {
        // private constructor to prevent outside instantiation
    }
    
    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
    
    public void show(Coord coord, Scanner scanner) {
        System.out.println("1. Set x-coordinate");
        System.out.println("2. Set y-coordinate");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter new x-coordinate: ");
                double newX = scanner.nextDouble();
                coord.setX(newX);
                System.out.println("Current coordinates: (" + coord.getX() + ", " + coord.getY() + ")");
                show(coord, scanner);
                break;

            case 2:
                System.out.println("Enter new y-coordinate: ");
                double newY = scanner.nextDouble();
                coord.setY(newY);
                System.out.println("Current coordinates: (" + coord.getX() + ", " + coord.getY() + ")");
                show(coord, scanner);
                break;

            case 3:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice, try again");
                show(coord, scanner);
                break;
        }
    }
}