package Task03;

public class ConcreteCoordSolver extends CoordSolver {
  public ConcreteCoordSolver(double v0, double alpha, double t) {
      super(v0, alpha, t);
  }

  @Override
  public Coord solve() {
      return new Coord(v0, alpha, t);
  }
}
