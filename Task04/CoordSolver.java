package Task04;

/**
 * Factory class for Coord objects with given initial velocity, launch angle, and time elapsed.
 */

public abstract class CoordSolver {
  protected double v0;
  protected double alpha;
  protected double t;

  /**
     * Constructor for CoordSolver object with given initial velocity, launch angle, and time elapsed.
     *
     * @param v0    initial velocity
     * @param alpha angle of launch in radians
     * @param t     time elapsed
     */

  public CoordSolver(double v0, double alpha, double t) {
      this.v0 = v0;
      this.alpha = alpha;
      this.t = t;
  }

    /**
     * Creates and returns a Coord object with given initial velocity, launch angle, and time elapsed.
     *
     * @return Coord object
     */

  public abstract Coord solve();
}
