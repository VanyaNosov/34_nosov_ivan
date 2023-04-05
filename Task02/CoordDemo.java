package Task02;

import java.io.*;

public class CoordDemo {
    public static void main(String[] args) {
        CoordSolver solver = new CoordSolver(10, Math.PI / 4, 2);
        Coord coord = solver.solve();

        // Serialize object to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("coord.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(coord);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in coord.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize object from a file
        try {
            FileInputStream fileIn = new FileInputStream("coord.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Coord coord2 = (Coord) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized data:");
            System.out.println(coord2);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Coord class not found");
            c.printStackTrace();
        }
    }
}
