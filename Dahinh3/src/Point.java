public class Point {
    private double pointX;
    private double pointY;

    /** Point constructor. */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /** Javadoc. */
    public double getPointX() {
        return pointX;
    }

    /** Javadoc. */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /** Javadoc. */
    public double getPointY() {
        return pointY;
    }

    /** Javadoc. */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /** Javadoc. */
    public double distance(Point newPoint) {
        double dx = newPoint.pointX - this.pointX;
        double dy = newPoint.pointY - this.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /** Javadoc. */
    public boolean equals(Object o) {
        if (this.distance((Point) o) <= 0.001) {
            return true;
        }
        return false;
    }

    /** Javadoc. */
    public int hashCode() {
        int result;
        long tmp;
        tmp = Double.doubleToLongBits(pointX);
        result = (int) (tmp ^ (tmp >>> 32));
        tmp = Double.doubleToLongBits(pointY);
        result = 31 * result + (int) (tmp ^ (tmp >>> 32));
        return result;
    }

    /** Javadoc. */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
