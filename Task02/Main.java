package Task02;

import java.io.*;

public class Main {
  public static void main(String[] args) {
      // демонстрація серіалізації та збереження об'єкту в файл
      Demo.serializeObject();
      
      // демонстрація відновлення об'єкту з файлу та десеріалізації
      Demo.deserializeObject();
      
      // демонстрація використання класу ProblemSolver
      ProblemSolver problemSolver = new ProblemSolver(10, "test");
      System.out.println("Result: " + problemSolver.getResult());
  }
}

