package Task02;

import java.io.*;
/**
 * Клас для знаходження рішення задачі.
 * Використовує агрегування для використання об'єкту класу MyClass.
 */
public class ProblemSolver {
  private MyClass myClass;
  
  /**
   * Конструктор класу.
   * @param param1 параметр 1.
   * @param param2 параметр 2.
   */
  public ProblemSolver(int param1, String param2) {
      this.myClass = new MyClass(param1, param2);
  }
  
  /**
   * Метод для отримання результату обчислень.
   * @return результат обчислень.
   */
  public double getResult() {
      return myClass.getResult();
  }
  
  // інші методи для розв'язування задачі
}
