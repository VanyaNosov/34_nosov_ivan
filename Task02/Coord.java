package Task02;

import java.io.Serializable;

public class Coord implements Serializable {
    private double x;
    private double y;
    private double v0;
    private double alpha;
    private double t;

    public Coord(double v0, double alpha, double t) {
        this.v0 = v0;
        this.alpha = alpha;
        this.t = t;
        this.x = v0 * Math.cos(alpha) * t;
        this.y = v0 * Math.sin(alpha) * t - (9.81 * t * t) / 2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getV0() {
        return v0;
    }

    public double getAlpha() {
        return alpha;
    }

    public double getT() {
        return t;
    }

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

