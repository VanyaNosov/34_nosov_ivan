package Task02;

import java.io.*;

/**
 * Клас для демонстрації в діалоговому режимі збереження та
 * відновлення стану об'єкта, використовуючи серіалізацію.
 */
public class Demo {
    private static final String FILE_NAME = "myClass.ser";
    
    /**
     * Метод для демонстрації серіалізації та збереження об'єкту в файл.
     */
    public static void serializeObject() {
        MyClass myClass = new MyClass(10, "test");
        try {
            FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myClass);
            out.close();
            fileOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
}

/**
 * Метод для демонстрації відновлення об'єкту з файлу та десеріалізації.
 */
public static void deserializeObject() {
    MyClass myClass = null;
    try {
        FileInputStream fileIn = new FileInputStream(FILE_NAME);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        myClass = (MyClass) in.readObject();
        in.close();
        fileIn.close();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    
    // демонстрація використання отриманого об'єкту
    System.out.println("Param1: " + myClass.getParam1());
    System.out.println("Param2: " + myClass.getParam2());
    System.out.println("Result: " + myClass.getResult());
}
}