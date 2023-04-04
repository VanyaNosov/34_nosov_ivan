package Task01;

/**
* Print command-line parameters.
*/
public class Main {
  /**
  * Program entry point.
  * @param args command-line parameters list
  */
  public static void main(String[] args) {
      for (String arg: args) {
          System.out.println(arg);
      }
  }
}

// package Task02;

// import java.io.Serializable;

// public class Calculation implements Serializable {
//     private double param1;
//     private double param2;
//     private double result;

//     public Calculation(double param1, double param2) {
//         this.param1 = param1;
//         this.param2 = param2;
//         this.result = performCalculation(param1, param2);
//     }

//     private double performCalculation(double param1, double param2) {
//         // Реалізуйте обчислення тут
//         return param1 + param2;
//     }

//     public double getParam1() {
//         return param1;
//     }

//     public double getParam2() {
//         return param2;
//     }

//     public double getResult() {
//         return result;
//     }
// }
