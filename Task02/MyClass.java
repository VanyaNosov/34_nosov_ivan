package Task02;

import java.io.Serializable;
import java.io.*;

/**
 * Клас для серіалізації та зберігання параметрів та результатів обчислень.
 */
public class MyClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int param1;
    private String param2;
    private transient int result; // позначаємо поле transient, щоб не серіалізувалося

    public MyClass(int param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public int getResult() {
        return result;
    }

    /**
     * Метод для обчислення результату на основі параметрів.
     */
    public void computeResult() {
        result = calculateResult(param1, param2);
    }

    /**
     * Метод для знаходження результату задачі на основі параметрів.
     * @param param1 параметр 1
     * @param param2 параметр 2
     * @return результат
     */
    private int calculateResult(int param1, String param2) {
        // реалізація обчислень
        return param1 + param2.length();
    }

    /**
     * Метод для серіалізації та збереження об'єкту у файл.
     */
    public void serializeObject() {
        try {
            FileOutputStream fileOut = new FileOutputStream("myObject.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in myObject.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Метод для демонстрації відновлення об'єкту з файлу та десеріалізації.
     * @return відновлений об'єкт
     */
    public static MyClass deserializeObject() {
        MyClass myClass = null;
        try {
            FileInputStream fileIn = new FileInputStream("myObject.ser");
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
        System.out.println("Deserialized data:");
        System.out.println("Param1: " + myClass.getParam1());
        System.out.println("Param2: " + myClass.getParam2());
        System.out.println("Result: " + myClass.getResult());
        
        return myClass;
    }
}