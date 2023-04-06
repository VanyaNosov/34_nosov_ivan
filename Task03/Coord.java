package Task03;

import java.io.Serializable;

/**
 * Represents a point in 2D space with additional parameters for projectile motion.
 */

public class Coord implements Serializable {
    private double x;       // x-coordinate
    private double y;       // y-coordinate
    private double v0;      // initial velocity
    private double alpha;   // angle of launch
    private double t;       // time elapsed

    /**
     * Constructor for Coord object with given initial velocity, launch angle, and time elapsed.
     *
     * @param v0    initial velocity
     * @param alpha angle of launch in radians
     * @param t     time elapsed
     */

    public Coord(double v0, double alpha, double t) {
        this.v0 = v0;
        this.alpha = alpha;
        this.t = t;
        this.x = v0 * Math.cos(alpha) * t;
        this.y = v0 * Math.sin(alpha) * t - (9.81 * t * t) / 2;
    }

     /**
     * Returns the x-coordinate of the Coord object.
     *
     * @return x-coordinate
     */
    public double getX() {
        return x;
    }
    /**
     * Returns the y-coordinate of the Coord object.
     *
     * @return y-coordinate
     */
    public double getY() {
        return y;
    }
    /**
     * Returns the initial velocity of the Coord object.
     *
     * @return initial velocity
     */
    public double getV0() {
        return v0;
    }
     /**
     * Returns the angle of launch in radians of the Coord object.
     *
     * @return angle of launch in radians
     */
    public double getAlpha() {
        return alpha;
    }
     /**
     * Returns the time elapsed of the Coord object.
     *
     * @return time elapsed
     */
    public double getT() {
        return t;
    }
    /**
     * Returns a string representation of the Coord object.
     *
     * @return string representation of the Coord object
     */

    @Override

    public String toString() {
        return "Coord{" +
                "x=" + x +
                ", y=" + y +
                ", v0=" + v0 +
                ", alpha=" + alpha +
                ", t=" + t +
                '}';
    }
}
