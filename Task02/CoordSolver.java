package Task02;

public class CoordSolver {
  private double v0;
  private double alpha;
  private double t;

  public CoordSolver(double v0, double alpha, double t) {
      this.v0 = v0;
      this.alpha = alpha;
      this.t = t;
  }

  public Coord solve() {
      return new Coord(v0, alpha, t);
  }
}
