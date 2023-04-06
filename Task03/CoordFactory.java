package Task03;

public class CoordFactory {
  public static CoordSolver createSolver(double v0, double alpha, double t) {
      return new ConcreteCoordSolver(v0, alpha, t);
  }
}

